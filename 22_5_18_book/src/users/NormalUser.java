package users;

import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-18
 * Time: 9:40
 */
public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.iOperations=new IOperation[] {
                new ExitOperation(),
                new DisPlayOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperaion()
        };
    }

    @Override
    public int menu() {
        System.out.println("hello "+name);
        System.out.println("1.显示图书");
        System.out.println("2.查找图书");
        System.out.println("3.借阅图书");
        System.out.println("4.归还图书");
        System.out.println("0.退出系统");
        System.out.println("请输入你的操作》");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;

    }
}
