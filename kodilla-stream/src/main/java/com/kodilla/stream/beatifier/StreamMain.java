package com.kodilla.stream.beatifier;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ALA MA KOTA", (text -> text.toLowerCase()));
        poemBeautifier.beautify("ALA MA KOTA", (text -> text + "\n" + "ORAZ PSA"));
        poemBeautifier.beautify("ALA MA KOTA", (text -> "Marcin oraz" + text));
        poemBeautifier.beautify("ALA MA KOTA", (text -> text.concat("klarę")));


    }

}

