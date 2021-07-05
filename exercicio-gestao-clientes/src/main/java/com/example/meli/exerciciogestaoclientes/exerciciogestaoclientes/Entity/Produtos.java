package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity;

public class Produtos {

    private long id;
    private String descricao;
    private String cor;
    private int quantidade;
    private double preco;

    public Produtos(long id, String descricao, String cor, int quantidade, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preço) {
        this.preco = preço;
    }
}
