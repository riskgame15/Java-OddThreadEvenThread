
public class EvenThread extends Thread {
    @Override
    public void run() {
        System.out.println("Even numbers from 1 to 10:");
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Even thread interrupted!");
        }
    }
}
