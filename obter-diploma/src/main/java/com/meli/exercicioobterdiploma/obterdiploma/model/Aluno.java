package com.meli.exercicioobterdiploma.obterdiploma.model;

import java.util.List;

public class Aluno {

    private String nome;

    private List<Disciplina> listaDisciplinas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

}
