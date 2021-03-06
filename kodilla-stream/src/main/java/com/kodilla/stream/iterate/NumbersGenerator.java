package com.kodilla.stream.iterate;

import java.util.stream.Stream;

public final class NumbersGenerator {

    public static void generateEven(int max) {
        Stream.iterate(-4, n -> n + 1 )
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(n-> System.out.println());
    }
}
