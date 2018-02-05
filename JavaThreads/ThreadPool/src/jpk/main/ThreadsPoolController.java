package jpk.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsPoolController {

    private static final int NUMBER_OF_THREADS_IN_THREAD_POOL = 5;

    public static void main (String[] args){

        ExecutorService service = Executors.newFixedThreadPool(NUMBER_OF_THREADS_IN_THREAD_POOL);
        for(int i =0; i < 50; i++){
            service.submit(new ThreadTask(i));
        }
    }
}
