package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-14
 * Time: 1:19
 */
public class OuterClass {
   protected int data1=11;
    int data2=12;
    static int data3=13;
    int data4=14;
    private final static int data5=15;
    protected int data6=16;
    public void sout() {
        System.out.println("OuterClass的sout方法");
    }
    public OuterClass() {
        data1=666;
        System.out.println("OuterClass的默认构造");

    }
    {
        System.out.println("OuterClass的实例方法");
        System.out.println(data1);
    }
    static {
        System.out.println("OuterClass的静态方法");
    }
    void method1() {
        System.out.println("method1");
    }
    static void method2() {
        System.out.println("method2");
    }
    public class InnerClass {
        //data1=16;
        final static int data2=22;

        {
            System.out.println("InnerClass的实例方法");
            System.out.println(data3);
        }
        public void sout1() {
            //System.out.println(OuterClass.this.data1);
            System.out.println(OuterClass.data3);
            System.out.println(data3);
            System.out.println(OuterClass.data5);
            method2();
        }

    }
}
