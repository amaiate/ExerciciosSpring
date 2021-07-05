package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Converter;

import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.PedidoDTO;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.RetornoPedidoDTO;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Cliente;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Pedido;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Produtos;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form.PedidoForm;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form.ProdutoForm;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Utils.GeradorId;

import java.util.ArrayList;
import java.util.List;

public class PedidoConverter {

    public static Pedido pedidoFormToEntity(PedidoForm pedidoForm) {
        return new Pedido(
                GeradorId.getProximo(),
                pedidoForm.getCliente(),
                ProdutoConverter.produtoFormToEntity(pedidoForm.getProdutos()),
                total(pedidoForm.getProdutos())
        );
    }

    public static List<Pedido> pedidoFormToEntity(List<PedidoForm> pedidoForms) {
        List<Pedido> pedidos = new ArrayList<>();

        for (PedidoForm pedidoForm : pedidoForms) {
            pedidos.add(pedidoFormToEntity(pedidoForm));
        }

        return pedidos;
    }

    public static PedidoDTO pedidoEntityToDTO(Pedido pedido) {
        return new PedidoDTO(
                ClienteConverter.clienteEntityToDTO(pedido.getCliente()),
                ProdutoConverter.produtoEntityToDTO(pedido.getProdutos()),
                pedido.getValorTotal()
        );
    }

    public static List<PedidoDTO> pedidoEntityToDTO(List<Pedido> pedidos) {
        List<PedidoDTO> pedidoDTOS = new ArrayList<>();

        for (Pedido pedido : pedidos) {
            pedidoDTOS.add(pedidoEntityToDTO(pedido));
        }

        return pedidoDTOS;
    }

    private static double total(List<ProdutoForm> produtoForms) {
        double value = 0.0;

        for (ProdutoForm produtoForm : produtoForms) {
            value += produtoForm.getPreco() * produtoForm.getQuantidade();
        }

        return value;
    }

    public static RetornoPedidoDTO converterPedidoDTO(Pedido pedido) {
        return new RetornoPedidoDTO(
                ProdutoConverter.entityToProdutoDTO(pedido.getProdutos()),
                pedido.getValorTotal()
        );
    }

    public static List<RetornoPedidoDTO> entityToPedidoResponseDTO(List<Pedido> pedidos) {
        List<RetornoPedidoDTO> pedidoResponseDTOS = new ArrayList<>();

        try{
            for (Pedido pedido : pedidos) {
                pedidoResponseDTOS.add(converterPedidoDTO(pedido));
            }

            return pedidoResponseDTOS;
        }catch (Exception e){
            e.getMessage();
        }
        return null;
    }

}
