package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-17
 * Time: 23:45
 */
public class BookList {
    private Book [] books=new Book[10];
    private int usedSize;
    public BookList() {
      //  books[0]= new String[]{"初始C语言", "比特鹏哥", 111, "学习"};
        books[0]=new Book("C语言原来如此", "比特鹏哥", 111, "学习");
        books[1]=new Book("Java学习很简单", "比特大博哥", 222, "学习");
        books[2]=new Book("C++学习一下吧", "比特杭哥", 333, "学习");
        usedSize=3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int size) {
        this.usedSize = size;
    }

    public Book getBooks(int pos) {
        return books[pos];
    }
    public void setBook(int pos,Book book) {
        books[pos]=book;
    }
}
