package com.jpk.main;


import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {

        Hashtable<String, Double> balance = new Hashtable();

        balance.put("Anita", new Double(1212.34));
        balance.put("Martin", new Double(145.00));
        balance.put("Arlin", new Double(1378.99));
        balance.put("Bart", new Double(100.00));
        balance.put("Zachary", new Double(-29.18));

       Enumeration namesList = balance.keys();

        while(namesList.hasMoreElements()){
            String element =  namesList.nextElement().toString();
            System.out.println(element + ": " + balance.get(element));
        }

        System.out.println("-----------------");
        System.out.println("Adding 1000 to Martin account!");

        Double accountBalance = balance.get("Martin");
        balance.put("Martin", new Double(accountBalance + 1000));
        System.out.println("Martin balance = " + balance.get("Martin"));
    }
}
