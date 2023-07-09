import java.util.Scanner;

public class PrimeTime {

    //Have the function PrimeTime(num) take the num parameter being passed and return
    // the string true if the parameter is a prime number, otherwise return the string false. The range will be between 1 and 2^16.
    //Examples
    //Input: 19
    //Output: true
    //Input: 110
    //Output: false

    public static String PrimeTime(int num) {
      /* for( int n=2 ; n < Math.sqrt(num); n++) {
           if(n % 2 ==0) return "false" ;
       }
       return "true";*/
        return num == 2 ? "true" : num % 2 == 0 || num <= 1 ? "false" : "true";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);

        System.out.print(PrimeTime(2));
    }

}

