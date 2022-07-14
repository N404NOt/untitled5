import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-13
 * Time: 14:36
 */

class Base {
        Base() {
            System.out.print("Base");
        }
    }
    public class Alpha extends Base {
        public static void main(String[] args) {
            new Alpha();
//调用父类无参的构造方法
            new Base();
            Scanner scanner=new Scanner(System.in);
        }
    }

