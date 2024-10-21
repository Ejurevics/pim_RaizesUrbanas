package DaoClasses;

import ModelClasses.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    private List<Pedido> pedidos = new ArrayList<>();

    public void salvarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> listarPedidosPorCliente(int clienteId) {
        List<Pedido> pedidosCliente = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getCliente().getId() == clienteId) {
                pedidosCliente.add(pedido);
            }
        }
        return pedidosCliente;
    }
}

