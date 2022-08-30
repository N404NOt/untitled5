/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-08-29
 * Time: 11:27
 */
public class test {
    public static final long count = 10_0000_0000L;
    public static void main(String[] args) throws InterruptedException {
        serial();
        long begin =System.currentTimeMillis();
        Thread t1 = new Thread(() ->{
            long a =0;
            for (long i = 0; i < count; i++) {
                a++;
            }
        });
        Thread t2 = new Thread(() ->{
            long a = 0;
            for (long i = 0; i < count; i++) {
                a++;
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long end = System.currentTimeMillis();
        System.out.println("多线程时间:" + (end-begin));

    }
    public static void serial() {
        long a =0;
        long begin = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            a++;
        }
        a=0;
        for (int i = 0; i < count; i++) {
            a++;
        }
        long end = System.currentTimeMillis();
        System.out.println("单线程所用时间:" +(end - begin));
    }

   /* public static void Thr1() {
        class MyRun implements Runnable{

            @Override
            public void run() {
                for (int i = 0; i < count; i++) {
                    i++;
                }
            }
        }
        long begin = System.currentTimeMillis();
        MyRun myRun = new MyRun();
        Thread t1 = new Thread(myRun);
        Thread t2 = new Thread(myRun);
        t1.
    }*/
}
