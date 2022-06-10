package com.meustickets.meusticketsapi.exception;

public class AbstractException extends RuntimeException {

    private static final long serialVersionUID = -1L;

    private String code;

    public AbstractException(String code) {
        this.code = code;
    }

    public AbstractException(String code, String message) {
        super(message);
        this.code = code;
    }

    public AbstractException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
    
}
