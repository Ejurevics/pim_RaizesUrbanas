package DaoClasses;

import ModelClasses.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private List<Produto> produtos = new ArrayList<>();


    public void salvarProduto(Produto produto) {
        produtos.add(produto);
    }


    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public List<Produto> listarTodos() {
        return produtos; // Retorna a lista de produtos
    }
}

