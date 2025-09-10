package dev.coms4156.project.individualproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.coms4156.project.individualproject.model.Book;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * This class contains the unit tests for the Book class.
 */
@SpringBootTest
public class BookUnitTests {

  public static Book book;

  @BeforeAll
  public static void setUpBookForTesting() {
    book = new Book("When Breath Becomes Air", 0);
  }

  @Test
  public void equalsBothAreTheSameTest() {
    Book cmpBook = book;
    assertEquals(cmpBook, book);
  }

  @Test
  public void deleteAddCopyTest(){
    assertEquals(true, book.deleteCopy());
    assertEquals(0, book.getTotalCopies());
    assertEquals(0, book.getCopiesAvailable());
    assertEquals(false, book.deleteCopy());
    book.addCopy();
    assertEquals(1, book.getTotalCopies());
    assertEquals(1, book.getCopiesAvailable());
  }

  @Test
  public void ReturnCheckoutTest(){
    String checkoutStr = book.checkoutCopy();
    assertEquals(book.getReturnDates().get(0), checkoutStr);
    assertEquals("Book not available now! Come back later!", book.checkoutCopy());
    assertEquals(false, book.deleteCopy());
    assertEquals(true, book.returnCopy(checkoutStr));
    assertEquals(false, book.returnCopy(checkoutStr));
  }

}
