package com.kodilla.testing.libray;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }
    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();

        if (titleFragment.length() < 3)
            return bookList;

        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);

        if (titleFragment.length() > 20)
            return bookList;

        bookList = resultList;
        return bookList;
    }
    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

      List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);

    return resultList;

   }
}
