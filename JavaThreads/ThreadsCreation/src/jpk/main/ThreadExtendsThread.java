package jpk.main;

public class ThreadExtendsThread extends Thread{
    public ThreadExtendsThread(String threadName){
        super(threadName);
    }

    @Override
    public void run(){
        System.out.println("Processing start: " +  Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Processing stop: " +  Thread.currentThread().getName());
    }

    private void doProcessing() throws InterruptedException{
        Thread.sleep(5000);
    }

}
