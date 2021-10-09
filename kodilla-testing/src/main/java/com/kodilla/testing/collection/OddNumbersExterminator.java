package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static  List<Integer> exterminate(List<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int listOfNumbers : numbers) {
            if (listOfNumbers % 2 == 0) {
               evenNumbers.add(listOfNumbers);
            }
        }
        return evenNumbers;
    }
}


