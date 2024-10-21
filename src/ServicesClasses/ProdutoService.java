package ServicesClasses;

import ModelClasses.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();

    public List<Produto> buscarProdutos() {
        return produtos;
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public List<Produto> filtrarPorCategoria(String categoria) {
        List<Produto> filtrados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getCategoria().equals(categoria)) {
                filtrados.add(produto);
            }
        }
        return filtrados;
    }
}

