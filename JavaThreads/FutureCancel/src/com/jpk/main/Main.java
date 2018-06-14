package com.jpk.main;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        long startTime = System.nanoTime();

        Callable task1 = () -> {
            for (int i = 0; i < 20; i++) {
                Thread.sleep(100);
            }
            return "Peters Thread Has finished the job :)";
        };

        Future<String> future = executorService.submit(task1);
        while (!future.isDone()) {
            System.out.println("Task is still not done.");
            Thread.sleep(200);
            double elapsedTime = (System.nanoTime() - startTime) / 1000000000.0;

            if (elapsedTime > 1) {
                future.cancel(true);
            }

        }

        try {
            String result = future.get(10, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (CancellationException e) {
            System.out.println("It was canceled!!!");
        }
        executorService.shutdown();
    }
}