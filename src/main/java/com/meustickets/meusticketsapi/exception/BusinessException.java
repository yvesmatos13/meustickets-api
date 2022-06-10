package com.meustickets.meusticketsapi.exception;

import java.util.List;

public class BusinessException extends AbstractException {

    private static final long serialVersionUID = -1L;

    private List<String> messages;

    public BusinessException(String message) {
        super("400", message);
    }

    public BusinessException(List<String> messages) {
        super("400");
        this.messages =  messages;
    }

    public BusinessException(String code, String message) {
        super(code, message);
    }

    @Override
	public String getMessage() {
		if (this.messages != null && !this.messages.isEmpty()) {
			return this.messages.get(0);
		} else {
			return super.getMessage();
		}
	}
       

}
