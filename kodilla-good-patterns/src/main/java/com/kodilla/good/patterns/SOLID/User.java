package com.kodilla.good.patterns.SOLID;

public class User {

    private String name;
    private String surname;

    public String getSurname() {
        return surname;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }
}
