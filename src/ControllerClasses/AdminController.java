/*package ControllerClasses;

import java.util.ArrayList;
import java.util.List;
import ModelClasses.Cliente;
import ModelClasses.Produto;
import ModelClasses.Pedido;
import ModelClasses.Status;  // Certifique-se de que o enum Status está no pacote ModelClasses

public class AdminController {

    private List<Cliente> clientes;
    private List<Produto> produtos;
    private List<Pedido> pedidos;

    // Construtor
    public AdminController() {
        this.clientes = new ArrayList<>();
        this.produtos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    // Métodos para gerenciar clientes
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente " + cliente.getNome() + " adicionado com sucesso.");
    }

    public void removerCliente(Cliente cliente) {
        if (clientes.remove(cliente)) {
            System.out.println("Cliente " + cliente.getNome() + " removido com sucesso.");
            System.out.println("Cliente " + cliente.getNome() + " não encontrado.");
        }
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    // Métodos para gerenciar produtos
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado com sucesso.");
    }

    public void removerProduto(Produto produto) {
        if (produtos.remove(produto)) {
            System.out.println("Produto " + produto.getNome() + " removido com sucesso.");
        } else {
            System.out.println("Produto " + produto.getNome() + " não encontrado.");
        }
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    // Métodos para gerenciar pedidos
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido " + pedido.getId() + " adicionado com sucesso.");
    }

    public void processarPedido(Pedido pedido) {
        if (pedidos.contains(pedido)) {
            pedido.setStatusPedido(Status.PROCESSANDO);  // Assumindo que Status enum tem PROCESSANDO
            System.out.println("Pedido " + pedido.getId() + " está sendo processado.");
        } else {
            System.out.println("Pedido " + pedido.getId() + " não encontrado.");
        }
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }
}*/