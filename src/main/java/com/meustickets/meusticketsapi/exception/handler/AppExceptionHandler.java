package com.meustickets.meusticketsapi.exception.handler;

import java.sql.SQLTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;

import com.meustickets.meusticketsapi.exception.BusinessException;
import com.meustickets.meusticketsapi.webApi.model.exception.InfraEstruturaException;
import com.meustickets.meusticketsapi.webApi.model.exception.NegocioException;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {BusinessException.class})
    public ResponseEntity<Object> handleBusinessException(BusinessException e, WebRequest request){
        
        String erroMessage = e.getLocalizedMessage();
        if(erroMessage == null) erroMessage = e.toString();

        NegocioException negocioException = new NegocioException("400", erroMessage);
        return new ResponseEntity<>(negocioException, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {NullPointerException.class})
    public ResponseEntity<Object> handleNullPointerException(NullPointerException e, WebRequest request){
        
        String erroMessage = e.getLocalizedMessage();
        if(erroMessage == null) erroMessage = e.toString();

        InfraEstruturaException infraEstruturaException = new InfraEstruturaException("500", erroMessage);
        return new ResponseEntity<>(infraEstruturaException, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = {SQLTimeoutException.class})
    public ResponseEntity<Object> handleSqlTimeoutException(TimeoutException e, WebRequest request){
        
        String erroMessage = e.getLocalizedMessage();
        if(erroMessage == null) erroMessage = e.toString();

        InfraEstruturaException infraEstruturaException = new InfraEstruturaException("503", erroMessage);
        return new ResponseEntity<>(infraEstruturaException, new HttpHeaders(), HttpStatus.GATEWAY_TIMEOUT);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatus status, WebRequest request) {

        List<String> errors = new ArrayList<String>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String errorMessage = error.getDefaultMessage();
            errors.add(errorMessage); 
        });
        
        String erroMessage = ex.getLocalizedMessage();
        if(erroMessage == null) erroMessage = ex.toString();

        NegocioException negocioException = new NegocioException("400", "Requisição inválida", errors);
        return new ResponseEntity<>(negocioException, new HttpHeaders(), HttpStatus.BAD_REQUEST); 
    }
        
}
