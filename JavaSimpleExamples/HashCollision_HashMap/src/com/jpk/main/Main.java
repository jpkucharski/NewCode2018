package com.jpk.main;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        HashMap<Person, Integer> hMap = new HashMap<Person, Integer>();
        Person p1 =  new Person("Agata", 17);
        Person p2 = new Person("Agata", 17);



        System.out.println("p1 hashcode = " + p1.hashCode());
        System.out.println("p2 hashcode = " + p2.hashCode());
        System.out.println("Are p1 and p2 equals? = " + p1.equals(p2));
        System.out.println("Adding p1 to hashMap");
        hMap.put(p1,17);
        System.out.println("Adding p2 to hashMap");
        hMap.put(p2,33);
        System.out.println("Map size = " + hMap.size());
        hMap.forEach((k, v) -> System.out.println("Key  = "  + k.getName() + " / " +"Value = " + v.intValue()));


    }
}
