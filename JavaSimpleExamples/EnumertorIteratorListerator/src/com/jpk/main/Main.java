package com.jpk.main;

import java.util.*;

public class Main {

    private static HashMap<String, Long> results;

    public static void main(String[] args) throws InterruptedException {

        results = new HashMap<>();
        Vector<String> vectors = new Vector<>();
        System.out.println("Filing vector:");
        for (int i = 0; i < 10000000; i++) {
            vectors.addElement("String" + i);
        }
        System.out.println("Size of vectors: " + vectors.size());
        enumeration(vectors);
        System.gc();
        Thread.sleep(100);
        iteration(vectors);
        System.gc();
        Thread.sleep(100);
        listeration(vectors);
        System.gc();
        Thread.sleep(100);
        forEachLoop(vectors);
        System.gc();
        sortingResults(results);
    }

    private static void sortingResults(HashMap<String, Long> results) {
        sortingHashMapValues(results);
    }

    private static void forEachLoop(Vector<String> vectors) {
        System.out.println("ForEachLoop:");
        long startTime = System.nanoTime();
        for (String s : vectors) {
            String element = s;
        }
        long elapsedTime = (System.nanoTime() - startTime) / 100000;
        results.put("ForEach", elapsedTime);
    }

    private static void listeration(Vector<String> vectors) {
        System.out.println("Listerator:");
        ListIterator<String> listerator = vectors.listIterator();
        long startTime = System.nanoTime();
        while (listerator.hasNext()) {
            String element = listerator.next();
        }
        long elapsedTime = (System.nanoTime() - startTime) / 100000;
        results.put("Listerator", elapsedTime);
    }

    private static void iteration(Vector<String> vectors) {
        System.out.println("Iteration:");
        Iterator<String> iterator = vectors.iterator();
        long startTime = System.nanoTime();
        while (iterator.hasNext()) {
            String element = iterator.next();
        }
        long elapsedTime = (System.nanoTime() - startTime) / 100000;
        results.put("Iterator", elapsedTime);
    }

    private static void enumeration(Vector<String> vectors) {
        System.out.println("Enumeration:");
        Enumeration<String> enumerator = vectors.elements();

        long startTime = System.nanoTime();
        while (enumerator.hasMoreElements()) {
            String element = enumerator.nextElement();
        }
        long elapsedTime = (System.nanoTime() - startTime) / 100000;
        results.put("Enumeration", elapsedTime);
    }

    private static void sortingHashMapValues(HashMap<String, Long> hashMap) {
        System.out.println("After sorting results!!");
        List keys = new ArrayList<>(hashMap.keySet());


        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                    String o1Key = (String) o1;
                    String o2Key = (String) o2;
                    Long leftValue = hashMap.get(o1Key);
                    Long rightValue = hashMap.get(o2Key);
                    return leftValue.compareTo(rightValue);

            }
        };

        Collections.sort(keys, comparator);

        for (Iterator i = keys.iterator(); i.hasNext(); ) {
            Object k = i.next();
            System.out.println(k + " " + hashMap.get(k));
        }
    }


}
