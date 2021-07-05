package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO;

import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Cliente;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Pedido;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Produtos;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Utils.GeradorId;
import java.util.List;

public class PedidoDTO {

    private ClienteDTO cliente;
    private List<ProdutoDTO> produtos;
    private double valorTotal;

    public PedidoDTO(ClienteDTO cliente, List<ProdutoDTO> produtos, double valorTotal) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.valorTotal = valorTotal;

    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public static Pedido converte (PedidoDTO pedidoDTO) {
        return new Pedido(GeradorId.getProximo(), pedidoDTO.getCliente(), pedidoDTO.getProdutos(), pedidoDTO.getValorTotal());
    }
}
