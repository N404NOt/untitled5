package operation;

import book.BookList;

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
    }
}
