package com.jpk.main;

public class FizzBuzz {

    private static final String FIZZ = "FIZZ";
    private static final String NOT_FIZZ_OR_BUZZ = "NOT_FIZZ_OR_BUZZ";

    public String fizzOrBuzz(int integer) {

        if(integer % 3 == 0){
            return FIZZ;
        }

        return NOT_FIZZ_OR_BUZZ;
    }


}
