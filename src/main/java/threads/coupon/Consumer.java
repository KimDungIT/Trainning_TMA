package threads.coupon;

public class Consumer extends Thread {
    int count;
    CouponMachine cpm;
    Consumer(CouponMachine cpm) {
        this.cpm = cpm;
    }

    public void run() {
        count = cpm.consumeCoupon();
        System.out.println("Coupon consumed: " + count);
    }
}
