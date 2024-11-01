package com.jpasite.domain;

import java.util.ArrayList;
import java.util.List;

public class Lojavirtual extends Produto{

    private List<Produto> produtos;
    public Lojavirtual(){
        super();
        produtos = new ArrayList<>();
    }
    public Lojavirtual(String nome, String descricao, double preco, int quantidadeEmEstoque) {
        super(nome, descricao, preco, quantidadeEmEstoque);
    }


    public void addProduto(Produto produto){
        produtos.add(produto);
    }

    public void remove(Produto produto) {
        produtos.remove(produto);

    }

    public void exibeLista() {
        for (Produto c : produtos) {
            System.out.println(c);
        }
    }
}
