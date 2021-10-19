package com.kodilla.testing.libray;


import java.util.List;

public interface LibraryDatabase {
    List<Book> listBooksWithCondition(String titleFragment);

    List<Book> listBooksInHandsOf(LibraryUser libraryUser);


    boolean rentBook(LibraryUser libraryUser,Book book);

    int returnBooks(LibraryUser libraryUser);
}
