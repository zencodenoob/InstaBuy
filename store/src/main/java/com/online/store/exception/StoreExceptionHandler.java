package com.online.store.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class StoreExceptionHandler {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    ResponseEntity<String> InvalidMethodArgumentHandler(MethodArgumentNotValidException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getFieldErrors()
                .stream().map(f -> f.getDefaultMessage()).collect(Collectors.joining(";")));
    }

    @ExceptionHandler({Exception.class})
    ResponseEntity<String> handleRequestBodyExceptions(Exception e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("BAD REQUEST, INVALID INPUT PARAMETERS");
    }
}
