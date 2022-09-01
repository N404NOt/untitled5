/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-09-01
 * Time: 7:57
 */
public class Demo1 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        });
        t.start();
        System.out.println("2");
    }
}
