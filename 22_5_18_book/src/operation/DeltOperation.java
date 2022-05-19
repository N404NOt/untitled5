package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-18
 * Time: 9:35
 */
public class DeltOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入你想要删除书籍的名称》");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int size=bookList.getUsedSize();
        boolean key=false;
        for (int i = 0; i < size-1; i++) {
            if (bookList.getBooks(i).getName().equals(name)||key==true) {
                Book book=bookList.getBooks(i+1);
                bookList.setBooks(i,book);
            }

        }
        bookList.setUsedSize(bookList.getUsedSize()-1);
        System.out.println("删除成功！");
    }
}
