import ModelClasses.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setId(1);
        produto.setNome("Camiseta");
        produto.setDescricao("Camiseta de algodão");
        produto.setPreco(new BigDecimal("29.99"));
        produto.setQuantidadeEmEstoque(100);

        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Enzo");
        cliente.setEmail("enzojurevics@gmail.com");
        cliente.setTelefone("(11)99518-6046");

        ItemCarrinho itemCarrinho = new ItemCarrinho();
        itemCarrinho.setProduto(produto);
        itemCarrinho.setQuantidade(2);
        itemCarrinho.setPrecoUnitario(produto.getPreco());

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.setId(1);
        carrinho.setItens(List.of(itemCarrinho));
        carrinho.setValorTotal(itemCarrinho.getPrecoUnitario().multiply(new BigDecimal(itemCarrinho.getQuantidade())));


        Pedido pedido = new Pedido(
                1,
                cliente,
                List.of(itemCarrinho),
                null,
                carrinho.getValorTotal(),
                BigDecimal.ZERO,
                LocalDateTime.now(),
                new Status("Pendente")
        );

        System.out.println("Informações do Pedido:");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Valor Total: R$ " + pedido.getValorTotal().setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("Status: " + pedido.getStatusPedido().getDescricao());
    }
}
