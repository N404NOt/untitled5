package test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-11
 * Time: 15:48
 */
class outerDemo {
    int t1=11;
    int t2=12;
    public static int t3=13;
    class innerDemo {
        int t1=22;
        int t4=24;
        public static final int t5=25;
         void sout(innerDemo this) {
            System.out.println(t1);
            System.out.println(outerDemo.this.t1);
            System.out.println(outerDemo.t3);
        }
    }
}
public class Test {
    public static void main(String[] args) {

    }
}
