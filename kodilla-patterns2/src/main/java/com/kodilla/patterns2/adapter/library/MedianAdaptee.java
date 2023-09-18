package com.kodilla.patterns2.adapter.library.B;

import java.util.Map;
import java.util.zip.DataFormatException;

public class MedianAdaptee implements BookStatistics{

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
      Statistics statistics = new Statistics();
      return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) throws DataFormatException {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
