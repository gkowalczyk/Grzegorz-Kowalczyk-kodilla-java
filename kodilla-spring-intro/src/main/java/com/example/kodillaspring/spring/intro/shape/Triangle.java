package com.example.kodillaspring.spring.intro.shape;

public class Triangle implements Shape {

    @Override
    public String draw() {
        System.out.println("This is a triangle");
        return "This is a triangle";
    }
}
