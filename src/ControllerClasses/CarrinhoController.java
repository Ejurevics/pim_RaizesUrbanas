package ControllerClasses;

import ModelClasses.CarrinhoDeCompras;
import ModelClasses.ItemCarrinho;
import ServicesClasses.CarrinhoService;

import java.math.BigDecimal;

public class CarrinhoController {
    private CarrinhoService carrinhoService;
    private CarrinhoDeCompras carrinho;

    public CarrinhoController(CarrinhoService carrinhoService) {
        this.carrinhoService = carrinhoService;
        this.carrinho = new CarrinhoDeCompras();
    }

    public void adicionarAoCarrinho(ItemCarrinho item) {

        carrinhoService.adicionarItem(carrinho, item);
    }

    public CarrinhoDeCompras visualizarCarrinho() {
        return carrinho;
    }

    public BigDecimal calcularTotal() {
        return carrinhoService.calcularTotal(carrinho);
    }

    public void limparCarrinho() {
        carrinhoService.limparCarrinho(carrinho);
    }


}
