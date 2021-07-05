package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Converter;

import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.ClienteDTO;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.RetornoPedidosClienteDTO;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Cliente;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form.ClienteForm;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Utils.GeradorId;

import java.util.ArrayList;
import java.util.List;

public class ClienteConverter {
    public static Cliente clienteFormToEntity(ClienteForm clienteForm) {
        return new Cliente(
                GeradorId.getProximo(),
                clienteForm.getNome(),
                clienteForm.getCpf(),
                clienteForm.getEmail(),
                clienteForm.getTelefone()
        );
    }

    public static List<Cliente> clienteFormToEntity(List<ClienteForm> clienteForms) {
        List<Cliente> clientes = new ArrayList<>();

        for (ClienteForm clienteForm : clienteForms) {
            clientes.add(clienteFormToEntity(clienteForm));
        }

        return clientes;
    }

    public static ClienteDTO clienteEntityToDTO(Cliente cliente) {
        return new ClienteDTO(
                cliente.getNome(),
                cliente.getCpf(),
                cliente.getEmail(),
                cliente.getTelefone()
        );
    }

    public static List<ClienteDTO> clienteEntityToDTO(List<Cliente> clientes) {
        List<ClienteDTO> clienteDTOS = new ArrayList<>();

        for (Cliente cliente : clientes) {
            clienteDTOS.add(clienteEntityToDTO(cliente));
        }

        return clienteDTOS;
    }

    public static RetornoPedidosClienteDTO clienteConvertDTO (Cliente cliente) {
        return new RetornoPedidosClienteDTO(
                cliente.getCpf(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getTelefone(),
                PedidoConverter.entityToPedidoResponseDTO(cliente.getPedidos())
        );
    }
}
