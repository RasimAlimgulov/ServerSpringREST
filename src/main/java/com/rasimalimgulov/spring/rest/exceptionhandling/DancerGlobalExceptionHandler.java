package com.rasimalimgulov.spring.rest.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DancerGlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<DancerIncorrectData> handleException(NoSuchEmployeeException exception){
        DancerIncorrectData dancerIncorrectData=new DancerIncorrectData();
        dancerIncorrectData.setInfo(exception.getMessage());
        return new ResponseEntity<>(dancerIncorrectData, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<DancerIncorrectData> handleException(Exception exception){
        DancerIncorrectData dancerIncorrectData=new DancerIncorrectData();
        dancerIncorrectData.setInfo(exception.getMessage());
        return new ResponseEntity<>(dancerIncorrectData, HttpStatus.BAD_REQUEST);
    }
}
