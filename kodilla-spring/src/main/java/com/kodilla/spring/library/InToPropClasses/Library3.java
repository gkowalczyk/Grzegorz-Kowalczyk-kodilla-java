package com.kodilla.spring.library.InToPropClasses;

import com.kodilla.spring.library.InByMethod.LibraryDbController2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//Wstrzykiwanie zależności do właściwości klasy
public final class Library3 {

    private final List<String> books = new ArrayList<>();
    @Autowired
    private LibraryDbController2 libraryDbController;

    //@Autowired
    //public void setLibraryDbController(LibraryDbController2 libraryDbController) {
    //    this.libraryDbController = libraryDbController;
  //  }
   // public Library3() {

   // }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}