package ModelClasses;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pagamento {
    private int id;
    private Pedido pedido;
    private BigDecimal valorPago;
    private String tipePagamente;
    private String status;
    private LocalDateTime dataPagamento;

}
