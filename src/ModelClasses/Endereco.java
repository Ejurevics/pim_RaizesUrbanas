package ModelClasses;

import java.util.Scanner;

public class Endereco {
    private int id;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    Scanner scanner = new Scanner(System.in);

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public void inserirEnd(){
        Endereco endCliente1 = new Endereco();
        System.out.println("-> Digite o endereço de entrega <-");
        System.out.print("CEP: ");
        endCliente1.setCep(scanner.nextLine());
        System.out.print("Rua: ");
        endCliente1.setRua(scanner.nextLine());
        System.out.print("Número: ");
        endCliente1.setNumero(scanner.nextLine());
        System.out.print("Complemento: ");
        endCliente1.setComplemento(scanner.nextLine());
        System.out.printf("");
    }

    public void imprimirEndereco(){
        System.out.println("");
        System.out.println("===== Endereço de entrega =====");
        System.out.println("CEP: " + getCep());
        System.out.println("Rua: " + getRua());
        System.out.println("Número: " + getNumero());
        System.out.println("Complemento: " + getComplemento());

    }

}

