package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO;

import java.util.List;

public class RetornoPedidosClienteDTO {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private List<RetornoPedidoDTO> pedidos;

    public RetornoPedidosClienteDTO(String nome, String cpf, String email, String telefone, List<RetornoPedidoDTO> pedidos) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.pedidos = pedidos;
    }

    public RetornoPedidosClienteDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<RetornoPedidoDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<RetornoPedidoDTO> pedidos) {
        this.pedidos = pedidos;
    }
}
