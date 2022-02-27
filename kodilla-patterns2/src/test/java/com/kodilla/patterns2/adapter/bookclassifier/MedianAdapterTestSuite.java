package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {

        BookA bookA = new BookA("Author1", "title1", 2022,"signature1");
        BookA bookB = new BookA("Author2", "title2", 2023,"signature2");
        BookA bookC = new BookA("Author3", "title3", 2024,"signature3");

        Set<BookA> bookASet = new HashSet<>();
        bookASet.add(bookA);
        bookASet.add(bookB);
        bookASet.add(bookC);

        MedianAdapter medianAdapter = new MedianAdapter();

        int result = medianAdapter.publicationYearMedian(bookASet);
        System.out.println(result);
        assertEquals(2023, result);
    }
}
