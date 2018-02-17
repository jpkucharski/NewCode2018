package com.jpk.main.Main;

import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    private static final int NUMBER_OF_VALUES = 0;
    private Stack stack;


    public static void main(String[] args) {
        Main mainObj = new Main();
        mainObj.task();
    }

    private void task() {
        createStack();
        fillStackWithValues(NUMBER_OF_VALUES);
        try {
            System.out.println("Peek element: " + stack.peek());
        } catch (EmptyStackException e) {
            new RuntimeException(e.getMessage());
        }
        System.out.println("Index of 'Value5' value in stack: " + stack.search("Value5")); // <- its taking from the back !!
        iterateThoughtStack(stack);
        enumerateThoughtStack(stack);
        System.out.println("Stack size: " + getSizeOfStack(stack));
        System.out.println("Stack capacity: " + stack.capacity());
        try {
            System.out.println(stack.pop());
        } catch (EmptyStackException e) {
            new RuntimeException(e.getMessage());
        }
        System.out.println("Stack size after pop: " + getSizeOfStack(stack));
        System.out.println("Stack capacity after pop: " + stack.capacity());
    }

    private void enumerateThoughtStack(Stack stack) {
        Enumeration enumeration = stack.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println("Enumeration: " + enumeration.nextElement());
        }
    }

    private void iterateThoughtStack(Stack stack) {
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iteration: " + iterator.next());
        }
    }

    private void fillStackWithValues(int numberOfValues) {
        for (int i = 0; i < numberOfValues; i++) {
            stack.push("Value" + i);
        }
    }

    private Stack createStack() {
        stack = new Stack();
        return stack;
    }

    private int getSizeOfStack(Stack stack) {
        if (!stack.empty()) {
            return stack.size();
        }
        return 0;
    }
}
