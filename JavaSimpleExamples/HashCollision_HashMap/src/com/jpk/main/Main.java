package com.jpk.main;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        HashMap<String, Person> hMap = new HashMap<String, Person>();

        hMap.put("person1", new Person("Agata", 17));
        hMap.put("person2", new Person("Agata", 17));

        hMap.forEach((s, person) -> System.out.println(person.getName()));
    }
}
