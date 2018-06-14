package com.jpk.main;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException{

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable task1 = () -> {
            for (int i = 0; i < 20; i++) {
                Thread.sleep(100);
            }
            return "Peters Thread Has finished the job :)";
        };

        Future<String> future = executorService.submit(task1);

        while(!future.isDone()){
            System.out.println("Task is still not done");
            Thread.sleep(200);
        }

        System.out.println("Task completed!");
        String result = future.get();
        System.out.println(result);

        executorService.shutdown();

    }



}
