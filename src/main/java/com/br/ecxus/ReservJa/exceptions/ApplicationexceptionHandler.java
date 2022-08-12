package com.br.ecxus.ReservJa.exceptions;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
public class ApplicationexceptionHandler  extends ResponseEntityExceptionHandler{
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception exception){

        DefaltException error = new DefaltException(HttpStatus.BAD_REQUEST.value(), "Erro ao processar requisição!");

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<Object> NotFoundException(Exception exception){

        DefaltException error = new DefaltException(HttpStatus.BAD_REQUEST.value(), "Erro, apartamento não encontrado!");

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    
}
