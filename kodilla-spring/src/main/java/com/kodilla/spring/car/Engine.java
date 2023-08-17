package com.kodilla.spring;

import org.springframework.stereotype.Component;


public class Engine {

    @Override
    public String toString() {
        return "Engine{}";
    }

    public void startEngine() {
        System.out.println("start...");
    }
}
