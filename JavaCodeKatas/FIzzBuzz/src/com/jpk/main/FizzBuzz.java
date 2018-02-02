package com.jpk.main;

public class FizzBuzz {

    private static final String FIZZ = "FIZZ";
    private static final String BUZZ = "BUZZ";
    private static final String NOT_FIZZ_OR_BUZZ = "NOT_FIZZ_OR_BUZZ";
    private static final String FIZZ_BUZZ = "FIZZ_BUZZ";
    private static final String ZERO_ERROR = "ZERO";

    public String fizzOrBuzz(int integer) {

        if(integer == 0){
            return ZERO_ERROR;
        }
        else if(integer % 3 == 0){
            if(integer % 5 == 0){
                return FIZZ_BUZZ;
            }
            return FIZZ;
        }
        else if(integer % 5 == 0){
            return BUZZ;
        }
        return NOT_FIZZ_OR_BUZZ;
    }
}
