
public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new OddThread();
        Thread t2 = new EvenThread();
        try {
            t1.start();
            t1.join();
            t2.start();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
