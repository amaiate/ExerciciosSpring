package com.meli.exercicios.linktracker.exerciciolinktracker.Exceptions;

public class LinkInvalidoException extends RuntimeException{

    public LinkInvalidoException(String message) {
        super(message);
    }

    public LinkInvalidoException(Exception e) {
        super(e);
    }
}
