/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-09-06
 * Time: 23:43
 */
class Count{
    static int  num=0;
    public synchronized static void count() {
        for (int i = 0; i < 1_0000; i++) {
            num++;

        }
    }
}
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> Count.count());
        Thread t2 = new Thread(() ->Count.count());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(Count.num);
    }
}
