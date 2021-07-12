package com.meli.exerciciorestaurante.exerciciorestaurante.dto;

public class CaixaDTO {

    private long id;
    private double valorMesa;
    private double valorCaixa;

    public CaixaDTO(long id, double valorMesa) {
        this.id = id;
        this.valorMesa = valorMesa;
        this.valorCaixa += valorMesa;
    }

    public double getValorMesa() {
        return valorMesa;
    }

    public void setValorMesa(double valorMesa) {
        this.valorMesa = valorMesa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
}
