package jpk.main;

public class ThreadsRunner {

    public static void main(String[] args){

        Thread t1 = new Thread(new ThreadImplementsRunnable(), "t1");
        Thread t2 = new Thread(new ThreadImplementsRunnable(), "t2");
        System.out.println("Starting Runnable Threads");
        t1.start();
        t2.start();
        System.out.println("Runnable Threads has been started");

        Thread t3 = new ThreadExtendsThread("t3");
        Thread t4 = new ThreadExtendsThread("t4");
        System.out.println("Starting Extends Threads");
        t3.start();
        t4.start();
        System.out.println("Extends Threads has been started");
    }
}
