import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-27
 * Time: 7:09
 */
class NameException extends Exception {
    public NameException(String string) {
        super(string);
    }
}
class PassException extends Exception {
    public PassException(String message) {
        super(message);
    }
}
public class Test1 {
    public static void login(String name,String password) throws NameException,PassException{
        if(!name.equals("xukai")) {
            throw new NameException("用户名错误");
        }if (!password.equals("091301")) {
            throw new PassException("密码错误！");
        }
        System.out.println("登陆成功");

    }
    public static void main(String[] args) throws NameException,PassException {

        try{
            login("ukai","91301");
        }catch(NameException e) {
            e.printStackTrace();
            System.out.println("name解决");
        }catch(PassException e) {
            e.printStackTrace();
            System.out.println("pass解决");
        }
        System.out.println("最后了");
    }
}

