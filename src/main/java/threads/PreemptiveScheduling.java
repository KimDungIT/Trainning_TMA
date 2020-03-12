package threads;

public class PreemptiveScheduling extends Thread {
    public static void main(String[] args) {
        PreemptiveScheduling ps = new PreemptiveScheduling();
        ps.start();
        System.out.println(ps.getPriority());
    }

}
