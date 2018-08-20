package com.jpk.main;

public class FizzBuzz {

    public String fizzBuzz(int number){

        if(number%5 == 0 && number%3==0){
            return "FIZZ_BUZZ";
        }

        else if(number%5==0){
            return "BUZZ";
        }

        else if(number%3==0){
            return "FIZZ";
        }

        return "NOT_DIVISIBLE_BY_5_AND_3";
    }
}
