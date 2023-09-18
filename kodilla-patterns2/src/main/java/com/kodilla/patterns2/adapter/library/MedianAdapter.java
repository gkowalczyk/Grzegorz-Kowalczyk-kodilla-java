package com.kodilla.patterns2.adapter.library.B;

import com.kodilla.patterns2.adapter.library.A.Book;
import com.kodilla.patterns2.adapter.library.A.Classifier;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.DataFormatException;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationIntMedian(Set<Book> bookSet) throws DataFormatException {
        Map<BookSignature, com.kodilla.patterns2.adapter.library.B.Book> bookMap = new HashMap<>();
        for(Book book : bookSet) {
            BookSignature bookSignature = new BookSignature(book.getSignature());
            bookMap.put(bookSignature, new com.kodilla.patterns2.adapter.library.B.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        System.out.println(medianPublicationYear(bookMap));
       return  medianPublicationYear(bookMap);
    }

    public static void main(String[] args) throws DataFormatException {

        MedianAdapter medianAdapter = new MedianAdapter();

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("a1", "t1", 1980, "1"));
        bookSet.add(new Book("a1", "t1", 1981, "1"));
        bookSet.add(new Book("a1", "t1", 1982, "1"));
        bookSet.add(new Book("a1", "t1", 1983, "1"));

        medianAdapter.publicationIntMedian(bookSet);
    }
}
