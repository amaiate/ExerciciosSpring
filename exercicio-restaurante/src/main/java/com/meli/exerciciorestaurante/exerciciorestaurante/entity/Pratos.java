package com.meli.exerciciorestaurante.exerciciorestaurante.Classes;

public class Pratos {

    private long id;
    private double preco;
    private String descricao;
    private long quantidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public Pratos(long id, double preco, String descricao, long quantidade) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Pratos{" +
                "id=" + id +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
