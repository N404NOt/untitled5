/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-08-29
 * Time: 11:27
 */
public class test {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true)
                System.out.println("Hello Thread");
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
