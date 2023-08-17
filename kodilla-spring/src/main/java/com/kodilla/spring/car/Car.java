package com.kodilla.spring;

import org.springframework.stereotype.Service;


public class Car {

    private final Engine engine;


    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.startEngine();
        System.out.println("Car started");
    }
}



