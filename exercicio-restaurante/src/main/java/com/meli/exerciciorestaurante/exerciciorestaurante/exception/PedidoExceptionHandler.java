package com.meli.exerciciorestaurante.exerciciorestaurante.exception;


import com.meli.exerciciorestaurante.exerciciorestaurante.dto.ExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PedidoExceptionHandler {

    @ExceptionHandler(PedidoInvalidoException.class)
    public ResponseEntity<?> invalidLinkExceptionHandler(PedidoInvalidoException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionDTO(e.getMessage()));
    }


    @ExceptionHandler(MissingRequestHeaderException.class)
    public ResponseEntity<?> missingHeaderHandler(MissingRequestHeaderException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ExceptionDTO("Header not found"));
    }
}
