package com.jpk.main;

import java.util.*;

public class Main {

    private HashSet<String> setExample;
    private ArrayList arrayList;
    private Vector vector;
    private float aFloat = 1.2f;
    private double aDouble = 1.3;
    private int anInt = 1;

    public static void main (String[] args) {


        Main main = new Main();
        main.run();
        main.createArrayList();
        main.createVector();
    }

    private void createVector() {
        vector = new Vector();
        vector.add('x');
        vector.add(1.1);
        vector.add("String object");
        vector.add(true);
        System.out.println("Vector:");
        for (int x =0; x<vector.size();x++ ){
            System.out.println(vector.get(x));
        }
    }

    private void createArrayList() {

        arrayList = new ArrayList<>();
        arrayList.add(aFloat);
        arrayList.add(aDouble);
        arrayList.add('c');
        arrayList.add(anInt);
        arrayList.add("String object");

        System.out.println("Types From arrayList: ");
        for (Object e: arrayList ) {
            System.out.println(e.getClass().getSimpleName());
        }
        System.out.println("-------------------------");
    }

    private void run()  {

        System.out.println("Fields from Class:" );
        //System.out.println("Primitives: " + this.getClass().getDeclaredFields());
        for(int i =0; i<this.getClass().getDeclaredFields().length; i++){
            System.out.println(this.getClass().getDeclaredFields()[i].getName() + " = " + this.getClass().getDeclaredFields()[i].getGenericType());
        }
        System.out.println("-------------------------------------");

        System.out.println("");
        System.out.println("HashSet: ");

        setExample = new HashSet<>();
        setExample.add("Anastasia");
        setExample.add("Emilia");
        setExample.add("Natalia");
        setExample.add(null);

        System.out.println("Actual size of: " +  setExample.getClass().getSimpleName()+ " is: " + setExample.size());
        Iterator iterator = setExample.iterator();

        while (iterator.hasNext()){
            Object element = iterator.next();
            System.out.println(element);
            }
        System.out.println("------------------------------------");

        System.out.println("HashMap:");
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Sara");
        System.out.println("From hashMap: " + hashMap.get(1));
        System.out.println("HashMap size:" + hashMap.size());

        System.out.println("---------------------------------------");
    }
}
