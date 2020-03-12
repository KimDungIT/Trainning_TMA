package threads.synchronize;

/**
 * Class for send a message using Threads
 */
public class ThreadedSend extends Thread {
    private String msg;
    Sender sender;

    // Receives a message object and a string
    // message to be sent
    ThreadedSend(String m,  Sender obj)
    {
        msg = m;
        sender = obj;
    }

    @Override
    public void run() {
        //Only one thread can send a message at a time
        synchronized (sender) {
            sender.send(msg);
        }
    }
}
