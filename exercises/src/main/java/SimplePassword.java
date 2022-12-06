import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Simple Password
//Have the function SimplePassword(str) take the str parameter being passed and determine if it passes as a valid password that follows the list of constraints:
//
//1. It must have a capital letter.
//2. It must contain at least one number.
//3. It must contain a punctuation mark or mathematical symbol.
//4. It cannot have the word "password" in the string.
//5. It must be longer than 7 characters and shorter than 31 characters.
//
//If all the above constraints are met within the string, the your program should return the string true, otherwise your program should return the string false. For example: if str is "apple!M7" then your program should return "true".
//Examples
//Input: "passWord123!!!!"
//Output: false
//Input: "turkey90AAA="
//Output: true
public class SimplePassword {
    public static String SimplePassword(String str) {

        if (str.contains("password") || str.contains("passWord")){
            return "false";
        }
            Pattern pattern = Pattern.compile("[a-zA-Z0-9_\\p{Punct}]{7,31}");
            Matcher matcher = pattern.matcher(str);

            boolean find = matcher.matches();

            return "" + find;
        }


    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(SimplePassword("passWord123!!!!"));
    }
}