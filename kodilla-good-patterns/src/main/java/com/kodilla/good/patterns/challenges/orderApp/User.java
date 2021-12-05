package com.kodilla.good.patterns.challenges.orderApp;

public class User {

    private String firstName;
    private String surname;

    public String getFirstName() {
        return firstName;
    }
    public String getSurname() {
        return surname;
    }
    public User(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }
}
