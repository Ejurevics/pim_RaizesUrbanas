package DaoClasses;

import ModelClasses.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();

    public void salvarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarPorEmail(String email) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente autenticar(String email, String senha) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email) && cliente.getSenha().equals(senha)) {
                return cliente;
            }
        }
        return null;
    }
}

