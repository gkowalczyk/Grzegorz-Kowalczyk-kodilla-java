package com.kodilla.spring.library;


import java.util.ArrayList;
import java.util.List;
// przykłąd z klasą konfiguracyjną LibraryConfig
//@Service
public class Library {
    private final List<String> books = new ArrayList<>();

   // @Autowired//Wstrzykiwanie zależności do właściwości klasy
    private  LibraryDbController libraryDbController;

   // @Autowired
    public Library(final LibraryDbController libraryDbController) {
       this.libraryDbController = libraryDbController;
   // public void setLibraryDbController(LibraryDbController libraryDbController) {
   //     this.libraryDbController = libraryDbController;
    }

    public Library() {
        // do nothing
   }
    public void saveToDb(){
        libraryDbController.saveData();
    }
    public void loadFromDb() {
        libraryDbController.loadData();
    }

}
