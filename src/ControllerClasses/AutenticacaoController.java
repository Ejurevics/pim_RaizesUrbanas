package ControllerClasses;

import ModelClasses.Cliente;
import ServicesClasses.AutenticacaoService;

public class AutenticacaoController {
    private AutenticacaoService autenticacaoService;

    public AutenticacaoController(AutenticacaoService autenticacaoService) {
        this.autenticacaoService = autenticacaoService;
    }


    public Cliente loginCliente(String email, String senha) {
        return autenticacaoService.loginCliente(email, senha);
    }


    public void cadastrarCliente(Cliente cliente) {
        autenticacaoService.cadastrarCliente(cliente);
    }


    public void logout() {
        autenticacaoService.logout();
    }
}

