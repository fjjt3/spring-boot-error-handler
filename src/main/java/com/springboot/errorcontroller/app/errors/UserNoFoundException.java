package com.springboot.errorcontroller.app.errors;

public class UserNoFoundException extends RuntimeException{

    public UserNoFoundException(String id) {
        super("User with ID: ".concat(" does not exist"));
    }
    private static final long serialVersionUID = 1L;


}

