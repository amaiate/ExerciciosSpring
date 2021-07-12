package com.meli.exerciciorestaurante.exerciciorestaurante.entity;

import java.util.List;

public class Pedidos {

    private long id;
    private long mesaId;
    private List<Pratos> pratosSolicitados;
    private double valorTotal;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMesaId() {
        return mesaId;
    }

    public void setMesaId(long mesaId) {
        this.mesaId = mesaId;
    }

    public List<Pratos> getPratosSolicitados() {
        return pratosSolicitados;
    }

    public void setPratosSolicitados(List<Pratos> pratosSolicitados) {
        this.pratosSolicitados = pratosSolicitados;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Pedidos(long id, long mesaId, List<Pratos> pratosSolicitados) {
        this.id = id;
        this.mesaId = mesaId;
        this.pratosSolicitados = pratosSolicitados;

    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "id=" + id +
                ", mesaId=" + mesaId +
                ", pratosSolicitados=" + pratosSolicitados +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
