package com.meli.exercicios.linktracker.exerciciolinktracker.Utils;

import com.meli.exercicios.linktracker.exerciciolinktracker.DTO.LinkDTO;
import com.meli.exercicios.linktracker.exerciciolinktracker.Entity.Link;
import com.meli.exercicios.linktracker.exerciciolinktracker.Forms.LinkForm;

public class Conversor {

    public static Link linkFormToEntity(LinkForm linkForm) {
        return new Link(
                GeradorId.getProximo(),
                0l,
                linkForm.getUrl(),
                criarSenha()
        );
    }


    public static LinkDTO linkEntityToDTO(Link link) {
        return new LinkDTO(
                link.getId(),
                link.getSenha()
        );
    }



    private static String criarSenha() {
        int qtdeMaximaCaracteres = 8;
        String[] caracteres = {"0", "1", "2", "3","4", "5", "6", "7", "8",
                "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z"};

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();

    }
}

