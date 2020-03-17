import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(){
        this.books = new ArrayList<Book>();
        this.capacity = 2;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public int countBooks(){
        return this.books.size();
    }

    public void checkCapacityAndAdd(Book book){
        if (this.capacity > 0){
            this.books.add(book);
            this.capacity -= 1;
        }
    }

    public Book getBook(){
        return books.get(0);
    }
}
