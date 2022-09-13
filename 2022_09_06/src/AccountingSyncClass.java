import java.util.Currency;

public class AccountingSyncClass implements Runnable{
    static int i=0;
    public synchronized static  void increase(){
        i++;
        //System.out.println(i);
        System.out.println(Thread.currentThread().getName());
    }

    public synchronized void increase4Obj(){
        i++;
    }
    @Override
    public void run() {
        for(int j=0;j<10;j++){
            increase();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        //new新实例
        Thread t1=new Thread(new AccountingSyncClass());
        //new心事了
        Thread t2=new Thread(new AccountingSyncClass());
        t1.setName("线程1");
        t2.setName("线程2");
        //启动线程
        t1.start();
        t2.start();
        t1.join();t2.join();
        System.out.println(i);
    }
}