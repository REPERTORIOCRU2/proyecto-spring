package com.proyect.spring.exception;

public class NotFoundException extends RuntimeException{
    
    public  NotFoundException (String msn){
        super(msn);
    }
    
}
