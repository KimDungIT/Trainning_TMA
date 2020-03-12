package threads;

public class MultiThread {

    public static void main(String[] args) {
        new MyThread("One");
        new MyThread("Two");
        new MyThread("Three");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
