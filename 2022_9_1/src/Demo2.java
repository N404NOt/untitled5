/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-09-01
 * Time: 10:02
 */
class MyThread extends Thread{
    public void run() {
        while (true) {
            System.out.println("Hello Thread!");
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
        MyThread t = new MyThread();
        t.start();
        while (true) {
            System.out.println("Hello main");
            Thread.sleep(1000);
        }
    }
}
