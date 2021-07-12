package com.meli.exerciciorestaurante.exerciciorestaurante.dto;

import com.meli.exerciciorestaurante.exerciciorestaurante.entity.Mesa;
import com.meli.exerciciorestaurante.exerciciorestaurante.entity.Pedidos;
import com.meli.exerciciorestaurante.exerciciorestaurante.entity.Pratos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestauranteDTO {


    private List<Mesa> mesas = new ArrayList<Mesa>(
            Arrays.asList(

            )

    );

    private double caixa;

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }


    public static double retornaTotalMesa(List<Pedidos> pedidos) {
        double totalPrato = 0;
        double totalPedido = 0;

        for (int i = 0; i < pedidos.size(); i++) {

            for (Pratos p : pedidos.get(i).getPratosSolicitados()
            ) {
                pedidos.get(i).setValorTotal(totalPrato += p.getPreco() * p.getQuantidade());
                totalPrato = p.getPreco() * p.getQuantidade();
                totalPedido += totalPrato;

            }

        }
        return totalPedido;
    }
}
