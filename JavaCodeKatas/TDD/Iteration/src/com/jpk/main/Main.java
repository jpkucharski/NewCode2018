package com.jpk.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    public static void main (String[] args){
        ArrayList<String> list1 = new ArrayList<>();
        for(int i = 0; i <= 5; i++){
            list1.add("String" + i);
        }
        System.out.println("--------- Iterator ---------");


        Iterator<String> iterator = list1.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println("--------- ListIterator ---------");

        ListIterator listIterator = list1.listIterator();

        while(listIterator.hasNext()){
            Object element = listIterator.next();
            System.out.println(element);
        }

        System.out.println("--------- For each ---------");

        for(String element : list1){
            System.out.println(element);
        }

    }
}
