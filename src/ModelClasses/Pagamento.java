package ModelClasses;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class    Pagamento {
    private int id;
    private Pedido pedido;
    private BigDecimal valorPago;
    private TipoPagamento tipoPagamento;
    private Status statusPagamento;  // Usando a classe Status
    private LocalDateTime dataPagamento;

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido pedido) { this.pedido = pedido; }

    public BigDecimal getValorPago() { return valorPago; }
    public void setValorPago(BigDecimal valorPago) { this.valorPago = valorPago; }

    public TipoPagamento getTipoPagamento() { return tipoPagamento; }
    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Status getStatusPagamento() { return statusPagamento; }
    public void setStatusPagamento(Status statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public LocalDateTime getDataPagamento() { return dataPagamento; }
    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}

