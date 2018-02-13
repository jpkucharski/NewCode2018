package com.jpk.main;

public class Main {
    public static void main(String[] args) {

        Thread t1 = (new Thread(() ->
        {
            Thread.currentThread().setName("task of Thread1...");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }));

        Thread t2 = (new Thread(() ->
        {
            Thread.currentThread().setName("task of Thread2...");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }));

        t1.start();
        t2.start();
        System.out.println("task1 is alive = " + t1.isAlive());
        try {
            t1.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After join() method");
        System.out.println("task1 is alive = " + t1.isAlive());
        System.out.println("Task after the threads execution...");
    }
}





