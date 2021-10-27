package book;



import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTestSuite {
    @Test
    void testGetListUsingFor() {


        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> books = bookDirectory.getList();
        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for (Book book : books) {
            if (book.getYearOfProduction() > 2007) {
                numberOfBooksPublicatedAfter2007++;
                System.out.println(numberOfBooksPublicatedAfter2007);
            }

        }
       assertEquals(3,numberOfBooksPublicatedAfter2007);
    }
    @Test
    void testGetListUsinIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> books = bookDirectory.getList();
        //Then
        int numberOFBooksPublicateAfter2007 = IntStream.range(0,books.size())
                .filter(n -> books.get(n).getYearOfProduction() > 2007)
                .map(n -> 1)
                .sum();
        assertEquals(3,numberOFBooksPublicateAfter2007);
    }
    void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();
        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0,books.size())
                .filter(n -> books.get(n).getYearOfProduction() > 2007)
                .count();
        assertEquals(3,numberOfBooksPublicatedAfter2007);

    }
}