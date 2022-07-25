import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OddNumbersFromCollectionsTestSuite {
    //Zadanie: test klasy wybierającej parzyste liczby z kolekcji
//Celem zadania jest przetestowanie klasy, która udostępnia metodę przyjmującą jako argument listę obiektów typu Integer i zwracającą nową listę obiektów tego samego typu. Obiekty te mają
// stanowić podzbiór danych wejściowych z pominięciem liczb nieparzystych.
    @Test
    void OddNumbersFromCollections() {

        //Given
        OddNumbersFromCollections oddNumbersFromCollections = new OddNumbersFromCollections();


        //When
        List<Integer> list = new ArrayList<>();
        Stream.iterate(1, n -> n + 1)
                .limit(100L)
                .forEach(n -> list.add(n));

        //Then
        Assertions.assertEquals(oddNumbersFromCollections.exterminate(list).size(), 50);
    }

    @Test
    void OddNumbersFromEmptyCollections() {
//Given
        OddNumbersFromCollections oddNumbersFromCollections = new OddNumbersFromCollections();

        //When
        List<Integer> emptyList = new ArrayList<>();

        //Then
        Assertions.assertEquals(oddNumbersFromCollections.exterminate(emptyList).size(), 0);
    }
}

