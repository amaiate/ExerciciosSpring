package com.meli.exerciciorestaurante.exerciciorestaurante.entity;

public class Caixa {

    private long id;
    private double valorMesa;
    private double valorCaixa;

    public Caixa(long id, double valorMesa, double valorCaixa) {
        this.id = id;
        this.valorMesa = valorMesa;
        this.valorCaixa = valorCaixa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValorMesa() {
        return valorMesa;
    }

    public void setValorMesa(double valorMesa) {
        this.valorMesa = valorMesa;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
}
