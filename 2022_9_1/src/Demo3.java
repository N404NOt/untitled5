/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-09-01
 * Time: 10:06
 */
class MyRun implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello Thread");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        t.start();
        while(true) {
            System.out.println("Hello main");
            Thread.sleep(1000);
        }
    }
}
