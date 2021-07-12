package com.meli.exerciciorestaurante.exerciciorestaurante.utils;

public class GeradorId {

    private static int id = 1;

        public static int getProximo() {
            return id++;
        }
}

