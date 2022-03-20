package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class BookSignature {

    private final String signature;

    public BookSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "BookSignature{" +
                "signature='" + signature + '\'' +
                '}';
    }

    public String getSignature() {
        return signature;

    }
}
