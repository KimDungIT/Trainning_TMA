package threads.producer_cunsumer;

public class Consumer extends Thread {
    Producer producer;
    Consumer(Producer p) {
        producer = p;
    }

    public static void main(String args[]) {
        Producer producer = new Producer();
        producer.start();
        new Consumer(producer).start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = producer.getMessage();
                System.out.println("Got message: " + message);
               // sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
