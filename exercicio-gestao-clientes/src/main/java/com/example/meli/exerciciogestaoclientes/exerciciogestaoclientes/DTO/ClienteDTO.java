package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO;

import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Cliente;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Utils.GeradorId;

public class ClienteDTO {


    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public ClienteDTO(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
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

    public static Cliente converte(ClienteDTO cliente) {
        return new Cliente(GeradorId.getProximo(), cliente.getNome(), cliente.getCpf(), cliente.getEmail(), cliente.getTelefone());
    }
}
