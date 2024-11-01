package com.jpasite.domain;

public abstract class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;


    public Produto(String nome, String descricao, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Produto() {

    }

    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }
}
