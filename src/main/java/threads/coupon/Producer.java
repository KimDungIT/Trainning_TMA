package threads.coupon;

public class Producer extends Thread {
    int count = 0;
    CouponMachine cpm;
    Producer(CouponMachine cpm) {
        this.cpm = cpm;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cpm.createCoupon(++count);
            System.out.println("Coupon producer: " + count);
        }
    }
}
