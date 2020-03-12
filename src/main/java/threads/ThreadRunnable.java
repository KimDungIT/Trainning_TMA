package threads;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from thread");
    }

    public static void main(String[] args) {
        Thread t= new Thread(new ThreadRunnable());
        t.start();
    }
}
