import book.BookList;
import user.Adminer;
import user.Commoner;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-17
 * Time: 23:11
 */
public class Main {
    public static User login() {
        System.out.println("请输入你的名字");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("1:管理员   2：用户");
        int choice=scanner.nextInt();
        if(choice==1){
            return new Adminer(name);
        }else {
            return new Commoner(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user=login();
        while(true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }
}
