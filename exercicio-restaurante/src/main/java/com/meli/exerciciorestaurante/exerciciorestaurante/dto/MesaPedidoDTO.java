package com.meli.exerciciorestaurante.exerciciorestaurante.dto;

import com.meli.exerciciorestaurante.exerciciorestaurante.entity.Pratos;

import java.util.List;

public class MesaPedidoDTO {

    private long mesaId;
    private List<Pratos> pratosSolicitados;

    public MesaPedidoDTO(long mesaId, List<Pratos> pratosSolicitados) {
        this.mesaId = mesaId;
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
}
