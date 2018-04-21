package com.jpk.main;


import com.jpk.exceptions.NegativeNumberException;

public class Calculator {


    public int add(String string) {
        int number = 0;

        String[] stringsArray = string.split("[,\n]");

        for (int i = 0; i < stringsArray.length; i++) {
            number = number + Integer.parseInt(stringsArray[i]);
        }
        if (number < 0) {
            throw new NegativeNumberException();
        }

        return number;
    }


}
