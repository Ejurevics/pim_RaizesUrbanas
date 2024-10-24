package ModelClasses;

import java.util.List;
import java.util.Scanner;

public class Cliente {
    private static int contadorId = 0;
    private int id;
    private String nome;
    private String login;
    private String email;
    private String senha;
    private String telefone;
    private Endereco endereco;

    Scanner scanner = new Scanner(System.in);

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLogin() { return login; }
    public void setlogin(String login) { this.login = login; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    // Obter dados do cliente e inserir no BD
    public void inserirCliente (){
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

        // Atribui endereco ao cliente
        Endereco endCliente1 = new Endereco();
        endCliente1.inserirEnd();
        this.setEndereco(endCliente1);
    }

    // Mostra as informacoes do cliente
    public void imprimirCliente(){
        System.out.println("");
        System.out.println("===== Informações do Cliente =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        //System.out.println("Endereço de entrega: " + getEnderecos()); teste1
    }
}


