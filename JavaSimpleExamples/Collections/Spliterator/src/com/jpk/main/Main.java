package com.jpk.main;

import java.util.ArrayList;
import java.util.Spliterator;

public class Main {

    private final int CAPACITY_OF_LIST = 10;
    private ArrayList<String> arrayList;
    private Spliterator<String> spliterator;
    private Spliterator<String> spliteratorPartition1;
    private Spliterator<String> spliteratorPartition2;


    public static void main(String[] args){
        Main main = new Main();
        main .run();
    }

    private void run() {
        createList(CAPACITY_OF_LIST);
        splitTheList(arrayList);
        printingElementsInSpliterator(spliterator);
    }

    private void printingElementsInSpliterator(Spliterator spliterator) {
        System.out.println("Spliterator size: " + spliterator.estimateSize()); //<-- elements that has left in spliterator
        System.out.println("SpliteratorPartition1 size: " + spliteratorPartition1.estimateSize());
        System.out.println("SpliteratorPartition2 size: " + spliteratorPartition2.estimateSize());
    }

    private void splitTheList(ArrayList<String> arrayList) {
        spliterator = arrayList.spliterator();
        spliteratorPartition1 = spliterator.trySplit();
        spliteratorPartition2 = spliteratorPartition1.trySplit();
        System.out.println("SpliteratorPartition2: ");
        spliteratorPartition2.forEachRemaining((element)-> System.out.println(element));
        System.out.println("SpliteratorPartition1: ");
        spliteratorPartition1.forEachRemaining((element)-> System.out.println(element));
        System.out.println("spliterator:");
        spliterator.forEachRemaining((element)-> System.out.println(element));
    }

    private void createList(int size_of_list) {

        arrayList = new ArrayList<String>(CAPACITY_OF_LIST);

        for(int i=0; i<CAPACITY_OF_LIST; i++){
            arrayList.add("Object" + i);
        }
    }
}
