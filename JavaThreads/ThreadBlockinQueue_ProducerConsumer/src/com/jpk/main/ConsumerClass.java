package com.jpk.main;

import java.util.concurrent.BlockingQueue;

public class ConsumerClass implements Runnable {

    private BlockingQueue queue;


    public ConsumerClass(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while(true) {
                System.out.println("Taken by: " + Thread.currentThread().getName() + " product no.: " + queue.take());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
