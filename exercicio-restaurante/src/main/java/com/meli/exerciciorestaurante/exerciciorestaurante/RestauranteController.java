package com.meli.exerciciorestaurante.exerciciorestaurante;


import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Mesa;
import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Pedidos;
import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.PedidosRepository;
import com.meli.exerciciorestaurante.exerciciorestaurante.DTO.PedidoDTO;
import com.meli.exerciciorestaurante.exerciciorestaurante.DTO.RestauranteDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestauranteController {

    RestauranteDTO r1 = new RestauranteDTO();
    PedidosRepository p1 = new PedidosRepository();

    @PostMapping("/pedidos")
    @ResponseBody
    public ResponseEntity<Mesa> pedidosMesa(@RequestBody Mesa mesa) {
        Mesa m1 = new Mesa(mesa.getId(), mesa.getListaDePedidos());

        m1.setValorTotalConsumido(r1.retornaTotalMesa(mesa.getListaDePedidos()));

        p1.add(mesa);

        return ResponseEntity.accepted().body(m1);
    }

    @GetMapping
    @RequestMapping("/lista/mesa/{id}")
    public List<PedidoDTO> listaPedidoId(@PathVariable long idMesa) {
        p1.pesquisar(idMesa);
        List<Pedidos> pedido = new ArrayList<>();

        for (Pedidos p : p1.pesquisar(idMesa).getListaDePedidos()) {
            pedido.add(p);
        }

        PedidoDTO.converte(pedido);

        return pedido;
    }

    @GetMapping
    @RequestMapping("/lista")
    public List<Mesa> listaMesa() {

        return p1.getList();
    }


}
