import java.util.Arrays;
import java.util.Scanner;

public class HappyNumbers {

    //Happy Numbers
    //Have the function HappyNumbers(num) determine if a number is Happy, which is a number whose sum of the square of the digits eventually converges to 1. Return true if it's a Happy number, otherwise return false.
    //
    //For example: the number 10 is Happy because 1^2 + 0^2 converges to 1.
    //Examples
    //Input: 1
    //Output: true
    //Input: 101
    //Output: false

    public static boolean HappyNumbers(int num) {

        String s1 = String.valueOf(num);

        String[] array = s1.split("");
        int set1=Arrays.stream(array)
                .map(Integer::parseInt)
                .map(n -> ((Double) Math.pow(n, 2)).intValue())
                .reduce(0, Integer::sum);
            return true ? set1==1 : false;
        }
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(HappyNumbers(10));
    }
}