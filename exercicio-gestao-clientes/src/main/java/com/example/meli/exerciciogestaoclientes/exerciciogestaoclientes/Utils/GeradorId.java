package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Utils;


public class GeradorId {
    private static int id = 1;

    public static int getProximo() {
        return id++;
    }
}
