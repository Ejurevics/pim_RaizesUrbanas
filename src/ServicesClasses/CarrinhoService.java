package ServicesClasses;

import ModelClasses.CarrinhoDeCompras;
import ModelClasses.ItemCarrinho;
import java.math.BigDecimal;

public class CarrinhoService {
    private CarrinhoDeCompras carrinho;

    public CarrinhoService(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
    }

    public void adicionarItem(CarrinhoDeCompras carrinho, ItemCarrinho item) {
        this.carrinho.getItens().add(item);
        calcularTotal(carrinho);
    }

    public void removerItem(int idProduto) {
        carrinho.getItens().removeIf(item -> item.getProduto().getId() == idProduto);
        calcularTotal(carrinho);
    }

    public BigDecimal calcularTotal(CarrinhoDeCompras carrinho) {
        BigDecimal total = BigDecimal.ZERO;
        for (ItemCarrinho item : this.carrinho.getItens()) {
            total = total.add(item.getPrecoUnitario().multiply(BigDecimal.valueOf(item.getQuantidade())));
        }
        this.carrinho.setValorTotal(total);
        return total;
    }

    public void limparCarrinho(CarrinhoDeCompras carrinho) {
        this.carrinho.getItens().clear();
        this.carrinho.setValorTotal(BigDecimal.ZERO);
    }
}

