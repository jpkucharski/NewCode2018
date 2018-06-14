package com.jpk.main;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main (String [] args){

        Map<String, Integer> hmap = new HashMap<>();

        hmap.put("Anita", 18 );
        hmap.put("Beata", 27);
        hmap.put("Anastazia", 33);
        hmap.put("Mark",77);

        Set<String > mapSs = hmap.keySet();
        List<String> listOfKeys = mapSs.stream().collect(Collectors.toList());
        listOfKeys.c

        for (String element: listOfKeys) {
            System.out.println(element);
        }

    }

}
