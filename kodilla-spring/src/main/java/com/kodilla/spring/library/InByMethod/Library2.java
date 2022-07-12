package com.kodilla.spring.library.InByMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//Wstrzykiwanie zależności przez konstruktor
public final class Library2 {

    private final List<String> books = new ArrayList<>();
    private  LibraryDbController2 libraryDbController;
//Spring sam zauważył, że do konstruktora klasy Library trzeba
// podać jako argument obiekt klasy LibraryDbController. Utworzył
// więc najpierw bean klasy LibraryDbController, a następnie
// wstrzyknął go do
// konstruktora beana klasy Library. Całkowicie bez naszego udziału
@Autowired
    public void setLibraryDbController(LibraryDbController2 libraryDbController) {
        this.libraryDbController = libraryDbController;
    }
    public Library2() {
//Metoda ta została oznaczona adnotacją @Autowired, co jest
// sygnałem dla Springa,
// że powinien użyć tej metody do wstrzyknięcia zależności.
        //W sytuacji, gdy klasa posiada więcej niż jeden konstruktor,
        // konieczne jest wskazanie w jakiś sposób Springowi, którego
        // konstruktora ma użyć do
        // wstrzyknięcia beanów. Robimy to przy pomocy adnotacji @Autowired:
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}