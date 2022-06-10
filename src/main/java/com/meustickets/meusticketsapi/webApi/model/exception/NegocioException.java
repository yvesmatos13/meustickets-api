package com.meustickets.meusticketsapi.webApi.model.exception;

import java.util.List;

public class NegocioException {

    private String code;

    private String message;

    private List<String> errors;

    public NegocioException() {

    }

    public NegocioException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public NegocioException(String code, String message, List<String> errors) {
        this.code = code;
        this.message = message;
        this.errors = errors;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getMessages() {
        return errors;
    }

    public void setMessages(List<String> errors) {
        this.errors = errors;
    }

}
