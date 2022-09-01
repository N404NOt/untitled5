import java.security.PublicKey;
import java.util.Random;

import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.D;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-09-01
 * Time: 10:22
 */
class Num {
    public static void get(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100)+1;
        }
    }
}
public class Demo7 {
    public static int N = 1000_0000;
    public static long D=0L;
    public static long E=0L;
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[N];
        Num.get(array);
        Thread t = new Thread(() ->{
            for (int i = 0; i < array.length; i=i+2) {
                D=array[i]+D;
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i < array.length; i=i+2) {
                    E=array[i]+E;
                }
            }
        });
        t.start();
        t2.start();
        t.join();
        t2.join();
        System.out.println("SUM=" + (D+E));
    }
}
