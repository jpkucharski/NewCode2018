package com.jpk.main;

import java.util.concurrent.BlockingQueue;

public class ProducerClass implements Runnable {

    private static final int NO_OF_PRODUCTS_CREATED_BY_THREAD = 5;
    protected BlockingQueue queue;

    public ProducerClass(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < NO_OF_PRODUCTS_CREATED_BY_THREAD; i++) {
                queue.put(i + Thread.currentThread().getName());
                System.out.println("Printed New product created by thread: " + i + Thread.currentThread().getName());
                Thread.sleep(100);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
