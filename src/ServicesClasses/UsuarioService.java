package ServicesClasses;

import ModelClasses.Cliente;
import ModelClasses.Endereco;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Scanner;

public class UsuarioService {
    Scanner scanner = new Scanner(System.in);

    // Obter dados do cliente
    public Cliente inserirCliente() {
        Cliente cliente1 = new Cliente();
        System.out.println("==== Cadastrar Login ====");
        System.out.print("Digite o nome completo: ");
        cliente1.setNome(scanner.nextLine());
        System.out.print("Digite seu login: ");
        cliente1.setlogin(scanner.nextLine());
        System.out.print("Digite seu email: ");
        cliente1.setEmail(scanner.nextLine());
        System.out.print("Digite sua senha: ");
        cliente1.setSenha(scanner.nextLine());
        System.out.print("Digite seu telefone: ");
        cliente1.setTelefone(scanner.nextLine());

        Endereco endCliente1 = inserirEnd();
        cliente1.setEndereco(endCliente1);

        return cliente1;
    }

    // Obter dados do endereco
    public Endereco inserirEnd() {
        Endereco endCliente1 = new Endereco();
        System.out.println("-> Digite o endereço de entrega <-");
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        endCliente1.setCep(cep);

        // Buscar o endereço utilizando o CEP informado
        Endereco enderecoCompleto = buscarEnderecoPorCep(cep);
        if (enderecoCompleto != null) {
            // Se o endereço foi encontrado, preenche os dados
            endCliente1.setRua(enderecoCompleto.getRua());
            endCliente1.setBairro(enderecoCompleto.getBairro());
            endCliente1.setCidade(enderecoCompleto.getCidade());
            endCliente1.setEstado(enderecoCompleto.getEstado());
        } else {
            // Se não encontrar, solicita os dados manualmente
            System.out.println("Endereço não encontrado. Você pode digitar os dados manualmente.");
            System.out.print("Rua: ");
            endCliente1.setRua(scanner.nextLine());
            System.out.print("Bairro: ");
            endCliente1.setBairro(scanner.nextLine());
            System.out.print("Cidade: ");
            endCliente1.setCidade(scanner.nextLine());
            System.out.print("Estado: ");
            endCliente1.setEstado(scanner.nextLine());
        }

        // Coleta o número e o complemento
        System.out.print("Número: ");
        endCliente1.setNumero(scanner.nextLine());
        System.out.print("Complemento: ");
        endCliente1.setComplemento(scanner.nextLine());

        return endCliente1;
    }

    private Endereco buscarEnderecoPorCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(url);
            try (CloseableHttpResponse response = client.execute(request)) {
                // Verifica o código de status da resposta
                if (response.getCode() != 200) {
                    System.out.println("Erro na requisição: " + response.getCode());
                    return null;
                }

                String jsonResponse = EntityUtils.toString(response.getEntity());
                ObjectMapper objectMapper = new ObjectMapper();
                Endereco endereco = objectMapper.readValue(jsonResponse, Endereco.class);

                // Verifica se o retorno é válido (não contém erro)
                if (endereco.getRua() != null) {
                    return endereco;
                } else {
                    System.out.println("Endereço não encontrado.");
                    return null;
                }
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            System.out.println("Erro ao consultar o CEP: " + e.getMessage());
            return null;
        }
    }

    // Mostra as informacoes do cliente
    public void imprimirCliente(Cliente cliente1) {
        System.out.println("");
        System.out.println("===== Informações do Cliente =====");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Telefone: " + cliente1.getTelefone());

        Endereco end = cliente1.getEndereco();

        System.out.println("Endereço de entrega: " +
                end.getRua() + ", " +
                end.getNumero() +
                (end.getComplemento() != null && !end.getComplemento().isEmpty() ? " - " + end.getComplemento() : "") +
                ", " + end.getBairro() + ", " +
                end.getCidade() + " - " +
                end.getEstado() + ", " +
                end.getCep());
    }


}

