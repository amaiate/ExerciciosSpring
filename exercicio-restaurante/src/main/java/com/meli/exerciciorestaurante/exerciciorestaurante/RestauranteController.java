package com.meli.exerciciorestaurante.exerciciorestaurante;


import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Mesa;
import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Pedidos;
import com.meli.exerciciorestaurante.exerciciorestaurante.DTO.PedidoDTO;
import com.meli.exerciciorestaurante.exerciciorestaurante.DTO.RestauranteDTO;
import com.meli.exerciciorestaurante.exerciciorestaurante.Repository.PedidosRepository;
import com.meli.exerciciorestaurante.exerciciorestaurante.utils.GeradorId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestauranteController {

    RestauranteDTO r1 = new RestauranteDTO();
    PedidosRepository pedidosRepository = new PedidosRepository();

    @PostMapping("/pedidos")
    @ResponseBody
    public ResponseEntity<Pedidos> pedidosMesa(@RequestBody Pedidos pedidos) {
        Pedidos pedido = new Pedidos(GeradorId.getProximo(), pedidos.getMesaId(), pedidos.getPratosSolicitados());
       pedidosRepository.addPedido(pedido);

        return ResponseEntity.accepted().body(pedido);
    }

    @GetMapping
    @RequestMapping("/lista/mesa/{idMesa}")
    public PedidoDTO listaPedidoId(@PathVariable long idMesa) {

        return PedidoDTO.converte(idMesa, pedidosRepository.pesquisar(idMesa));
    }

    @GetMapping
    @RequestMapping("/lista")
    public List<Pedidos> listaMesa() {

        return pedidosRepository.getPedidos();
    }


}
