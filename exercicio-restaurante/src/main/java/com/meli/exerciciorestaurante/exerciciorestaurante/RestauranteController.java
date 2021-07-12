package com.meli.exerciciorestaurante.exerciciorestaurante;

import com.meli.exerciciorestaurante.exerciciorestaurante.entity.Caixa;
import com.meli.exerciciorestaurante.exerciciorestaurante.entity.Pedidos;
import com.meli.exerciciorestaurante.exerciciorestaurante.dto.PedidoDTO;
import com.meli.exerciciorestaurante.exerciciorestaurante.repository.PedidosRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestauranteController {

    PedidosRepository pedidosRepository = new PedidosRepository();

    @PostMapping("/pedidos")
    @ResponseBody
    public ResponseEntity<?> pedidosMesa(@RequestBody Pedidos pedidos) {
       pedidosRepository.addPedido(pedidos);
       return ResponseEntity.ok(pedidos.getPratosSolicitados());
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

    @GetMapping
    @RequestMapping("/fechamento/{idMesa}")
    public List<Caixa> fechamentoMesa(@PathVariable long idMesa) {
        return pedidosRepository.removePedido(idMesa);
    }


}
