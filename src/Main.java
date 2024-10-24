import ModelClasses.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //master
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();
        produto.setId(1);
        produto.setNome("Camiseta");
        produto.setDescricao("Camiseta de algodão");
        produto.setPreco(new BigDecimal("29.99"));
        produto.setQuantidadeEmEstoque(100);


        Cliente cliente1 = new Cliente();
        /*cliente.setId(1);
        cliente1.setNome("Enzo");
        cliente1.setEmail("enzojurevics@gmail.com");
        cliente1.setTelefone("(11)99518-6046");
        cliente1.setEnderecos();*/


        ItemCarrinho itemCarrinho = new ItemCarrinho();
        itemCarrinho.setProduto(produto);
        itemCarrinho.setQuantidade(2);
        itemCarrinho.setPrecoUnitario(produto.getPreco());


        /*CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.setId(1);
        carrinho.setItens(List.of(itemCarrinho));
        carrinho.setValorTotal(itemCarrinho.getPrecoUnitario().multiply(new BigDecimal(itemCarrinho.getQuantidade())));*/


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.setId(1);
        List<ItemCarrinho> itens = new ArrayList<>();
        itens.add(itemCarrinho);
        carrinho.setItens(itens);


        BigDecimal valorTotal = BigDecimal.ZERO;
        for (ItemCarrinho item : itens) {
            valorTotal = valorTotal.add(item.getPrecoUnitario().multiply(new BigDecimal(item.getQuantidade())));
        }
        carrinho.setValorTotal(valorTotal);


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


        cliente1.inserirCliente();
        cliente1.imprimirCliente();
        //System.out.println("ID: " + pedido.getId());
        //System.out.println("ID: " + cliente.getId());
        //System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("");
        System.out.println("==== Pedido ====");
        System.out.println("Valor Total: R$ " + pedido.getValorTotal().setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("Status: " + pedido.getStatusPedido().getDescricao());


    }
}
