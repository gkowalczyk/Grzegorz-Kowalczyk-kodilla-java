//https://www.samouczekprogramisty.pl/podstawy-zlozonosci-obliczeniowej/
/* Złożoność algorytmu :

- pamięciowa
- czasowa - ile operacji wiodących, jaka jest funkcja



*/

import java.util.Arrays;

public class BigONotation {
    public static void main(String[] args) {

        BigONotation bigONotation = new BigONotation();
        System.out.println(bigONotation.sum(new int[]{1, 2, 3, 4}));
        System.out.println(bigONotation.sum1(new int[]{1, 2, 3, 4}));
        System.out.println(bigONotation.binarySearch(new int[]{1, 2, 3, 4, 5}, 2));
        System.out.println(Arrays.toString(sort(new int[]{1, 10, 8, 3, 4})));
        System.out.println(Arrays.toString(sort1(new int[]{1, 10, 8, 3, 4})));
        System.out.println(Arrays.toString(powerSet(new int[]{1, 10, 8})));

        // Arrays.sort(new int[]{1, 8, 3, 4, 5});
       // System.out.println(format32bit(44));
       // String v =  format32bit(44 << 1);
       // System.out.println(v);
        //System.out.println(binaryStringToDecimal(v));
    }
    static String format32bit(int value) {
        return String.format("%16s",
                Integer.toBinaryString(value)).replaceAll(" ", "0");
    }

    static int binaryStringToDecimal(String binaryValue) {
        return (int) Long.parseLong(binaryValue, 2);
    }

/*
# O(1)
złożoność stała, liniowa, niezależna od liczby danyc wejściowych.
Na wejściu programu jest tablica liczb o długości N. Liczby są posortowane rosnąco. Pomiędzy dwoma sąsiadującymi liczbami różnica jest stała. Znajdź sumę liczb w tablicy.

O(n)
Złożoność będąca złożonością wielomianowa, zależy proporcjonalnie od ilości danych wejściowych
Na wejściu programu jest tablica liczb o długości N. Znajdź sumę wszystkich liczb w tablicy wejściowej.

O(log(n))
Złożoność logarytmiczna , czas rozwiązania zalez od wyniku logarytmu  z wielkości
danych wejściowych
Na wejściu programu jest posortowana tablica liczb o długości N. Sprawdź czy liczba x istnieje w tablicy wejściowej.


Ο(nlog(n)
Złożoność liniowo - logarytmiczna
Na wejściu programu jest tablica liczb. Zwróć tablicę, która będzie zawierała te same elementy, które są w tablicy wejściowej. Tablica wynikowa powinna być posortowana w porządku rosnącym.
public int sum(int[] n


Ο(n^2)

Złożoność kwadratowa. Jest to specyficzny przypadek złożoności wielomianowej. Przykładowy problem może być ten, który użyłem wyżej – posortowanie tablicy. Tym razem jednak algorytm jest mniej wydajny. Sortowanie bąbelkowe
 charakteryzuje się złożonością obliczeniową Ο(n^2):


//Ο(x^n)
Jest to złożoność wykładnicza, jej przykładem może być Ο(2^n). Problemem, który ma rozwiązanie o złożoności co najmniej Ο(2^n) jest:

Na wejściu programu jest tablica unikalnych liczb. Zwróć tablicę, która będzie zawierała wszystkie możliwe podzbiory elementów tablicy wejściowej.


* */


    // O(1)
    public int sum(int[] numbers) {
        return (numbers[0] + numbers[numbers.length - 1]) * numbers.length / 2;
    }

    // O(n)

    public int sum1(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


    //O(log(n))  skreślamy połowę danych
//To popularny algorytm przeszukiwania binarnego. Jego nazwa pochodzi od tego,
// że przy każdej iteracji algorytmu dzielimy przeszukiwany zbiór na dwie równe4
// części. Algorytmy, które dzielą w ten sposób problem na mniejsze problemy
// przeważnie są zależne od logarytmu wielkości danych wejściowych.
    // System.out.println(bigONotation.binarySearch(new int[]{1, 2, 3, 4, 5}, 2));
    public boolean binarySearch(int[] numbers, int number) {
        int indexLow = 0;
        int indexHigh = numbers.length - 1;
        while (indexLow <= indexHigh) {
            int indexMiddle = indexLow + (indexHigh - indexLow) / 2;

            if (number < numbers[indexMiddle]) {
                indexHigh = indexMiddle - 1;
            } else if (number > numbers[indexMiddle]) {
                System.out.println(numbers[indexMiddle]);
                indexLow = indexMiddle + 1;
            } else {
                return true;
            }
        }
        return false;
    }

//Ο(nlog(n)
//Algorytm dzieli tablicę na części do czasu aż każda z nich będzie miała długość 1. Następnie scala je ze sobą. Każde
// takie scalenie to koszt Ο(n). W związku z tym, że tablicę wejściową dzieliliśmy za każdym razem na pół takich scaleń mamy log(n). Zatem wynikowa złożoność algorytmu to Ο(nlog(n)).

    public static int[] sort(int[] numbers) {
        if (numbers.length <= 1) {
            return numbers;
        }
        int[] first = new int[numbers.length / 2];
        int[] second = new int[numbers.length - first.length];
        for (int i = 0; i < first.length; i++) {
            first[i] = numbers[i];
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = numbers[first.length + i];
        }

        return merge(sort(first), sort(second));  //

    }

    private static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        for (int indexFirst = 0, indexSecond = 0, indexMerged = 0; indexMerged < merged.length; indexMerged++) {
            if (indexFirst >= first.length) {
                merged[indexMerged] = second[indexSecond++];
            } else if (indexSecond >= second.length) {
                merged[indexMerged] = first[indexFirst++];
            } else if (first[indexFirst] <= second[indexSecond]) {
                merged[indexMerged] = first[indexFirst++];
            } else {
                merged[indexMerged] = second[indexSecond++];
            }
        }
        return merged;
    }

    // O(n^2)
//System.out.println(Arrays.toString(sort1(new int[]{10,1, 8, 3, 4})));
    public static int[] sort1(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    int min = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = min;
                }
            }
        }
        return numbers;
    }
//Ο(log(n)2^n).
//Jest to złożoność wykładnicza, jej przykładem może być Ο(2^n). Problemem, który ma rozwiązanie o złożoności co najmniej Ο(2^n) jest:
//
//Na wejściu programu jest tablica unikalnych liczb. Zwróć tablicę, która będzie zawierała wszystkie możliwe podzbiory elementów tablicy wejściowej.
//
//Wynika to z faktu, że wszystkich możliwych podzbiorów zbioru, który ma n elementów jest dokładnie 2^n. Poniższy algorytm ma złożoność Ο(log(n)2^n).

    public static int[][] powerSet(int[] numbers) {
        int two_pow_n = 1 << numbers.length;
System.out.println(binaryStringToDecimal(format32bit(two_pow_n)));
        int[][] powerSet = new int[two_pow_n][];
        for (int subsetIndex = 0; subsetIndex < two_pow_n; subsetIndex++) {
            powerSet[subsetIndex] = pickNumbers(subsetIndex, numbers);
        }
        System.out.println(Arrays.stream(powerSet));
        return powerSet;
    }

    private static int[] pickNumbers(int subsetIndex, int[] numbers) {
        int howManyOnes = 0;
        int temp = subsetIndex;
        while (temp > 0) {
            if (temp % 2 == 1) {
                howManyOnes++;
            }
            temp >>= 1;

        }
        int[] subset = new int[howManyOnes];

        for (int charIndex = 0, lastElementIndex = 0; subsetIndex > 0; charIndex++) {
            if (subsetIndex % 2 == 1) {
                subset[lastElementIndex++] = numbers[charIndex];
            }
            subsetIndex >>= 1;
        }

        return subset;

        //Wynika to z faktu, że wszystkich możliwych podzbiorów zbioru, który ma n elementów jest dokładnie 2^n.
        // Poniższy algorytm ma złożoność Ο(log(n)2^n).
//Wynika to z faktu, że pętla wewnątrz metody powerSet wywołana jest dokładnie 2^n razy.
// Natomiast wewnątrz metody pickNumbers są dwie pętle. Każda z nich ma złożoność Ο(log(n)).
// Zatem finalna złożoność algorytmu to Ο(log(n)2^n).
    }
}

