package com.jpk.main;

public class Main {

    public static void main(String[] args) {

        AbstractionTestClass sClass = new SubClass("FIVE");
        sClass.print();
        AbstractionTestClass sClass1 = new SubClass();
        sClass1.print();
    }
}
