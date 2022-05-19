package operation;

import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-18
 * Time: 9:39
 */
public class ReturnOperaion implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("请输入你要归还图书的名称》");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if(bookList.getBooks(i).getName().equals(name)) {
                bookList.getBooks(i).setBorrowed(true);
                System.out.println("归还成功！期待下次借阅！");
                return;
            }
        }
        System.out.println("未找到此书籍！归还失败！请到前台咨询此服务！");
    }
}
