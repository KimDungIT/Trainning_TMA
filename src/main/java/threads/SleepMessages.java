package threads;

public class SleepMessages {

    public static void main(String[] args) throws InterruptedException {
        String importantInfo[] = {"Mares eat oats", "Does eat oats", "Little lambs eat ivy", "A kid will eat ivy too"};
        for (String importantString : importantInfo) {
            //Pause for 4 second
            Thread.sleep(4000);
            //Print message
            System.out.println(importantString);
        }
    }
}
