/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-09-01
 * Time: 11:11
 */
class Create{
    public static int i = 0;
    public static Thread[] t = new Thread[20];
    public static void create(int num) {
        while (i<num) {
            t[i++] = new Thread(() ->{
                System.out.printf("%d\n" ,i++);
            });
        }
        i=0;

    }
}
public class More_Thread {
    public static void main(String[] args) {
        int num = 20;
        Create.create(num);
        for (int i = 0; i < num; i++) {
            Create.t[i].start();
        }
        System.out.println("Hello main");

    }
}
