package com.kodilla.kodillaspringweb.car;

public class Car {

    private String name;
    private   String mark;
    private   String model;

    public Car(String name, String mark, String model) {
        this.name = name;
        this.mark = mark;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}