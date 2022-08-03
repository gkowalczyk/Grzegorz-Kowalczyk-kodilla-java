import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
        Assertions.assertEquals(oddNumbersFromCollections.exterminate(list).size(),
                50);
    }

    @Test
    void OddNumbersFromCollectionsWithArray() {
        //Given
        OddNumbersFromCollections oddNumbersFromCollections = new OddNumbersFromCollections();

        //When
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listArrays = Arrays.asList(array);
        System.out.println(listArrays);
        //Then
        Assertions.assertEquals(oddNumbersFromCollections.exterminate(listArrays).size(),5);
                    }

    @Test
    void OddNumbersFromEmptyCollections() {
//Given
        OddNumbersFromCollections oddNumbersFromCollections = new OddNumbersFromCollections();
        //When
        List<Integer> emptyList = new ArrayList<>();

        //Then
        Assertions.assertEquals(oddNumbersFromCollections.exterminate(emptyList).size(), 0);
        System.out.println(emptyList.getClass());
        System.out.println(OddNumbersFromCollections.class);
    }
}

