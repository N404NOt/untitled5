/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-13
 * Time: 16:06
 */
class InnerClass {
    String name="徐凯";
    int age=20;

    //@Override
    /*public String toString() {
        return "InnerClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
}
public class TestDemo2 {
    public static void main(String[] args) {
        InnerClass innerclass=new InnerClass();
        System.out.println(innerclass);
    }
}
