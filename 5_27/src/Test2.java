/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-27
 * Time: 7:51
 */
class UserNameException extends Exception {
    public UserNameException(String message) {
        super(message);
    }
}
class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}
public class Test2 {


     public static void loginInfo(String userName, String password) throws UserNameException,PasswordException{
         String useName = "admin";
         String pasword = "123456";
            if (!userName.equals(useName)) {
                throw new UserNameException("用户名错误！");
            }
            if (!password.equals(pasword)) {
                throw new PasswordException("用户名错误！");
            }
            System.out.println("登陆成功");
        }
        public static void main(String[] args) {
            try {
                loginInfo("admn", "12456");
            } catch (UserNameException e) {
                e.printStackTrace();
            } catch (PasswordException e) {
                e.printStackTrace();
            }
        }
    }

