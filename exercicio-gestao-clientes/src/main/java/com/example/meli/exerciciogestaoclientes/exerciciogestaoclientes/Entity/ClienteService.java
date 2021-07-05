package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.ClienteDTO;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.PedidoDTO;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.ProdutoDTO;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.RetornoPedidosClienteDTO;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Converter.ClienteConverter;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Converter.PedidoConverter;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Converter.ProdutoConverter;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form.ClienteForm;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form.PedidoForm;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form.ProdutoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.AccessException;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService() {
    }

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteDTO> findAllClientes() {
        return ClienteConverter.clienteEntityToDTO(clienteRepository.getClientes());
    }

    public Cliente addCliente(ClienteForm clienteForm) {
        return clienteRepository.addCliente(ClienteConverter.clienteFormToEntity(clienteForm));
    }

    public List<ProdutoDTO> findAllProdutos() {
        return ProdutoConverter.produtoEntityToDTO(clienteRepository.getProdutos());
    }

    public List<PedidoDTO> findAllPedidos() {
        return PedidoConverter.pedidoEntityToDTO(clienteRepository.getPedidos());
    }

    public Produtos addProduto(ProdutoForm produtoForm) {

            return clienteRepository.addProduto(ProdutoConverter.produtoFormToEntity(produtoForm));

    }

    public Pedido addPedido(PedidoForm pedidoForm) throws Exception {

            return clienteRepository.addPedido(PedidoConverter.pedidoFormToEntity(pedidoForm));

    }

    public PedidoDTO findClient(String cpf) {
        Optional<Pedido> clienteOptional = clienteRepository.pedidos.stream().filter(cliente -> cliente.getCliente().getCpf().equals(cpf)).findAny();

        if(clienteOptional.isPresent()) {
            return PedidoConverter.pedidoEntityToDTO(clienteOptional.get());
        }

        return null;
    }
}
