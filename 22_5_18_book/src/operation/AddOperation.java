package operation;
import book.Book;
import book.BookList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-18
 * Time: 9:33
 */
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入添加书籍的名称》");
        String name=scanner.nextLine();
        System.out.println("请输入作者的姓名》");
        String auther=scanner.nextLine();
        System.out.println("请输入书籍的价格》");
        int price=scanner.nextInt();
        System.out.println("请输入书籍的类型》");
        scanner.nextLine();
        String type=scanner.nextLine();
        Book book=new Book(name,auther,price,type);
        bookList.setBooks(bookList.getUsedSize(),book);
        System.out.println("添加成功！");
        bookList.setUsedSize(bookList.getUsedSize()+1);
    }
}
