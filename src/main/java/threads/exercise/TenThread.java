package threads.exercise;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// FIXME: review https://www.geeksforgeeks.org/countdownlatch-in-java/
public class TenThread implements Runnable {
    private final static int POOL_SIZE = 10;
    private CountDownLatch latch;

    public TenThread(CountDownLatch latch){
        this.latch = latch;
        ExecutorService es = Executors.newFixedThreadPool(POOL_SIZE);
        for(int i = 0; i < POOL_SIZE; i++) {
            es.execute(this);//start thread
        }
    }

    @Override
    public void run() {
        latch.countDown();
        System.out.println("Thread: " + Thread.currentThread().getName() + " finished");
    }
}
