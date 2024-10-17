package ModelClasses;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    private int id;
    private Cliente cliente;
    private ArrayList<ItemCarrinho> itens;
    private Endereco enderecoEntrega;
    private BigDecimal valorTotal;
    private BigDecimal frete;
    private LocalDateTime dataPedido;
    private String status;

}
