package com.meli.exerciciorestaurante.exerciciorestaurante.entity;

import java.util.List;

public class Mesa {
    private long id;
    private List<Pedidos> listaDePedidos;
    private double valorTotalConsumido;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Pedidos> getListaDePedidos() {
        return listaDePedidos;
    }

    public void setListaDePedidos(List<Pedidos> listaDePedidos) {
        this.listaDePedidos = listaDePedidos;
    }

    public double getValorTotalConsumido() {
        return valorTotalConsumido;
    }

    public void setValorTotalConsumido(double valorTotalConsumido) {
        this.valorTotalConsumido = valorTotalConsumido;
    }

    public Mesa(long id, List<Pedidos> listaDePedidos) {
        this.id = id;
        this.listaDePedidos = listaDePedidos;

    }

    @Override
    public String toString() {
        return "Mesa{" +
                "id=" + id +
                ", listaDePedidos=" + listaDePedidos +
                ", valorTotalConsumido=" + valorTotalConsumido +
                '}';
    }
}
