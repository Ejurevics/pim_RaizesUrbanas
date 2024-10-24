import ModelClasses.*;
import ServicesClasses.UsuarioService;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //teste

        Produto produto = new Produto();
        produto.setId(1);
        produto.setNome("Camiseta");
        produto.setDescricao("Camiseta de algodão");
        produto.setPreco(new BigDecimal("29.99"));
        produto.setQuantidadeEmEstoque(100);

        ItemCarrinho itemCarrinho = new ItemCarrinho();
        itemCarrinho.setProduto(produto);
        itemCarrinho.setQuantidade(2);
        itemCarrinho.setPrecoUnitario(produto.getPreco());

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.setId(1);
        carrinho.setItens(List.of(itemCarrinho));

        UsuarioService usuarioService = new UsuarioService();
        Cliente cliente1 = usuarioService.inserirCliente();

        Pedido pedido = new Pedido(
                1,
                cliente1,
                List.of(itemCarrinho),
                null,
                carrinho.getValorTotal(),
                BigDecimal.ZERO,
                LocalDateTime.now(),
                new Status("Pendente")
        );

        usuarioService.imprimirCliente(cliente1);
        System.out.println("");
        System.out.println("==== Pedido ====");
        System.out.println("Valor Total: R$ " + pedido.getValorTotal().setScale(2, java.math.RoundingMode.HALF_UP));
        System.out.println("Status: " + pedido.getStatusPedido().getDescricao());


    }
}
