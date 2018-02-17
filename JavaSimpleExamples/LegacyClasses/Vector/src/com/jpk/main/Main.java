package com.jpk.main;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

    private static final int NUMBER_OF_ELEMENTS = 10;
    private static final int VECTOR_CAPACITY = 20;
    private Vector vector;


    public static void main(String[] args) {
        Main mainObject = new Main();
        mainObject.task();
    }

    private void task() {
        creatingVector(VECTOR_CAPACITY);
        fillVectorVithObjects(NUMBER_OF_ELEMENTS);
        printAllElementsOfVectorUsingIterator(vector);
        System.out.println("First Element in vector: " + vector.firstElement());
        System.out.println("Last element in vector: " + vector.lastElement());
        printAllElementsOfVectorUsingEnumerator(vector);
        System.out.println("vector size: " + vector.size());
        System.out.println("vector capacity: " + vector.capacity());
        System.out.println(vector.removeAll(vector));
        System.out.println("vector size: " + vector.size());
        System.out.println("vector capacity: " + vector.capacity());
    }

    private void fillVectorVithObjects(int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++) {
            vector.addElement("Vector" + i);
        }
    }

    private void printAllElementsOfVectorUsingEnumerator(Vector vector) {
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println("From Enumerator: " + enumeration.nextElement());
        }
    }

    private Vector creatingVector(int capacity) {
        vector = new Vector(capacity);
        return vector;
    }

    private void printAllElementsOfVectorUsingIterator(Vector vector) {
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println("From Iterator: " + iterator.next());
        }
    }
}
