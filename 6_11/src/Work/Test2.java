package Work;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-11
 * Time: 18:44
 */
class MyError extends ArithmeticException{
    public static void Error(int a,String message) {
        try {
           a= 5/a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally执行了");
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        MyError.Error(0,"cuole cuole");
        System.out.println("endend");
    }
}
