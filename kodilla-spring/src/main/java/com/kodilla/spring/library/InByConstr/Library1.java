package com.kodilla.spring.library.InByConstr;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//Wstrzykiwanie zależności przez konstruktor
public final class Library1 {

    private final List<String> books = new ArrayList<>();
    private final LibraryDbController1 libraryDbController;
//Spring sam zauważył, że do konstruktora klasy Library trzeba
// podać jako argument obiekt klasy LibraryDbController. Utworzył
// więc najpierw bean klasy LibraryDbController, a następnie
// wstrzyknął go do
// konstruktora beana klasy Library. Całkowicie bez naszego udziału
    public Library1(LibraryDbController1 libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}