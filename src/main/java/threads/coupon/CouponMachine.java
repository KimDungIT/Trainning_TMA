package threads.coupon;

public class CouponMachine {
    private int couponId;
    private boolean couponExists = false;

    public synchronized void createCoupon(int coup) {
        while (couponExists) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
        this.couponId = coup;
        couponExists = true;
        notify();
    }

    public synchronized int consumeCoupon() {
        while (!couponExists) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
        couponExists = false;
        notify();
        return couponId;

    }

}
