package ModelClasses;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private int id;
    private List<ItemCarrinho> itens;
    private BigDecimal valorTotal;

    // Construtor
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
        this.valorTotal = BigDecimal.ZERO;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(List<ItemCarrinho> itens) {
        this.itens = itens;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
