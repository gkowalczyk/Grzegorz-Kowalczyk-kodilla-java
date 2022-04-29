package com.kodilla.stream.iterate;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("generate even numbers");
        NumbersGenerator.generateEven(20);

        Long validateTime = System.currentTimeMillis() + 3600;
        System.out.println(validateTime);
    }


}
