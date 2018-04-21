package com.jpk.main;


public class Main {


    public int add(int number){

        if(number == -5){
           throw new MyException("Error message!");
        }
        return number;
    }
}
