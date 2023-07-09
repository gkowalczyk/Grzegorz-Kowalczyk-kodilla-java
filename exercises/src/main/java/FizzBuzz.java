public class FizzBuzz {

    static {
        //Wypisz liczby od 1 do 100, jeżeli liczba jest podzielna przez 3 to wypisz Fizz,
        // jeżeli podzielna przez 5 to Buzz,
        // jeżeli podzielna przez 3 i 5 to wypisz FizzBuzz. W przeciwnym wypadku wypisz liczbę.

        for (int i = 1; i <= 100; i++) {
            if (i % 3 ==0 && i % 5 ==0 ) {
                System.out.println("fizzBuzz");
            }
                else if (i % 3 ==0) {
                System.out.println("i=" + i + " " + "Fizz");
                                    }
                else if (i % 5 ==0) {
                System.out.println("i=" + i + " " + "Buzz");
            }
                else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //FizzBuzz fizzBuzz = new FizzBuzz();
        //fizzBuzz.fizzBuzz();
    }
}