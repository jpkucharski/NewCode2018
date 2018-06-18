package com.jpk.main;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

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

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if((o1.toString().charAt(0))<(o2.toString().charAt(0))){
                    return -1;
                }
                if((o1.toString().charAt(0))>(o2.toString().charAt(0))){
                    return 1;
                }
                return 0;
            }
        };

        Collections.sort(listOfKeys, comparator);

        for (String element: listOfKeys) {
            System.out.println(element);
        }

    }

}
