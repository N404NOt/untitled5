package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-18
 * Time: 9:35
 */
public class DisPlayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        int size=bookList.getUsedSize();
        for (int i = 0; i < size; i++) {
            System.out.println(bookList.getBooks(i));
        }
    }
}
