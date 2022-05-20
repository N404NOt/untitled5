package book;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-18
 * Time: 9:25
 */
public class BookList {
    Book books[]=new Book[10];
    private int usedSize;
    public BookList() {
        books[0]=new Book("西游记", "吴承恩", 111, "名著");
        books[1]=new Book("三国演义", "罗贯中", 222, "名著");
        books[2]=new Book("红楼梦", "曹雪芹", 333, "名著");
        usedSize=3;
    }

    public Book getBooks(int pos) {
        return books[pos];
    }
    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public void setBooks(int pos,Book book) {
        this.books[pos] = book;
    }
}
