package com.message.expection;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class ValidatorController {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> constraintExceptionHandler(ConstraintViolationException exception){
        return ResponseEntity.badRequest().body(exception.getConstraintViolations().iterator().next().getMessage());
    }
}
