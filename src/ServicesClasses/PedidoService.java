package ServicesClasses;

import ModelClasses.Pedido;
import ModelClasses.Status;
import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    private List<Pedido> pedidos = new ArrayList<>();
    private int nextId = 1;

    public Pedido criarPedido(Pedido carrinho) {

        Pedido pedido = new Pedido(
                nextId++,
                carrinho.getCliente(),
                carrinho.getItens(),
                carrinho.getEnderecoEntrega(),
                carrinho.getValorTotal(),
                carrinho.getFrete(),
                carrinho.getDataPedido(),
                new Status("Em andamento")
        );

        pedidos.add(pedido);
        return pedido;
    }

    public void cancelarPedido(int idPedido) {
        pedidos.removeIf(pedido -> pedido.getId() == idPedido);
    }

    public void atualizarStatus(int idPedido, Status status) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == idPedido) {
                pedido.setStatusPedido(status);
                break;
            }
        }
    }

    public List<Pedido> listarPedidosPorCliente(int idCliente) {
        List<Pedido> pedidosCliente = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getCliente().getId() == idCliente) {
                pedidosCliente.add(pedido);
            }
        }
        return pedidosCliente;
    }
}
