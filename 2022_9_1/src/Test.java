/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-09-01
 * Time: 11:02
 */
public class Test {
    public static int a = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
           a=a+6;
        });
        t.start();
        t.join();
        System.out.println(a);
    }
}
