package DaoClasses;

import ModelClasses.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    private static String connectionString = "jdbc:sqlserver://<hostname>:<port>;databaseName=<database_name>;integratedSecurity=true;"; //atualizar conexao

    // Método para inserir cliente no banco de dados
    public static void inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO Cliente (Nome, Login, Email, Senha, Telefone, Rua, Bairro, Cidade, Estado, Cep, Numero, Complemento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(connectionString);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getLogin());
            pstmt.setString(3, cliente.getEmail());
            pstmt.setString(4, cliente.getSenha());
            pstmt.setString(5, cliente.getTelefone());
            pstmt.setString(6, cliente.getEndereco().getRua());
            pstmt.setString(7, cliente.getEndereco().getBairro());
            pstmt.setString(8, cliente.getEndereco().getCidade());
            pstmt.setString(9, cliente.getEndereco().getEstado());
            pstmt.setString(10, cliente.getEndereco().getCep());
            pstmt.setString(11, cliente.getEndereco().getNumero());
            pstmt.setString(12, cliente.getEndereco().getComplemento());

            pstmt.executeQuery();//.executeUpdate();
            System.out.println("Cliente inserido com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        }
    }

    // Método para buscar um cliente pelo ID (exemplo)
    public Cliente buscarClientePorId(int id) {
        // Implementar lógica de busca
        return null; // Retornar cliente encontrado ou null
    }

    // Método para atualizar dados do cliente (exemplo)
    public void atualizarCliente(Cliente cliente) {
        // Implementar lógica de atualização
    }

    // Método para excluir um cliente (exemplo)
    public void excluirCliente(int id) {
        // Implementar lógica de exclusão
    }
}
