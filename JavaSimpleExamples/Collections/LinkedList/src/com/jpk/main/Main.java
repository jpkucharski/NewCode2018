package com.jpk.main;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


// -Xms512M -Xmx8192M -XX:+UseG1GC -XX:MinHeapFreeRatio=15 -XX:MaxHeapFreeRatio=30 !!!!!!!!!!!

public class Main {

    private static final String CONSTANS_STRING = "String";
    private static long startTime;
    private static long estimateTime;


    private static List<String> linkedList;

    public static void main(String[] args) {

        linkedList = new LinkedList<>();
        Collection<String> synchronizedLinkedList = Collections.synchronizedCollection(linkedList);

        System.out.println("Test of LinkedList filling method's using multithreaded system ");
        System.out.println("-----------------------------------------------------------");

        creatingByMainThread(synchronizedLinkedList);
        fillingByTwoThreads(synchronizedLinkedList);
        fillingByFourThreads(synchronizedLinkedList);
        synchronizedCreatingByMainThread(synchronizedLinkedList);
        synchronizedFillingByTwoThreads(synchronizedLinkedList);
        synchronizedFillingByFourThreads(synchronizedLinkedList);
    }

    private static void fillingByFourThreads(Collection<String> synchronizedLinkedList) {
        System.out.println("Collections.synchronizedCollection");
        System.out.println("Four Thread using for loop 10 millions records each");
        cleaningList(synchronizedLinkedList);
        System.gc();
        startTime = System.nanoTime();

        Thread t1 = (new Thread(() ->
        {
            for (int i = 0; i < 10000000; i++) {
                synchronizedLinkedList.add(CONSTANS_STRING + i);
            }
        }));

        Thread t2 = (new Thread(() ->
        {
            for (int i = 10000000; i < 20000000; i++) {
                synchronizedLinkedList.add(CONSTANS_STRING + i);
            }
        }));

        Thread t3 = (new Thread(() ->
        {
            for (int i = 20000000; i < 30000000; i++) {
                synchronizedLinkedList.add(CONSTANS_STRING + i);
            }
        }));

        Thread t4 = (new Thread(() ->
        {
            for (int i = 30000000; i < 40000000; i++) {
                synchronizedLinkedList.add(CONSTANS_STRING + i);
            }
        }));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        estimateTime = System.nanoTime() - startTime;
        System.out.println("Size of list: " + synchronizedLinkedList.size());
        System.out.println("Time to fill: " + estimateTime / 1000000);
        System.out.println("-----------------------------------------------------------");
    }

    private static void fillingByTwoThreads(Collection<String> synchronizedLinkedList) {
        System.out.println("Collections.synchronizedCollection");
        System.out.println("Two Thread using for loop 20millions records each");
        cleaningList(synchronizedLinkedList);
        System.gc();
        startTime = System.nanoTime();

        Thread t1 = (new Thread(() ->
        {
            for (int i = 0; i < 20000000; i++) {
                synchronizedLinkedList.add(CONSTANS_STRING + i);
            }
        }));

        Thread t2 = (new Thread(() ->
        {
            for (int i = 20000000; i < 40000000; i++) {
                synchronizedLinkedList.add(CONSTANS_STRING + i);
            }
        }));

        t1.start();
        t2.start();
        try {
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        estimateTime = System.nanoTime() - startTime;
        System.out.println("Size of list: " + synchronizedLinkedList.size());
        System.out.println("Time to fill: " + estimateTime / 1000000);
        System.out.println("-----------------------------------------------------------");
    }

    private static void creatingByMainThread(Collection<String> synchronizedLinkedList) {
        System.out.println("Collections.synchronizedCollection");
        System.out.println("Main Thread only simple for loop = 40 millions records");
        cleaningList(synchronizedLinkedList);
        System.gc();
        startTime = System.nanoTime();
        for (int i = 0; i < 40000000; i++) {
            synchronizedLinkedList.add(CONSTANS_STRING + i);
        }
        estimateTime = System.nanoTime() - startTime;
        System.out.println("Size of list: " + synchronizedLinkedList.size());
        System.out.println("Time to fill: " + estimateTime / 1000000);
        System.out.println("-----------------------------------------------------------");
    }

    private static void synchronizedFillingByFourThreads(Collection<String> synchronizedLinkedList) {
        System.out.println("Synchronized method add to List");
        System.out.println("Four Thread using for loop 10 millions records each");
        cleaningList(linkedList);
        System.gc();
        startTime = System.nanoTime();

        Thread t1 = (new Thread(() ->
        {
            for (int i = 0; i < 10000000; i++) {
                addToList(linkedList, CONSTANS_STRING + i);
            }
        }));

        Thread t2 = (new Thread(() ->
        {
            for (int i = 10000000; i < 20000000; i++) {
                addToList(linkedList, CONSTANS_STRING + i);
            }
        }));

        Thread t3 = (new Thread(() ->
        {
            for (int i = 20000000; i < 30000000; i++) {
                addToList(linkedList, CONSTANS_STRING + i);
            }
        }));

        Thread t4 = (new Thread(() ->
        {
            for (int i = 30000000; i < 40000000; i++) {
                addToList(linkedList, CONSTANS_STRING + i);
            }
        }));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        estimateTime = System.nanoTime() - startTime;
        System.out.println("Size of list: " + linkedList.size());
        System.out.println("Time to fill: " + estimateTime / 1000000);
        System.out.println("-----------------------------------------------------------");
    }

    private static void synchronizedFillingByTwoThreads(Collection<String> synchronizedLinkedList) {
        System.out.println("Synchronized method add to List");
        System.out.println("Two Thread using for loop 20millions records each");
        cleaningList(linkedList);
        System.gc();
        startTime = System.nanoTime();

        Thread t1 = (new Thread(() ->
        {
            for (int i = 0; i < 20000000; i++) {
                addToList(linkedList, CONSTANS_STRING + i);
            }
        }));

        Thread t2 = (new Thread(() ->
        {
            for (int i = 20000000; i < 40000000; i++) {
                addToList(linkedList, CONSTANS_STRING + i);
            }
        }));

        t1.start();
        t2.start();
        try {
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        estimateTime = System.nanoTime() - startTime;
        System.out.println("Size of list: " + linkedList.size());
        System.out.println("Time to fill: " + estimateTime / 1000000);
        System.out.println("-----------------------------------------------------------");
    }

    private static void synchronizedCreatingByMainThread(Collection<String> synchronizedLinkedList) {
        System.out.println("Synchronized method add to List");
        System.out.println("Main Thread only simple for loop = 40 millions records");
        cleaningList(linkedList);
        System.gc();
        startTime = System.nanoTime();
        for (int i = 0; i < 40000000; i++) {
            addToList(linkedList, CONSTANS_STRING + i);
        }
        estimateTime = System.nanoTime() - startTime;
        System.out.println("Size of list: " + linkedList.size());
        System.out.println("Time to fill: " + estimateTime / 1000000);
        System.out.println("-----------------------------------------------------------");

        System.out.println("Conclusion: Because thread locking then self's on List Object it will teake longer to put object i nto array.  ");



    }

    private static void cleaningList(Collection<String> synchronizedLinkedList) {
        synchronizedLinkedList.clear();
    }


    private static synchronized void addToList(Collection list, String element) {
        list.add(element);
    }

}

//    Implements List and Queue Interfaces!!
//    LinkedList Methods:
//        add(E e) <-- Appends the specified element to the end of this list.

//        add(int index, E element) <-- Inserts the specified element at the specified position in this list.

//        addAll(Collection<? extends E> c) <-- Appends all of the elements in the specified collection to the end of this list

//        addAll(int index, Collection<? extends E> c) <-- Inserts all of the elements in the specified collection into this list, starting at the specified position.

//        addFirst(E e) <-- Inserts the specified element at the beginning of this list.

//        addLast(E e) <-- Appends the specified element to the end of this list.

//        clear() <-- Removes all of the elements from this list.

//        clone() <-- Returns a shallow copy of this LinkedList.

//        contains(Object o) <-- Returns true if this list contains the specified element.

//        descendingIterator() <-- Returns an iterator over the elements in this deque in reverse sequential order.

//        element() <-- Retrieves, but does not remove, the head (first element) of this list.

//        get(int index) <-- Returns the element at the specified position in this list.

//        getFirst() <-- Returns the first element in this list.

//        getLast() <-- Returns the last element in this list.

//        indexOf(Object o) <-- Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.

//        lastIndexOf(Object o) <-- Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.

//        listIterator(int index) <-- Returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list.

//        offer(E e) <-- Adds the specified element as the tail (last element) of this list.

//        offerFirst(E e) <-- Inserts the specified element at the front of this list.

//        offerLast(E e) <-- Inserts the specified element at the end of this list.

//        peek() <-- Retrieves, but does not remove, the head (first element) of this list.

//        peekFirst() <-- Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.

//        peekLast() <-- Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.

//        poll() <-- Retrieves and removes the head (first element) of this list.

//        pollFirst() <-- Retrieves and removes the first element of this list, or returns null if this list is empty.

//        pollLast() <-- Retrieves and removes the last element of this list, or returns null if this list is empty.

//        pop() <-- Pops an element from the stack represented by this list.

//        push(E e) <-- Pushes an element onto the stack represented by this list.

//        remove() <-- Retrieves and removes the head (first element) of this list.

//        remove(int index) <-- Removes the element at the specified position in this list.

//        remove(Object o) <-- Removes the first occurrence of the specified element from this list, if it is present.

//        removeFirst() <-- Removes and returns the first element from this list.

//        removeFirstOccurrence(Object o) <-- Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).

//        removeLast() <-- Removes and returns the last element from this list.

//        removeLastOccurrence(Object o) <-- Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).

//        set(int index, E element) <-- Replaces the element at the specified position in this list with the specified element.

//        size() <-- Returns the number of elements in this list.

//        toArray() <-- Returns an array containing all of the elements in this list in proper sequence (from first to last element).

//        toArray(T[] a) <-- Returns an array containing all of the elements in this list in proper sequence (from first to last element)





