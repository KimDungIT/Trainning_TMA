package threads.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InnerClassRunnable {
    public InnerClassRunnable() {
        ExecutorService taskList = Executors.newFixedThreadPool(100);
        taskList.execute(new Counter(6));
        taskList.execute(new Counter(5));
        taskList.execute(new Counter(4));
        taskList.shutdown();
    }

    private class Counter implements Runnable {
        private final int loopLimit;

        public Counter(int loopLimit) {
            this.loopLimit = loopLimit;
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

}
