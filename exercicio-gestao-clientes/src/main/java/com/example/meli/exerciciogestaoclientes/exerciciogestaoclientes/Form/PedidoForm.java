package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form;

import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Cliente;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Produtos;

import java.util.List;

public class PedidoForm {

    private long id;
    private Cliente cliente;
    private double valorTotal;
    private List<ProdutoForm> produtos;

    public long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public PedidoForm() {
    }

    public PedidoForm(List<ProdutoForm> produtos) {
        this.produtos = produtos;
    }

    public List<ProdutoForm> getProdutos() {
        return produtos;
    }
}
