package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity;

import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.ClienteDTO;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.ProdutoDTO;

import java.util.List;

public class Pedido {

    private long id;
    private Cliente cliente;
    private List<Produtos> produtos;
    private double valorTotal;

    public Pedido(long id, Cliente cliente, List<Produtos> produtos, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public Pedido(int proximo, ClienteDTO cliente, List<ProdutoDTO> produtos, double valorTotal) {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
