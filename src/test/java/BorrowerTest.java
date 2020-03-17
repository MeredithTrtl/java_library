import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library();
        book = new Book("Love In The Time Of Cholera", "Gabriel Garcia Marquez", "Classics");
        library.addBook(book);
    }

    @Test
    public void canBorrowBookFromLibrary(){
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.getBorrowedBooks());
    }


}
