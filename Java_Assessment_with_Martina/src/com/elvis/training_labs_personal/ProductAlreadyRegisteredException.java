package com.elvis.training_labs_personal;
/*
Exceptions are representation of unexpected behaviour in a method/function
 */


public class ProductAlreadyRegisteredException extends Exception {
    public ProductAlreadyRegisteredException(String message) {
        super(message);
    }
}
