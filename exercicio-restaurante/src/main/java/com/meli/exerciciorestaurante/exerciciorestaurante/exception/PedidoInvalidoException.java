package com.meli.exerciciorestaurante.exerciciorestaurante.exception;

public class PedidoInvalidoException extends RuntimeException {


        public PedidoInvalidoException (String message) {
            super(message);
        }

        public PedidoInvalidoException (Exception e) {
            super(e);
        }
    }

