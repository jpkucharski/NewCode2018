package com.jpk.main;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.concurrent.*;

public class Main {
    public static void main (String[] args) throws ExecutionException, InterruptedException {
        Tutorial_1();
        Tutorial_2();
    }



    private static void Tutorial_1() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String>  callable = () -> {
            System.out.println("Entered Callable");
            Thread.sleep(2000);
            return "Hello from callable";
        };

        System.out.println("Submitting callable");
        Future<String> future = executorService.submit(callable);

        System.out.println("Do something else while callable is getting executed.");
        System.out.println("Retrieve the result from future.");
        String result = future.get();
        System.out.println(result);

        executorService.shutdown();
    }

    private static void Tutorial_2() throws InterruptedException, ExecutionException{
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future2 = executorService.submit(() -> {
            Thread.sleep(2000);
            return "Hello from Callable";
        });


        while(!future2.isDone()){
            System.out.println("Task is still not done...");
            Thread.sleep(200);
        }

        System.out.println("Task completed! Retrieving the result");
        String result = future2.get();
        System.out.println(result);
        executorService.shutdown();
    }




}
