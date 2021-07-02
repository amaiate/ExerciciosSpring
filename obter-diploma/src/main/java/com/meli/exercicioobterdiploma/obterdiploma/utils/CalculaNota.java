package com.meli.exercicioobterdiploma.obterdiploma.utils;

import com.meli.exercicioobterdiploma.obterdiploma.model.Aluno;
import com.meli.exercicioobterdiploma.obterdiploma.model.Disciplina;

import java.text.DecimalFormat;

public class CalculaNota {

    public static Double mediaCalculada(Aluno aluno) {
        double mediaCalculada = 0;
        double notasTotais = 0;
        int disciplinas = aluno.getListaDisciplinas().size();

        for (Disciplina d : aluno.getListaDisciplinas()) {
            notasTotais += d.getNota();

        }

        mediaCalculada = notasTotais / disciplinas;

        return mediaCalculada;
    }


    public static String resultado(Double mediaCalculada) {
        String resultado = "";
        if (mediaCalculada >= 9) {
            resultado = "Aprovado! Parabéns você foi muito bem!";

        } else if (mediaCalculada >= 6) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado! Com essa média final não é possível liberar seu diploma, estude mais!";
        }
        return resultado;
    }

    public static String arredondar(Double valor) {

        return new DecimalFormat("#,##0.00").format(valor);
    }
}
