package threads.synchronize;

/**
 * A Class used to send a message
 */
public class Sender {
    public void send(String msg) {
        System.out.println("Sending\t" + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Threat interrupted");
        }
        System.out.println("\n" + msg + "Sent");
    }
}
