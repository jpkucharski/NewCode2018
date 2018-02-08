package com.jpk.main;

public class Main {

    static {
        System.out.println("Before Main method from static block!");
    }

    public static void main(String[] args) {
        System.out.println("From main Class.");
        int i = 0;
        while (i < 3) {
            creatingInstanceOfClass();
            i++;
        }
    }

    private static void creatingInstanceOfClass() {
        new SimpleClass().SimpleClassMainMethod();
    }
}
