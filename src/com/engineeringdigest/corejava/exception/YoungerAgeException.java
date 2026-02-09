package com.engineeringdigest.corejava.exception;

public class YoungerAgeException extends  RuntimeException {

    public YoungerAgeException(String message){
        super(message); // it calls to parent class exception.
    }
}
