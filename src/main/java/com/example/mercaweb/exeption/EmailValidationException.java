package com.example.mercaweb.exeption;

public class EmailValidationException extends RuntimeException{
    public EmailValidationException(){
        super("El Email no cuenta con el formato requerido");
    }
}
