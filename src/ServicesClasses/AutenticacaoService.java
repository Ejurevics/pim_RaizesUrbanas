package ServicesClasses;

import ModelClasses.Cliente;

import java.util.ArrayList;
import java.util.List;

public class AutenticacaoService {
    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente loginCliente(String email, String senha) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email) && cliente.getSenha().equals(senha)) {
                return cliente;
            }
        }
        return null;
    }

    public void logout() {

    }
}

