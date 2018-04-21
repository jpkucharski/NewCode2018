package com.jpk.exceptions;

public class NegativeNumberException extends RuntimeException {

    private static final String STRING_VALIDATION_ERROR_MESSAGE = "The result is an negative number!!";


    public NegativeNumberException(){
        super(STRING_VALIDATION_ERROR_MESSAGE);
    }


}
