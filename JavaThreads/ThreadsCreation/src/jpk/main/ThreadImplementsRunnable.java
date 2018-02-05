package jpk.main;

public class ThreadImplementsRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Processing start" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            doProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processing stop" + Thread.currentThread().getName());
    }
    private void doProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
}