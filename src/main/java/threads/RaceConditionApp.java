package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RaceConditionApp implements Runnable {

//    SecurityService service;
//
//    RaceConditionApp(SecurityService service) {
//        this.service = service;
//    }
//
//    SecurityService service = new SecurityServiceImpl();
    private final static int LOOP_LIMIT = 5;
    private final static int POOL_SIZE = 10;
    private int latestThreadNum = 0;

    public RaceConditionApp() {
        //service.register();
        ExecutorService taskList;
        taskList = Executors.newFixedThreadPool(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            taskList.execute(this);
        }
    }

    @Override
    public void run() {
        synchronized (this) {
            int currentThreadNum = latestThreadNum;
            System.out.println("Set currentThreadNum to " + currentThreadNum);
            latestThreadNum = latestThreadNum + 1;
        }
        for (int i = 0; i < LOOP_LIMIT; i++) {
            doSomethingWith(latestThreadNum);
        }
    }
    private void doSomethingWith(int threadNum) {}

}
