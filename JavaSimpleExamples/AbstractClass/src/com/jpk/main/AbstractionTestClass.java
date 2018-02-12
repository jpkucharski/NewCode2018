package com.jpk.main;

abstract public class AbstractionTestClass {

    public int x = 0;
    private int value = 5;
    private static Integer counter = 0;
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
        counter = addOneToInteger(counter);
    }

    abstract public void print();

    public int getCounter() {
        return counter;
    }

    private static int addOneToInteger(Integer integer) {
        integer = integer + 1;
        return integer;
    }
}
