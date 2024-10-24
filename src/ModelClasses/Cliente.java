package ModelClasses;

import java.util.List;

public class Cliente {
    private static int contadorId = 0;
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private List<Endereco> enderecos;

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public List<Endereco> getEnderecos() { return enderecos; }
    public void setEnderecos(List<Endereco> enderecos) { this.enderecos = enderecos; }

    public void imprimirCliente(){
        System.out.println("");
        System.out.println("===== Informções do Cliente =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        //System.out.println("Endereço de entrega: " + getEnderecos());
    }

}


