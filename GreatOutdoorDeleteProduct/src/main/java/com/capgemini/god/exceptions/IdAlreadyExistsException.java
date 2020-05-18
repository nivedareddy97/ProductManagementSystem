package com.capgemini.god.exceptions;

@SuppressWarnings("serial")
public class IdAlreadyExistsException extends RuntimeException{
	public IdAlreadyExistsException(String msg){
        super(msg);
    }

}
