import java.util.LinkedList;
import java.util.List;

//Zadanie: test klasy wybierającej parzyste liczby z kolekcji
//Celem zadania jest przetestowanie klasy, która udostępnia metodę przyjmującą jako argument listę obiektów typu Integer i zwracającą nową listę obiektów tego samego typu. Obiekty te mają
// stanowić podzbiór danych wejściowych z pominięciem liczb nieparzystych.

public class OddNumbersFromCollections {

    public final List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> oddNumbersList = new LinkedList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                oddNumbersList.add(number);
            }
        }
        return oddNumbersList;
    }
}
