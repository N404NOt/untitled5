/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-08-29
 * Time: 11:20
 */
public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            public void run() {
                while (true) {
                    System.out.println("Hello Thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t.start();
        while (true) {
            System.out.println("Hello main");
            Thread.sleep(1000);
        }
    }
}
