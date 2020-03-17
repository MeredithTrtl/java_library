import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
//    private HashMap<String, Integer> genres;

    public Library(){
        this.books = new ArrayList<Book>();
        this.capacity = 2;
//        this.genres = new HashMap<String, Integer>();
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

//    public void setGenres(){
//        for (Book book: this.books){
//            if (this.genres.containsKey(book.getTitle())) {
//                genres.get((book.getTitle()) + 1);
//            }
//            this.genres.put(book.getTitle(), 1);
//
//        }
//    }
//
//    public HashMap getGenres(){
//        return this.genres;
//    }

}
