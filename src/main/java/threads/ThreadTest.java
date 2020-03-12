package threads;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo threadDemo1 = new ThreadDemo("Google");
        threadDemo1.start();

        ThreadDemo threadDemo2 = new ThreadDemo("Yahoo");
        threadDemo2.start();

        ThreadDemo threadDemo3 = new ThreadDemo("Facebook");
        threadDemo3.start();
    }
}
