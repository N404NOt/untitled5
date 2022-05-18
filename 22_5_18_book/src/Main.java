import book.BookList;
import users.AdminUser;
import users.NormalUser;
import users.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-18
 * Time: 9:21
 */
public class Main {
    public static User login() {
        System.out.println("欢迎来到图书系统！");
        System.out.println("请输入你的昵称》");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("1.用户登录    2.管理员登录");
        int user=scanner.nextInt();
        if(user==1){
            return new NormalUser(name);
        }else {
            return new AdminUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user=login();
        int choice=user.menu();
        user.doOperation(choice,bookList);

    }
}
