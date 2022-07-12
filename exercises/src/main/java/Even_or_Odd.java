public class Even_or_Odd {

    //Create a function that takes an integer as an
    // argument and returns "Even"
    // for even numbers or "Odd" for odd numbers.

    // I
    public static String even_or_odd(int number) {

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // II
    public static String even_or_odd_1(int number) {

        return (number % 2 == 0) ? "Even" : "Odd";
    }
}