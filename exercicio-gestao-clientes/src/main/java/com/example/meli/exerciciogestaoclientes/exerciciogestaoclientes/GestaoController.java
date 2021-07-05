package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes;

import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.PedidoDTO;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.RetornoPedidosClienteDTO;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Cliente;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.ClienteService;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Pedido;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Produtos;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form.ClienteForm;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form.PedidoForm;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form.ProdutoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api")
public class GestaoController {


    private ClienteService clienteService;

    public GestaoController() {
    }

    @Autowired
    public GestaoController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes")
    public ResponseEntity<?> getClientes() {
        return ResponseEntity.ok(clienteService.findAllClientes());
    }

    @PostMapping("/cadastrar/clientes")
    public ResponseEntity<?> postClientes(@RequestBody ClienteForm clienteForm, UriComponentsBuilder uriBuilder) {
        Cliente cliente = clienteService.addCliente(clienteForm);
        URI uri = uriBuilder.path("cadastrar/{idCliente}/pedido").buildAndExpand(cliente.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PostMapping("cadastrar/pedido")
    public ResponseEntity<?> postPedidos(@RequestBody PedidoForm pedidoForm, UriComponentsBuilder uriBuilder) throws Exception {
        Pedido pedido = clienteService.addPedido(pedidoForm);
        URI uri = uriBuilder.path("cadastrar/pedido").buildAndExpand(pedido.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/pedidos/{idCliente}")
    public ResponseEntity<?> getPedidos(@PathVariable long idCliente) {
        return ResponseEntity.ok(clienteService.findAllPedidos());
    }

    @PostMapping("cadastrar/produtos")
    public ResponseEntity<?> addProduto(@RequestBody ProdutoForm produtoForm, UriComponentsBuilder uriBuilder) throws Exception {
        Produtos produto = clienteService.addProduto(produtoForm);

        URI uri = uriBuilder.path("cadastrar/produtos").buildAndExpand(produto.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }


    @GetMapping("/cliente/pedidos/{cpf}")
    public ResponseEntity<?> getPedidosCliente(@PathVariable String cpf) {
        PedidoDTO cliente = clienteService.findClient(cpf);

        if(cliente != null) {
            return ResponseEntity.ok(cliente);
        }

        return ResponseEntity.badRequest().build();
    }


}
