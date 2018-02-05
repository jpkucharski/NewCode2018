package jpk.main;

public class ThreadTask implements Runnable {
    private int taskId;

    public ThreadTask(int id) {
        this.taskId = id;
    }
    @Override
    public void run() {
        System.out.println("TaskId: " + this.taskId + ", preformed by Thread named: " + Thread.currentThread().getName());
    }
}
