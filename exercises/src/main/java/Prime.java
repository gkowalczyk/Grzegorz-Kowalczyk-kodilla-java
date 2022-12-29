import java.util.Scanner;

public class Prime {
    //rimes
    //Have the function Primes(num) take the num parameter being passed and return the string true if the parameter is a prime number, otherwise return the string false. The range will be between 1 and 2^16.
    //Examples
    //Input: 4
    //Output: false
    //Input: 1709
    //Output: true

    public static String Primes(int num) {
        if (num ==2) {
            return "true";
        }
        if (num % 2 == 0 || num == 1)  {
            return "false";
        }
        return "true";
    }
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Primes(3));
    }
}

//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31