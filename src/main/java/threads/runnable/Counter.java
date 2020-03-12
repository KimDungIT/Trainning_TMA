package threads.runnable;

public class Counter implements Runnable{

    private final SeparateClassesRunnable mainApp;
    private final int loopLimit;

    public Counter(SeparateClassesRunnable mainApp, int loopLimit) {
        this.mainApp = mainApp;
        this.loopLimit = loopLimit;
    }

    @Override
    public void run() {
        for (int i = 0; i < loopLimit; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.printf("%s: %s%n", threadName, i);
            mainApp.pause(Math.random());
        }
    }
}
