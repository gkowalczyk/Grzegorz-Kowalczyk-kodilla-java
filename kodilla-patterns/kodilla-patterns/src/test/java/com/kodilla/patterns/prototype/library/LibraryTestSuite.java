package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Book book1 = new Book("Book1", "Author 1", LocalDate.of(2000, 01, 01));
        Book book2 = new Book("Book2", "Author 2", LocalDate.of(2010, 01, 01));

        Library library = new Library("Library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library shallowClone = null;
        try {
            shallowClone = library.shallowCopy();
            shallowClone.setName("Shallow copy library 1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepClone = null;
        try {
            deepClone = library.deepCopy();
            deepClone.setName("Deep copy library 1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(shallowClone);
        System.out.println(deepClone);
        assertEquals(1, library.getBooks().size());
        assertEquals(1, shallowClone.getBooks().size());
        assertNotEquals(library.getBooks().size(), 2);
    }
}
