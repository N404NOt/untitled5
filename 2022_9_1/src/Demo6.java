/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-09-01
 * Time: 10:16
 */
public class Demo6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() ->{
            while (true) {
                System.out.println("Hello Thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t.start();
        while (true){
            System.out.println("Hello main");
            Thread.sleep(1000);
        }
    }
}
