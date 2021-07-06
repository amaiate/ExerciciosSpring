package com.meli.exercicios.linktracker.exerciciolinktracker.Exceptions;

import com.meli.exercicios.linktracker.exerciciolinktracker.DTO.ExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class HandlerException {

    @ExceptionHandler(LinkInvalidoException.class)
    public ResponseEntity<?> invalidLinkExceptionHandler(LinkInvalidoException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionDTO(e.getMessage()));
    }

    @ExceptionHandler(MissingRequestHeaderException.class)
    public ResponseEntity<?> missingHeaderHandler(MissingRequestHeaderException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ExceptionDTO("Parametro não localizado!"));
    }
}
