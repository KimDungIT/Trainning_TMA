package threads;

public class MyThread implements Runnable {
    private String name;
    private Thread t;
    MyThread(String thread) {
        name = thread;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " exiting");
    }


}
