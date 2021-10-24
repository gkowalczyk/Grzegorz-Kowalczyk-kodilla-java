package com.kodilla.stream.book;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMain_List {
    public static void main(String[] args) {
BookDirectory bookDirectory = new BookDirectory();
//bookDirectory.getList().stream()
        List<Book> theResultListOfBook = bookDirectory.getList().stream()
        .filter(book -> book.getYearOfProduction() > 2005)
     //  .forEach(System.out::println);
            .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBook.size());
        theResultListOfBook.stream()
               .forEach(System.out::println);


    }
}
