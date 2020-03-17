import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
    library = new Library();
    book = new Book ("Love In The Time Of Cholera", "Gabriel Garcia Marquez", "Classics");
    }

    @Test
    public void canAddBook(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canCountBooks(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canCheckCapacityAndAddBook(){
        library.checkCapacityAndAdd(book);
        library.checkCapacityAndAdd(book);
        library.checkCapacityAndAdd(book);
        library.checkCapacityAndAdd(book);
        assertEquals(2, library.countBooks());
    }

//    @Test
//    public void canSetGenres(){
//        library.addBook(book);
//        library.addBook(book);
//        library.addBook(book);
//        library.addBook(book);
//        assertEquals("Classics", library.getGenres());
//    }

}
