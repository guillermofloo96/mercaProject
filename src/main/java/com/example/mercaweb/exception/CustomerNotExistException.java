package com.example.mercaweb.exception;

public class CustomerNotExistException extends RuntimeException {


    public CustomerNotExistException() {
        super("El usuario ingresado no existe.");
    }
}
