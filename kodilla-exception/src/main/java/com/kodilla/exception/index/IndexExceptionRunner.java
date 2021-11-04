package com.kodilla.exception.index;

import java.util.List;

public class IndexExceptionRunner {
    public static void main(String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> collections = videoCollector.getCollection();

        if (collections.size() > 2) {
            String movie = collections.get(0);
            System.out.println(movie);

            String anotherMovie = collections.get(2);
            System.out.println(anotherMovie);
        }
    }
}