package com.jpk.main;

import java.util.*;

public class Main {

    private Map<String, Integer> hashMap;
    private ArrayList<String> keysList;
    private static Main main;

    public static void main(String[] args){
        main = new Main();
        main.run();
    }

    public void run(){
        main.createHashMap();
        main.sortHashMapByValues(hashMap);
        main.printResults();
    }

    private void printResults() {
        System.out.println("Printing results of sorting");
        for (String key: keysList) {
            System.out.println(hashMap.get(key));
        }
    }

    private void sortHashMapByValues(Map<String, Integer> hashMap) {
        System.out.println("Sorting hashMap");
      keysList = new ArrayList<>(hashMap.keySet());
      Collections.sort(keysList, new Comparator<String>() {
          @Override
          public int compare(String o1, String o2) {
              if(hashMap.get(o1)<hashMap.get(o2)){
                  return 1;
              }
              else{
                  return -1;
              }
          }
      });
    }

    private Map<String, Integer> createHashMap() {
        System.out.println("Creating hashMap");
        hashMap = new HashMap<>();

        hashMap.put("Beatrix", 22);
        hashMap.put("Vanilla", 77);
        hashMap.put("Margarita",33);
        hashMap.put("Tango",43);

        return hashMap;
    }


}
