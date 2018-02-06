package com.jpk.main;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueController {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue queue = new ArrayBlockingQueue(3);

        ProducerClass producer = new ProducerClass(queue);
        ConsumerClass consumer = new ConsumerClass(queue);

        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(5000);
        System.exit(0);
    }
}
