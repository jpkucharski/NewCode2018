package com.jpk.main;

public class SimpleClass {

   private static int numberOfInstance;
   private final int number = 100;

    private static void increasingInstanceNumber() {
        numberOfInstance = numberOfInstance + 1;
    }

    public SimpleClass(){
        increasingInstanceNumber();
    }

    public void SimpleClassMainMethod(){
        System.out.println("From Simple class static and non-static variables.");
        System.out.println("Static variable numberOfInstance: " + numberOfInstance);
        System.out.println("non static variable: " + number);
    }
}
