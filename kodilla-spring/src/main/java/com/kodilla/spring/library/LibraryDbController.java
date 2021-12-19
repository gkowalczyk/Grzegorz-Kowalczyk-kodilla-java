package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

 //składowanie danych w repozytoriach
public class LibraryDbController {

    public void saveData() {
        System.out.println("Saving data to the DB");
    }
    public void loadData() {
        System.out.println("Loading data from the database");
    }
}
