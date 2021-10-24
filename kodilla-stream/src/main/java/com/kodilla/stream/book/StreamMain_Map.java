package com.kodilla.stream.book;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain_Map {
    public static void main(String[] args) {



    BookDirectory theBookDirectory = new BookDirectory();

    Map<String,Book> theResultMapofBooks = theBookDirectory.getList().stream()
            .filter(book -> book.getYearOfProduction() > 2005)
            .collect(Collectors.toMap(Book::getAuthor, book -> book));

        System.out.println("elements:" + theResultMapofBooks.size());
theResultMapofBooks.entrySet().stream()
        .map(entry -> entry.getKey() + " : " + entry.getValue())
        .forEach(System.out::println);
}



}