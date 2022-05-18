package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-17
 * Time: 23:31
 */
public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean isBrrowed;

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public Boolean getIsBrrowed() {
        return isBrrowed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsBrrowed(Boolean isBrrowed) {
        this.isBrrowed = isBrrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ((isBrrowed==true)?"已经被借出":"未被借出") +
                '}';
    }
}
