package ModelClasses;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private int id;
    private List<ItemCarrinho> itens; // Lista de itens no carrinho
    private BigDecimal valorTotal; // Valor total do carrinho

    // Construtor
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>(); // Inicializa a lista de itens
        this.valorTotal = BigDecimal.ZERO; // Inicializa o valor total como zero
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
