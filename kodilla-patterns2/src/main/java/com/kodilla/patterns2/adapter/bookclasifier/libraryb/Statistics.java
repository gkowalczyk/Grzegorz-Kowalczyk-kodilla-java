package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Arrays;
import java.util.Map;

public class Statistics implements BookStatitistics {

    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        if (books.size() == 0)
            return 0;
        int sum = 0;
        for (Map.Entry<BookSignature, BookB> entry : books.entrySet()) {
            sum = sum + entry.getValue().getYearOfPublication();
        }
        return sum / books.size();
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, BookB> books) {
        if (books.size() == 0)
            return 0;
        int[] years = new int[books.size()];
        int n = 0;
        for (Map.Entry<BookSignature, BookB> entry : books.entrySet()) {
            years[n] = entry.getValue().getYearOfPublication();
            n++;

        }
        Arrays.sort(years);
        //System.out.println(years[n-1]);
        return years[years.length / 2];

    }
}