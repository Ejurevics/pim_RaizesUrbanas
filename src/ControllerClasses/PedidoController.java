package ControllerClasses;

import ModelClasses.Pedido;
import ServicesClasses.PedidoService;

import java.util.List;

public class PedidoController {
    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public void realizarPedido(Pedido pedido) {
        pedidoService.criarPedido(pedido);
    }

    public List<Pedido> visualizarPedidos(int clienteId) {
        return pedidoService.listarPedidosPorCliente(clienteId);
    }
}

