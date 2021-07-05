package com.meli.exerciciorestaurante.exerciciorestaurante.Classes;

public class Caixa {

    private Long id;
    private static double saldo = 0.0;
    private Double valor;

    public Caixa(Long id, Double valor) {
        this.id = id;
        this.valor = valor;
        saldo += valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static double getSaldo() {
        return saldo;
    }

    public static void setSaldo(double saldo) {
        Caixa.saldo = saldo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
