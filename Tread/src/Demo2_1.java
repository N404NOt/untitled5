/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-08-30
 * Time: 7:50
 */
class MyRun implements Runnable {

    @Override
    public void run() {
        while(true) {
            System.out.println("Hello Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Demo2_1 {
    public static void main(String[] args) throws InterruptedException {
        MyRun myRun = new MyRun();
        Thread t = new Thread(myRun);
        t.start();
        while (true) {
            System.out.println("Hello main");
            Thread.sleep(1000);
        }
    }
}
