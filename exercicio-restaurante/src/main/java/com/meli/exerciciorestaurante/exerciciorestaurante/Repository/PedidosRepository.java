package com.meli.exerciciorestaurante.exerciciorestaurante.Repository;


import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Mesa;
import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Pedidos;
import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Pratos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Repository
public class PedidosRepository {

    List<Pedidos> pedidosList = new ArrayList<>();
    public List<Mesa> mesasList = new ArrayList<>();

    public List<Pedidos> getPedidos() {
        return pedidosList;
    }

    public Pedidos addPedido(Pedidos pedido) {
        pedidosList.add(pedido);
        return pedido;
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
        if (!mesaPesquisa.isEmpty()) {
            retornaTotalMesa(mesaPesquisa);
            return mesaPesquisa;
        }
        return null;
    }
}
