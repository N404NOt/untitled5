package operation;

import book.BookList;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-18
 * Time: 9:37
 */
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.println("请输入想要查找的图书》");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int size= bookList.getUsedSize();
        for (int i = 0; i < size; i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                System.out.println(bookList.getBooks(i));
                return;
            }
        }
        System.out.println("未找到你想要寻找的书");
    }
}
