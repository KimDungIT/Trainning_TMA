package threads.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TenThread implements Runnable {
    private final static int POOL_SIZE = 10;

    public TenThread() throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(POOL_SIZE);
        for(int i = 0; i < POOL_SIZE; i++) {
            es.execute(this);//start thread
        }
        es.shutdown();
        boolean finished = es.awaitTermination(1, TimeUnit.MINUTES);
        if (finished) {
            System.out.println("All tasks done!!!");
        }
        // FIXME: review https://www.geeksforgeeks.org/countdownlatch-in-java/
    }

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName());
    }
}
