package com.meli.exercicios.linktracker.exerciciolinktracker.Utils;

public class GeradorId {

    private static long id = 1;

    public static long getProximo() {
        return id++;
    }
}
