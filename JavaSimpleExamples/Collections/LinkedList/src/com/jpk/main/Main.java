package com.jpk.main;

import java.util.LinkedList;
import java.util.List;

public class Main {

    private static List<String> linkedList;


    static{
        linkedList = new LinkedList<>();
    }



    public static void main(String[] args) {

        long startTime = System.nanoTime();
        Thread t1 = (new Thread(() ->
        {
            System.out.println("T1 Started!");
            for (int i = 0; i < 20000000; i++) {
                addToList(linkedList, "String" + i);
            }
        }));

//        Thread t2 = (new Thread(() ->
//        {
//            System.out.println("T2 Started!");
//            for (int i = 10000000; i < 20000000; i++) {
//                addToList(linkedList, "String" + i);
//            }
//        }));

        t1.start();
//        t2.start();
        try {
            t1.join();
//            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       long estimate = System.nanoTime()-startTime;
        System.out.println("Time = "+estimate);

       System.out.println(linkedList.size());

    }


    private static synchronized void addToList(List list, String element){
        list.add(element);
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




}
