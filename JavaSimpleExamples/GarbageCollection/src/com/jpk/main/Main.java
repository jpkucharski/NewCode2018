package com.jpk.main;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 30000000; i++) {
                        new String(i + "");
                        System.gc();  //<-- garbage collection is prohibiting the memory overload.
                    }
                }
            }).start();
        }
    }
}
