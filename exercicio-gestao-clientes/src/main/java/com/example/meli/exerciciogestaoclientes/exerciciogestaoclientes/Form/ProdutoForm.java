package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form;

public class ProdutoForm {

    private long id;
    private String descricao;
    private Double preco;
    private Integer quantidade;
    private String cor;


    public ProdutoForm() {
    }

    public ProdutoForm(String descricao, Double preco, Integer quantidade, String cor) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.cor = cor;
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
