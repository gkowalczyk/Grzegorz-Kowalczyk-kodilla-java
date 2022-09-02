import java.util.Scanner;

public class SerialNumber {

/*
    Serial Number
    Have the function SerialNumber(str) take the str parameter being passed and determine if it is a valid serial number with the following constraints:

            1. It needs to contain three sets each with three digits (1 through 9) separated by a period.
            2. The first set of digits must add up to an even number.
            3. The second set of digits must add up to an odd number.
            4. The last digit in each set must be larger than the two previous digits in the same set.

    If all the above constraints are met within the string, the your program should return the string true, otherwise your program should return the string false. For example: if str is "c" then your program should return "true".
    Examples
    Input: "11.124.667"
    Output: false
    Input: "114.568.112"
    Output: true*/

    public static String SerialNumber(String str) {

        String[] strings = str.split("\\.");
        String t1 = strings[0];
        String t2 = strings[1];
        String t3 = strings[2];

        if (  str.matches("[1-9]{3}[.][1-9]{3}[.][]1-9]{3}") &&
                t1.length() == 3 && t2.length() == 3 && t3.length() == 3
                && (t1.charAt(0) + t1.charAt(1) + t1.charAt(2)) % 2 ==0
                && (t2.charAt(0) + t2.charAt(1) + t2.charAt(2)) % 2 !=0
                && t1.charAt(0)  < t1.charAt(2) && t1.charAt(1) < t1.charAt(2)
                 && t2.charAt(0)  < t2.charAt(2) && t2.charAt(1) < t2.charAt(2)
                && t3.charAt(0)  < t3.charAt(2) && t3.charAt(1) < t3.charAt(2)) {
            return "true" ;

        } else {
            return "false";
        }
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SerialNumber(s.nextLine()));
    }

}