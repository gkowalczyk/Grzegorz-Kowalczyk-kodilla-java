public class FindMissingNumber {

    //Napisz funkcję findMissing, która jako argument
    // przyjmuje tablicę N liczb całkowitych z zakresu od 0 do N. W
    // tablicy wszystkie elementy są unikalne. Liczb z zakresu <0, N>,
    // jest N + 1. Tablica ma długość N. W tablicy brakuje jednego elementu
    // z zakresu. Funkcja findMissing powinna zwrócić brakujący element:
    //
    //tablica = [0, 2, 1, 4]
    //findMissing(tablica) == 3

    public int elementToFind(int... array) {
        int missing = 0;
        boolean elementFind;

        for (int elementToFind = 0; elementToFind <= array.length; elementToFind++) {
            elementFind = false;
            for (int elementInArray : array) {
                if (elementInArray == elementToFind) {
                    elementFind = true;
                    break;
                }
            }
            if (!elementFind) {
                missing = elementToFind;
                break;
            }
        }
        return missing;
    }
}
