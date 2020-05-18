package com.capgemini.god.exceptions;

@SuppressWarnings("serial")
public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(String msg){
        super(msg);
    }

    public IdNotFoundException(String msg,Throwable p){
        super(msg,p);
    }  

}
