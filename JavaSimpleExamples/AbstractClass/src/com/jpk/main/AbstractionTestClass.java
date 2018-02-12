package com.jpk.main;

abstract public class AbstractionTestClass {

    public int x = 0;
    private int value = 5;
    private static int counter = 0;
    private final String EXCEPTION_VALUE = "FIVE";

    static {
        counter++; // <-- operation on class memory
    }

    public AbstractionTestClass() {

    }

    public AbstractionTestClass(String string) {
        if (string.equals(EXCEPTION_VALUE)) {
            x = value;
        }
        counter++; // <-- operation on class memory
        addOneToInteger(counter); //<-- memory allocation problem, counter was not changed!
    }

    abstract public void print();

    public int getCounter() {
        return counter;
    }

    private static int addOneToInteger(int integer) {
        integer = integer + 1;
        return integer;
    }
}
