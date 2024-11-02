package com.jpasite.domain;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Produto> itensDoCarrinho;

    public CarrinhoCompras() {
        super();
        itensDoCarrinho = new ArrayList<>();
    }


    public void add(Produto produto) {
        itensDoCarrinho.add(produto);
    }

    public void remove(Produto produto) {
        itensDoCarrinho.remove(produto);

    }

    public  void exibeLista() {
        for (Produto c : itensDoCarrinho) {
            System.out.println(c);
        }
    }


    public void calcularTotal() {
        double total = 0;
        for (Produto produto : itensDoCarrinho) {
            total += produto.getPreco() * produto.getQuantidadeEmEstoque();
        }
        System.out.println("Total do carrinho: R$" + total);
    }


    @Override
    public String toString() {
        return "CarrinhoCompras{" +
                "itensDoCarrinho=" + itensDoCarrinho +
                '}';
    }
}

