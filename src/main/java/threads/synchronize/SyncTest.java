package threads.synchronize;

public class SyncTest {
    public static void main(String[] args) {
        Sender snd = new Sender();
        ThreadedSend firstThreadedSend = new ThreadedSend(" Hi ", snd);
        ThreadedSend secondThreadedSend = new ThreadedSend(" Bye ", snd);

        // Start two threads of ThreadedSend type
        firstThreadedSend.start();
        secondThreadedSend.start();

        //wait for threads to end
        try {
            firstThreadedSend.join();
            secondThreadedSend.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
