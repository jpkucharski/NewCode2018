package com.jpk.main;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args)  {

        List<String> arrayList = new ArrayList<>();
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        List<String> linkedList = new LinkedList<>();
        Vector<String> vector = new Vector<>();
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<Enum> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> weakMap = new WeakHashMap<>();
//        Map<String, Integer> enumMap = new EnumMap<Enum<String>, Integer>();
        Map<String, Integer> identityMap = new IdentityHashMap<>();
        Map<String, Integer> hashtable = new Hashtable<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Dictionary<String, Integer> dictionary = new Hashtable<>();
        Properties properties = new Properties();
        Stack<String> stack = new Stack();
        String[] arrayOfStrings = new String[10];
        Queue<String> priorityQueue = new PriorityQueue<>();
        Queue<String> linkedListQueue = new LinkedList<>();
        Deque<String> deQueue = new ArrayDeque<>();
        BlockingQueue<String> blockingQueue = new SynchronousQueue<>();
        BlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<String>(10);
        BlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();
        BlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue<>();
        DelayQueue delayQueue = new DelayQueue<>();

        try {
            arrayListCapacity(arrayList);
            vectorCapacity(vector);
            hashSetCapacity(hashSet);
            hashMapCapacity(hashMap);
            priorityQueueCapacity(priorityQueue);
            linkedHashSetCapacity(linkedHashSet);
            copyOnWriteArrayListCapacity(copyOnWriteArrayList);
            linkedListCapacity(linkedList);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    private static void linkedListCapacity(List<String> linkedList) {
        System.out.println("LinkedList capacity = ???????");
    }

    private static void copyOnWriteArrayListCapacity(List<String> copyOnWriteArrayList) {
        System.out.println("CopyOnWriteArrayList = ?????");
    }

    private static void linkedHashSetCapacity(Set<String> linkedHashSet) {
        System.out.println("LinkedHashSet Capacity is Hardcoded = 16");
    }

    private static void priorityQueueCapacity(Queue<String> priorityQueue) throws NoSuchFieldException {
        Field capacity = priorityQueue.getClass().getDeclaredField("DEFAULT_INITIAL_CAPACITY");
        capacity.setAccessible(true);
    }

    private static void hashMapCapacity(Map<String, Integer> hashMap) throws NoSuchMethodException,
                                                                    InvocationTargetException, IllegalAccessException {
        Method hashMapCapacityMethod = hashMap.getClass().getDeclaredMethod("capacity");
        hashMapCapacityMethod.setAccessible(true);
        System.out.println("HashMap Capacity = " + hashMapCapacityMethod.invoke(hashMap));
    }

    private static void hashSetCapacity(Set<String> hashSet) throws NoSuchFieldException, IllegalAccessException,
                                                                NoSuchMethodException, InvocationTargetException {
            Field mapField = hashSet.getClass().getDeclaredField("map");
            mapField.setAccessible(true);
            Object map = mapField.get(hashSet);
            Method hashMapCapacity = mapField.get(hashSet).getClass().getDeclaredMethod("capacity");
            hashMapCapacity.setAccessible(true);
            System.out.println("HashSet Capacity = " + hashMapCapacity.invoke(map));
    }

    private static void arrayListCapacity(List<String> arrayList) throws NoSuchFieldException, IllegalAccessException {
        Field arrayListCapacityField = arrayList.getClass().getDeclaredField("DEFAULT_CAPACITY");
        arrayListCapacityField.setAccessible(true);
        System.out.println("ArrayList Capacity = "  + arrayListCapacityField.get(arrayList));
    }

    private static void vectorCapacity(Vector<String> vector) {
        System.out.println("Vector Capacity = " + vector.capacity());
    }

}
