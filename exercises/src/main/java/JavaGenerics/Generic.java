package JavaGenerics;

import java.util.ArrayList;
import java.util.List;

//https://javastart.pl/baza-wiedzy/slownik/typy-generyczne
public class Generic {
    public static void main(String[] args) {


        List books = new ArrayList();
        books.add(new Book("Potop", "Henryk Sienkiewicz"));
        Book book = (Book) books.get(0); // zwracane są referencję typu Object stąd rzutowanie
        System.out.println(book.getName());


        List<Book> books1 = new ArrayList<Book>();
        books1.add(new Book("Potop", "Henryk Sienkiewicz"));
        Book book1 = books1.get(0); //metoda get() zwraca referencję Book, a nie Object
        System.out.println(book.getName()); //ok, referencja typu Book



    }
}
