package com.jpk.main;

public class Main {

    public static void main (String[] args){

        User user1 = new User("peter", 35, "123");
        User user2 = new User("peter", 35, "123");

        System.out.println(user1.equals(user2));
    }
}
