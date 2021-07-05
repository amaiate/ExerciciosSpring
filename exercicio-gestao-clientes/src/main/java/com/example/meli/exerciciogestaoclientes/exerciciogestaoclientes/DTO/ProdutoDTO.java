package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO;

import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Cliente;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Produtos;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Utils.GeradorId;

public class ProdutoDTO {

    private long id;
    private String descricao;
    private String cor;
    private int quantidade;
    private double preco;

    public ProdutoDTO(String descricao, String cor, int quantidade, double preco) {

        this.descricao = descricao;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
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


    public static Produtos converte(ProdutoDTO produtoDTO) {
        return new Produtos(GeradorId.getProximo(), produtoDTO.getDescricao(), produtoDTO.getCor(), produtoDTO.getQuantidade(), produtoDTO.getPreco());
    }
}
