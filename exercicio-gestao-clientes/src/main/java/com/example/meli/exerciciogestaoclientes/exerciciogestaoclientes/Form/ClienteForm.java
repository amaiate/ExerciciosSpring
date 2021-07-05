package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form;

import java.util.List;

public class ClienteForm {


    private long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    private List<PedidoForm> pedidos;

    public ClienteForm() {
    }

    public ClienteForm(List<PedidoForm> pedidos) {
        this.pedidos = pedidos;
    }


    public List<PedidoForm> getPedidos() {
        return pedidos;
    }
}
