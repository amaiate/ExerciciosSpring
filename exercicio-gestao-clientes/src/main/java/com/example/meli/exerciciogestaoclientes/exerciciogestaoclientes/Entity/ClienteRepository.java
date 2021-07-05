package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
    public class ClienteRepository {

    List<Pedido> pedidos = new ArrayList<>();
    List<Produtos> produtos = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente addCliente(Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }

    public Pedido addPedido(Pedido pedido) {
        pedidos.add(pedido);
        return pedido;
    }

    public Produtos addProduto(Produtos produto) {
        produtos.add(produto);
        return produto;
    }
    }

