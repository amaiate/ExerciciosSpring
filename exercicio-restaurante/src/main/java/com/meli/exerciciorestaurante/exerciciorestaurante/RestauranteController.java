package com.meli.exerciciorestaurante.exerciciorestaurante;


import com.meli.exerciciorestaurante.exerciciorestaurante.Classes.Mesa;
import com.meli.exerciciorestaurante.exerciciorestaurante.DTO.RestauranteDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestauranteController {

    @PostMapping("/pedidos")
    @ResponseBody
    public ResponseEntity<Mesa> pedidosMesa(@RequestBody Mesa mesa){
        Mesa m1 = new Mesa(mesa.getId(), mesa.getListaDePedidos());

        RestauranteDTO r1 = new RestauranteDTO();
        m1.setValorTotalConsumido(r1.retornaTotalMesa(mesa.getListaDePedidos()));


        return ResponseEntity.accepted().body(m1);
    }




}
