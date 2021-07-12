package com.meli.exerciciorestaurante.exerciciorestaurante.DTO;

import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Pedidos;
import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Pratos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoDTO {

    private long mesaId;
    private List<Pratos> pratosSolicitados;
    private double valorTotal;


    public PedidoDTO(long mesaId, List<Pratos> pratosSolicitados, double valorTotal) {
        this.mesaId = mesaId;
        this.pratosSolicitados = pratosSolicitados;
        this.valorTotal = valorTotal;
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

    public static PedidoDTO converte(long id, List<Pedidos> pedidos) {

        List<Pedidos> pedidosList = pedidos.stream().filter(a -> a.getMesaId() == id).collect(Collectors.toList());
        List<Pratos> pratosList = new ArrayList<>();

        RestauranteDTO.retornaTotalMesa(pedidos);

        for (int i = 0; i < pedidosList.size(); i++ ) {
            for (int x = 0; x < pedidosList.get(i).getPratosSolicitados().size(); x++) {
                pratosList.add(pedidosList.get(i).getPratosSolicitados().get(x));
            }
        }


        return new PedidoDTO(id, pratosList,RestauranteDTO.retornaTotalMesa(pedidos) );

    }

    @Override
    public String toString() {
        return "PedidoDTO{" +
                "mesaId=" + mesaId +
                ", pratosSolicitados=" + pratosSolicitados +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
