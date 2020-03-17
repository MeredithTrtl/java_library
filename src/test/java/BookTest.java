import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before(){
        book1 = new Book("Love In The Time Of Cholera", "Gabriel Garcia Marquez", "Classics");
    }

    @Test
    public void canGetTitle(){
        assertEquals("Love In The Time Of Cholera", book1.getTitle());
    }

}
