package concurrency;

public class ConcT implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from worker");
    }
}
