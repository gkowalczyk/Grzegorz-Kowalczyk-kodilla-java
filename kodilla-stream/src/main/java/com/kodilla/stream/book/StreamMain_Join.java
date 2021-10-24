package com.kodilla.stream.book;

import java.util.stream.Collectors;

public class StreamMain_Join {
    public static void main(String[] args) {

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfProduction() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));
        System.out.println(theResultStringBooks);
    }


}
