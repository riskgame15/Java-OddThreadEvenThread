
public class OddThread extends Thread {
    @Override
    public void run() {
        System.out.println("Odd numbers from 1 to 10:");
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Odd thread interrupted!");
        }
    }
}
