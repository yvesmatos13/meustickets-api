package com.meustickets.meusticketsapi.exception;

public class InfraStructureException extends AbstractException {

    private static final long serialVersionUID = -1L;

    public InfraStructureException(String message) {
        super("500", message);
    }

    public InfraStructureException(String code, String message) {
        super(code, message);
    }


}
