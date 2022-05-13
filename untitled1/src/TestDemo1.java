import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-13
 * Time: 14:55
 */
class OutClass {
    String name="徐凯";
    public  static int age=20;
    static void test() {
        System.out.println(age);
    }
    public OutClass(){
        this("带参数");
        System.out.println("默认构造");
    }
    public OutClass(String name){
        System.out.println(name+"构造");
    }
    class InnerClass{
        String name="徐凯二";
        public final static int a=5;
        {
            System.out.println(OutClass.this.name);
            System.out.println(a);
            //OutClass.this.age=9;
            System.out.println(OutClass.this.age);
            OutClass.test();
        }
        public InnerClass() {
            System.out.println("内部类构造");
        }
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
       // System.out.println(dog.this.age);
        OutClass test=new OutClass();
        OutClass.InnerClass inner=test.new InnerClass();
    }
}
