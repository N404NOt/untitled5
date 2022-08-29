/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-08-29
 * Time: 10:58
 */
class MyRunnable implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello Runnable");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }

}
public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();

        while (true) {

            System.out.println("Hello main");
            Thread.sleep(1000);
        }
    }
}
