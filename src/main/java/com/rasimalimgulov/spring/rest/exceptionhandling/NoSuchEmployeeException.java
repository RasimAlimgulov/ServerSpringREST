package com.rasimalimgulov.spring.rest.exceptionhandling;

public class NoSuchEmployeeException extends RuntimeException{
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
