package com.meli.exerciciorestaurante.exerciciorestaurante.repository;


import com.meli.exerciciorestaurante.exerciciorestaurante.dto.FechamentoDTO;
import com.meli.exerciciorestaurante.exerciciorestaurante.dto.PedidoDTO;
import com.meli.exerciciorestaurante.exerciciorestaurante.entity.Caixa;
import com.meli.exerciciorestaurante.exerciciorestaurante.entity.Mesa;
import com.meli.exerciciorestaurante.exerciciorestaurante.entity.Pedidos;
import com.meli.exerciciorestaurante.exerciciorestaurante.entity.Pratos;
import com.meli.exerciciorestaurante.exerciciorestaurante.exception.PedidoInvalidoException;
import com.meli.exerciciorestaurante.exerciciorestaurante.utils.GeradorId;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PedidosRepository {

    List<Pedidos> pedidosList = new ArrayList<>();
    public List<Mesa> mesasList = new ArrayList<>();
    public List<Caixa> caixaList = new ArrayList<>();
    FechamentoDTO fechamento = new FechamentoDTO(0);

    public List<Pedidos> getPedidos() {
        return pedidosList;
    }

    public FechamentoDTO getFechamento() {
        return fechamento;
    }

    public List<Caixa> getCaixa() {
        return caixaList;
    }

    public Pedidos addPedido(Pedidos pedidos) {
        Pedidos pedido = new Pedidos(GeradorId.getProximo(), pedidos.getMesaId(), pedidos.getPratosSolicitados());
        pedidosList.add(pedido);
        return pedido;
    }

    public List<Caixa> removePedido(long idMesa) {
        addCaixa(idMesa);
        return caixaList;

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


    public List<Pedidos> pesquisar(long id) {
        List<Pedidos> mesaPesquisa = pedidosList.stream().filter(a -> a.getMesaId() == id).collect(Collectors.toList());
        if (mesaPesquisa.isEmpty()) {
            throw new PedidoInvalidoException("Id do pedido não localizado!");
        }
        retornaTotalMesa(mesaPesquisa);
        return mesaPesquisa;

    }

    public List<Caixa> addCaixa(long idMesa) {

        List<Pedidos> mesaPesquisa = pedidosList.stream().filter(a -> a.getMesaId() == idMesa).collect(Collectors.toList());
        if (mesaPesquisa.isEmpty()) {
            throw new PedidoInvalidoException("Id da mesa não localizado!");
        }
        retornaTotalMesa(mesaPesquisa);
        fechamento.setValorCaixa(fechamento.getValorCaixa() + retornaTotalMesa(mesaPesquisa));
        PedidoDTO p1 = PedidoDTO.converte(idMesa, mesaPesquisa);
        caixaList.add(new Caixa(GeradorId.getProximo(), p1.getValorTotal(), p1.getValorTotal()));
        for (int i = 0; i < mesaPesquisa.size(); i++){
            pedidosList.remove(mesaPesquisa.get(i));
        }

        return caixaList;
    }
}
