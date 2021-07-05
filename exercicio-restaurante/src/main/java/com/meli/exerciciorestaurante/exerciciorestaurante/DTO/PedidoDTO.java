package com.meli.exerciciorestaurante.exerciciorestaurante.DTO;

import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Mesa;
import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Pedidos;
import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Pratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PedidoDTO {

    private long mesaId;
    private List<Pratos> pratosSolicitados;
    private double valorTotal;

    public PedidoDTO(List<Pratos> pratosSolicitados) {

        this.pratosSolicitados = pratosSolicitados;

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

    public static List<PedidoDTO> converte(List<Pedidos> pedidos) {
        List<PedidoDTO> p1 = new ArrayList<PedidoDTO>();

        for (int i = 0; i < pedidos.size(); i++) {
            Optional<Pedidos> mesaPesquisa = pedidos.stream().filter(a -> a.getId() == i).findAny();
            if (mesaPesquisa.isPresent()) {
                p1.add(pedidos.get(i).getPratosSolicitados());
                return mesaPesquisa.get();
            }
            return null;
        }


        return new PedidoDTO(pedidos.getPratosSolicitados());

    }
}
