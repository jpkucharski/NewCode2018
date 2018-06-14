package com.jpk.main;

public class Main {

    public static void main(String args[]) throws InterruptedException {
        Main f1 = new Main();
        Main f2 = new Main();
        Main f3 = new Main();
        f1 = null;
        f2 = null;
        f3 = null;
        System.gc();
    Thread.sleep(10);
    }

    public void finalize() {
        System.out.println("Finalize is called");
    }
}

