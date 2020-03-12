package threads;

public class ThreadExample extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from thread!");
    }

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        threadExample.start();
        System.out.println("hello");
    }
}
