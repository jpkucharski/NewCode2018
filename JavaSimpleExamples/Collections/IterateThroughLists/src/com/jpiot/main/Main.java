package com.jpiot.main;

import java.io.IOException;
import java.util.*;

public class Main {

    //WARNING !!!!
    //This program is creating contains a massive collections!
    //Check the memory status in VM settings!!
    // -Xms512M -Xmx8192M -XX:+UseG1GC -XX:MinHeapFreeRatio=15 -XX:MaxHeapFreeRatio=30

    private static final String STRING_TO_SEARCH = "String987654";
    private static final String STRING_TO_REMOVE = "String987653";
    private static final String STRING_FOR_REPLACEMENT = "String987654a";
    private static final int HOW_LONG_PROGRAM_SHOULD_KEEP_OBJECTS_IN_MEMORY = 5000;

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.run();
    }

    public void run() {
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "taskmgr");
        try {
            Process p = builder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MultiThreadListsFilling multiThreadListsFilling = new MultiThreadListsFilling();
        multiThreadListsFilling.run();
        System.out.println("Filling of collections completed.");
        System.out.println("Compere times for method contains(Object):");

        grabObjectAndCheckTime(multiThreadListsFilling.getArrayList(), STRING_TO_SEARCH);
        grabObjectAndCheckTime(multiThreadListsFilling.getLinkedList(), STRING_TO_SEARCH);
        grabObjectAndCheckTime(multiThreadListsFilling.getVector(), STRING_TO_SEARCH);
        grabObjectAndCheckTime(multiThreadListsFilling.getHashSet(), STRING_TO_SEARCH);
        grabObjectAndCheckTime(multiThreadListsFilling.getTreeSet(), STRING_TO_SEARCH);
        System.out.println("Iteration through collections times:");
        iterationThroughCollection(multiThreadListsFilling.getArrayList());
        iterationThroughCollection(multiThreadListsFilling.getLinkedList());
        iterationThroughCollection(multiThreadListsFilling.getVector());
        iterationThroughCollection(multiThreadListsFilling.getHashSet());
        iterationThroughCollection(multiThreadListsFilling.getTreeSet());
        System.out.println("Remove from collections times:");
        removeObjectFromCollection(multiThreadListsFilling.getArrayList(), STRING_TO_REMOVE);
        removeObjectFromCollection(multiThreadListsFilling.getLinkedList(), STRING_TO_REMOVE);
        removeObjectFromCollection(multiThreadListsFilling.getVector(), STRING_TO_REMOVE);
        removeObjectFromCollection(multiThreadListsFilling.getHashSet(), STRING_TO_REMOVE);
        removeObjectFromCollection(multiThreadListsFilling.getTreeSet(), STRING_TO_REMOVE);

            try {
                Thread.sleep(HOW_LONG_PROGRAM_SHOULD_KEEP_OBJECTS_IN_MEMORY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Erasing collections!!");
            clearingTheMemoryFromCollection(multiThreadListsFilling.getArrayList());
            clearingTheMemoryFromCollection(multiThreadListsFilling.getLinkedList());
            clearingTheMemoryFromCollection(multiThreadListsFilling.getVector());
            clearingTheMemoryFromCollection(multiThreadListsFilling.getHashSet());
            clearingTheMemoryFromCollection(multiThreadListsFilling.getTreeSet());

    }

    private void clearingTheMemoryFromCollection(Collection collection){
        collection.clear();
        System.gc();
        System.out.println(collection.getClass().getSimpleName() + "size=" + collection.size());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private List<String> fillTheList(List<String> list) {
        System.out.println("Filling the list!");
        List<String> filedList = null;
        for (int i = 0; i < 10000000; i++) {
            list.add("String" + i);
        }
        filedList = list;
        return filedList;
    }

    private void grabObjectAndCheckTime(Collection collection, String objectThatWeLookingFor) {
        if (collection != null) {
            double startTime = System.nanoTime();
            if (collection.contains(objectThatWeLookingFor)) {
                double elapsedTime = System.nanoTime() - startTime;
                System.out.println("Time to get Object from " + collection.getClass().getName() + " is: " + elapsedTime /1000000);
            } else {
                System.out.println("There Is Not in" + collection.getClass().getName() + " Object like  -> " + STRING_TO_SEARCH);
            }
        }
    }

    private void iterationThroughCollection(Collection collection) {
        double startTime = System.nanoTime();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
        }
        double elapsedTime = System.nanoTime() - startTime;
        System.out.println("Iteration Through Everything for " + collection.getClass().getSimpleName() + "Tuck: " + elapsedTime /1000000);
    }

    private void removeObjectFromCollection(Collection collection, String objectToRemove) {
        double startTime = System.nanoTime();
        collection.remove(objectToRemove);
        double elapsedTime = System.nanoTime() - startTime;
        System.out.println("Removing Object from " + collection.getClass().getSimpleName() + "tuck: " + elapsedTime /1000000);
    }
}
