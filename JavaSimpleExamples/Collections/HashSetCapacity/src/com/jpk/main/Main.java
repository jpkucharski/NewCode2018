package com.jpk.main;



import com.sun.jmx.remote.internal.ArrayQueue;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

    public static void main (String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Queue<?> queue = new PriorityQueue<>();

        Field capacity = queue.getClass().getDeclaredField("DEFAULT_INITIAL_CAPACITY");
        capacity.setAccessible(true);
        System.out.println("PriorityQueue capacity = " + capacity.get(queue));

        Set<?> linkedSet = new LinkedHashSet<>();

        Set<String> hashSet = new HashSet<>();

        Field mapField = hashSet.getClass().getDeclaredField("map");
        mapField.setAccessible(true);
        Object map = mapField.get(hashSet);
        Method hashMapCapacity = mapField.get(hashSet).getClass().getDeclaredMethod("capacity");
        hashMapCapacity.setAccessible(true);
        System.out.println("HashSet Capacity = " + hashMapCapacity.invoke(map));

    }




}
