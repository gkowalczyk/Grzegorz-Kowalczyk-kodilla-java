package com.example.kodillaspring.reader;

public final class Reader {
    final Book theBook;

    public Reader(final Book theBook) {
        this.theBook = theBook;
    }
    public void read() {
        System.out.println("Reading" + theBook.getTitle());
    }
}
