package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class BookB {
    private final String author;
    private final String title;
    private final int yearOfPublication;

    public BookB(String author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
