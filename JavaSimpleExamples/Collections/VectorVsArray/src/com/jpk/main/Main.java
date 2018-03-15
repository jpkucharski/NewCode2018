package com.jpk.main;

import javax.swing.text.html.HTMLDocument;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector heterogeneousVector = new Vector();
        heterogeneousVector.add(1);
        heterogeneousVector.add("Name");
        heterogeneousVector.add('c');
        heterogeneousVector.add(new Object());

        Vector<String> homogeniseVector = new Vector<>();
        homogeniseVector.add("String1");
        homogeniseVector.add("String2");
        homogeniseVector.add("String3");
        homogeniseVector.add("String4");

        System.out.println("----------Iteration on Vector-----------");
        Iterator iter = heterogeneousVector.iterator();
        while(iter.hasNext()){
            Object element = iter.next();
            System.out.println(element);
        }

        System.out.println("----------Enumeration on Vector-------------");
        Enumeration enumeration = homogeniseVector.elements();
        while (enumeration.hasMoreElements()){
            Object element = enumeration.nextElement();
            System.out.println(element);
        }

        System.out.println("------------For each on Array----------");
        int[] primitiveArray = {1,2,3,4,5,6,7,8,9,10};
        String[] objectArray = {"Cat", "Dog", "Rabbit"};

        for( int e: primitiveArray){
            System.out.println(e);
        }
        System.out.println("---------For loop on Array---------");
        for(int i = 0; i < objectArray.length; i++){
            System.out.println(objectArray[i]);
        }
    }
}