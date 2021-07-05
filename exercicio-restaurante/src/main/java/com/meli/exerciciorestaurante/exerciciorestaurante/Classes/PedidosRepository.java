package com.meli.exerciciorestaurante.exerciciorestaurante.Classes;


import com.meli.exerciciorestaurante.exerciciorestaurante.DTO.RestauranteDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PedidosRepository {

    public List<Mesa> mesas = new ArrayList<>();

    RestauranteDTO r1 = new RestauranteDTO();

    public void add(Mesa mesa) {

        mesas.add(mesa);

    }


    public List<Mesa> getList() {
        return mesas;
    }

    public Mesa pesquisar(long id) {
        Optional<Mesa> mesaPesquisa = mesas.stream().filter(a -> a.getId() == id).findAny();
        if (mesaPesquisa.isPresent()) {
            mesaPesquisa.get().setValorTotalConsumido(r1.retornaTotalMesa(mesaPesquisa.get().getListaDePedidos()));
            return mesaPesquisa.get();
        }
        return null;
    }

}
