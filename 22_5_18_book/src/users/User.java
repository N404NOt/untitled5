package users;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-18
 * Time: 9:40
 */
public abstract class User {
    protected String name;
    protected IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();
    public void doOperation(int choice, BookList bookList) {
        this.iOperations[choice].work(bookList);

    }
}
