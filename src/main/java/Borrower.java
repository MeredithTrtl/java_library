import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int getBorrowedBooks(){
        return this.borrowedBooks.size();
    }

    public void borrowBookFromLibrary(Library library){
        borrowedBooks.add(library.getBook());
    }
}
