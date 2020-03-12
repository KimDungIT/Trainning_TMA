package threads.exercise;

import java.util.concurrent.CountDownLatch;

public class TenThreadTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(10);

        new TenThread(latch);

        // The main task waits for ten threads
        latch.await();
        System.out.println("All tasks done!!!");
    }
}
