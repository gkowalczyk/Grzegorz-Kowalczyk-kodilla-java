package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;
import java.util.Objects;

public final class Book {

    private String title;
    private String author;
    private LocalDate publicationDate;

    public Book(String title, String author, LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "        Book [" + title+ "]";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author) && publicationDate.equals(book.publicationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationDate);
    }
}
