package com.jpk.main;

public class SubClass extends AbstractionTestClass {

//    private int x =2; //<-- this data member overriding x variable from superclass

    public SubClass() {
    }

    public SubClass(String string) {
        super(string);
    }

    @Override
    public void print() {
        System.out.println("Value of x = " + x + " / Counter number = " + super.getCounter());
    }
}
