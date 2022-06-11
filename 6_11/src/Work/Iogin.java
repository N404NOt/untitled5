package Work;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-06-11
 * Time: 19:15
 */
class IoginEvidence {
    private static final  String ne="wunipu";
    private static final String pd="123123";
    public static void evidence(String name,String password) throws NameError {
        if(!ne.equals(name)) {
            throw new PassWordError(password+"是错误");
        }
        if(!pd.equals(password)) {
            throw new NameError(name+"错的");
        }
    }
}
public class Iogin {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)) {
            System.out.println("请输入密码");
            String password=scanner.nextLine();
            System.out.println("请输入用户名");
            String name=scanner.nextLine();
            IoginEvidence.evidence(name,password);
        } catch ( RuntimeException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
        }  {
            System.out.println("finally执行了");
        }
    }

