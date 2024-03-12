package com.example.mercaweb.exception;


public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException() {
        super("No tiene los permisos necesarios.");
    }
}
