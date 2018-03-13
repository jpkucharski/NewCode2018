package com.jpiot.main;

import java.util.*;

public class MultiThreadListsFilling {

    //WARNING !!!!
    //This program is creating contains a massive collections!
    //Check the memory status in VM settings!!
    // -Xms512M -Xmx8192M -XX:+UseG1GC -XX:MinHeapFreeRatio=15 -XX:MaxHeapFreeRatio=30






    ArrayList<String> arrayList;
    LinkedList<String> linkedList;
    HashSet<String> hashSet;
    Vector vector;
    TreeSet<String> treeSet;

    public MultiThreadListsFilling(ArrayList arrayList, LinkedList linkedList, HashSet hashSet, Vector vector, TreeSet treeSet) {
        this.arrayList = arrayList;
        this.linkedList = linkedList;
        this.hashSet = hashSet;
        this.vector = vector;
        this.treeSet = treeSet;
    }

    public void run(){

        Thread t1 = (new Thread(() ->
        {
            System.out.println(Thread.currentThread().getName()+" start filing ArrayList");
            arrayList = new ArrayList();
            double startTime = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                arrayList.add("String"+i);
            }
            double elapsedTime = System.nanoTime()-startTime;
            System.out.println("ArrayList stop.tuck time: " + elapsedTime/1000000);
        }));

        Thread t2 = (new Thread(() ->
        {
            System.out.println(Thread.currentThread().getName()+" start filling LinkedList ;");
            linkedList = new LinkedList<>();
            double startTime = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                linkedList.add("String"+i);
            }
            double elapsedTime = System.nanoTime()-startTime;
            System.out.println("LinkedList stop.tuck time: " + elapsedTime/1000000);
        }));

        Thread t3 = (new Thread(() ->
        {
            System.out.println(Thread.currentThread().getName()+" start filing HashSet;");
            hashSet = new HashSet<>();
            double startTime = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                hashSet.add("String"+i);
            }
            double elapsedTime = System.nanoTime()-startTime;
            System.out.println("HashSet stop. tuck time: " + elapsedTime/1000000);
        }));

        Thread t4 = (new Thread(() ->
        {
            System.out.println(Thread.currentThread().getName()+" start filling Vector;");
            vector = new Vector();
            double startTime = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                vector.add("String"+i);
            }
            double elapsedTime = System.nanoTime()-startTime;
            System.out.println("Vector stop. tuck time: " + elapsedTime/1000000);
        }));
        Thread t5 = (new Thread(() ->
        {
            System.out.println(Thread.currentThread().getName()+" start filling TreeSet;");
            treeSet = new TreeSet<>();
           double startTime = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                treeSet.add("String"+i);
            }
            double elapsedTime = System.nanoTime()-startTime;
            System.out.println("TreeSet stop. tuck time: " + elapsedTime/1000000);
        }));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public LinkedList<String> getLinkedList() {
        return linkedList;
    }

    public HashSet<String> getHashSet() {
        return hashSet;
    }

    public Vector getVector() {
        return vector;
    }

    public TreeSet<String> getTreeSet() {
        return treeSet;
    }
}