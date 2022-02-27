package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatitistics {
    int averagePublicationYear(Map<BookSignature, BookB> books);
    int medianPublicationYear(Map<BookSignature, BookB> books);

}
