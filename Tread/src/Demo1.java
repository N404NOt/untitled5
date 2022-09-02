/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-08-29
 * Time: 10:36
 */
class MyTread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello Thread ");
           /* try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        MyTread myTread = new MyTread();
        myTread.start();
        int i=0;
        while ( true) {
            System.out.println("Hello main");
            Thread.sleep(1000);
            i++;
            while (i==1) {
                myTread.interrupt();
            }
        }

    }
}
