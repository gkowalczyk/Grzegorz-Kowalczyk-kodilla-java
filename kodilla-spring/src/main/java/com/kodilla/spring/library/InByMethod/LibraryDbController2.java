package com.kodilla.spring.library.InByMethod;

import org.springframework.stereotype.Repository;

@Repository//składowanie danych w repozytoriach
public class LibraryDbController2 {

    public void saveData() {
        System.out.println("Saving data to the DB");
    }
    public void loadData() {
        System.out.println("Loading data from the database");
    }
}
