package com.kodilla.spring.intro.shape;

public class Square implements Shape{
    @Override
    public String draw() {
        System.out.println("This is a square");
        return "This is a square";
    }
}
