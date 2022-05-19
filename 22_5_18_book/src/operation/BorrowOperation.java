package operation;

import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-18
 * Time: 9:38
 */
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        System.out.println("请输入你要借阅书籍的名称》");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int size=bookList.getUsedSize();
        for (int i = 0; i < size; i++) {
            if(bookList.getBooks(i).getName().equals(name)) {
                bookList.getBooks(i).setBorrowed(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("未找到相关书籍！");
    }
}
