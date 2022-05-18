package operation;

import book.BookList;

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
    }
}
