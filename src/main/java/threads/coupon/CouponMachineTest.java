package threads.coupon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CouponMachineTest {
    public static void main(String[] args) {
        CouponMachine cm = new CouponMachine();
        Consumer[] con = new Consumer[5];
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
//            con[i] = new Consumer(cm);
//            con[i].start();
            executorService.execute(new Consumer(cm));
        }
        Producer prod = new Producer(cm);
        prod.start();
        System.out.println("End main thread");
    }
}
