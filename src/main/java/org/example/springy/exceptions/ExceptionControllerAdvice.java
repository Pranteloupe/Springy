package org.example.springy.exceptions;

import org.example.springy.models.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> notEnoughMoney() {
        ErrorDetails errorDetails = new ErrorDetails("Not enough money to make payment. :(");
        return ResponseEntity.badRequest().body(errorDetails);
    }
}
