package threads.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainAppRunnable implements Runnable {
    private final int loopLimit;

    public MainAppRunnable(int loopLimit) {
        this.loopLimit = loopLimit;
        ExecutorService taskList = Executors.newFixedThreadPool(100);
        taskList.execute(this);
        taskList.execute(this);
        taskList.execute(this);
        taskList.shutdown();
    }

    private void pause(double seconds) {
        try {
            Thread.sleep(Math.round(1000.0 * seconds));
        } catch (InterruptedException e) { }
    }


    @Override
    public void run() {
        for (int i = 0; i < loopLimit; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.printf("%s: %s%n", threadName, i);
            pause(Math.random());
        }
    }
}
