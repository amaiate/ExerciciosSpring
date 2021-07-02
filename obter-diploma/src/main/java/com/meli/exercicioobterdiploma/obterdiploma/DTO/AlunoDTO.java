package com.meli.exercicioobterdiploma.obterdiploma.DTO;

import com.meli.exercicioobterdiploma.obterdiploma.model.Disciplina;

import java.util.List;

public class AlunoDTO {

    private String nome;

    private List<Disciplina> listaDisciplinas;

    private String resultado;

    private double media;

    private int quantidesDisciplinas;

    public AlunoDTO(String nome, List<Disciplina> listaDisciplinas, String resultado) {
        this.nome = nome;
        this.listaDisciplinas = listaDisciplinas;
        this.resultado = resultado;

    }

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

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getQuantidesDisciplinas() {
        return quantidesDisciplinas;
    }

    public void setQuantidesDisciplinas(int quantidesDisciplinas) {
        this.quantidesDisciplinas = quantidesDisciplinas;
    }

}
