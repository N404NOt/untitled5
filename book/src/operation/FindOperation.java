package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-18
 * Time: 0:28
 */
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.println("请入你要查找的图书》");
        Scanner scanner=new Scanner(System.in);
        String bookname=scanner.nextLine();
        int size= bookList.getUsedSize();
        for (int i = 0; i < size; i++) {
            Book book=bookList.getBooks(i);
            if(book.getName().equals(bookname)){
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有该书籍！");
    }
}
