package ControllerClasses;

import ModelClasses.Produto;
import ServicesClasses.ProdutoService;

import java.util.List;

public class ProdutoController {
    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    public List<Produto> listarProdutos() {
        return produtoService.buscarProdutos();
    }

    public Produto detalharProduto(int id) {
        return produtoService.buscarProdutoPorId(id);
    }

    public List<Produto> filtrarPorCategoria(String categoria) {
        return produtoService.filtrarPorCategoria(categoria);
    }
}
