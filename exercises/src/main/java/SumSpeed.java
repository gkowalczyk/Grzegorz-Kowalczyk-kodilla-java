import java.util.Random;

public class SumSpeed {

    //Napisz program, który będzie posiadał:
    //
    //zmienną int sumaA (zainicjalizowana wartością 1000),
    //zmienną int sumaB (zainicjalizowana wartością 0),
    //pętlę while, wewnątrz której:
    //losujemy liczbę typu int z zakresu 0-9 i dodajemy ją do zmiennej sumaA,
    //losujemy liczbę typu int z zakresu 0-49 i dodajemy ją do zmiennej sumaB.
    //Pętlę wykonuj tak długo, jak długo spełniony jest warunek sumaA > sumaB.
    //
    //W każdej iteracji wyświetl numer przebiegu pętli oraz aktualne wartości obu zmiennych.
    public static void main(String[] args) {

        int sumaA = 1000;
        int sumaB = 0;
        int counter = 0;

        Random random = new Random();
        while (sumaA > sumaB) {

            sumaA = random.nextInt(9) + sumaA;
            System.out.println("sumaA=" + sumaA);
            sumaB = random.nextInt(49) + sumaB;
            System.out.println("sumaB=" + sumaB);
            counter++;
        }
        System.out.println("counter:" + counter++);
    }
}
