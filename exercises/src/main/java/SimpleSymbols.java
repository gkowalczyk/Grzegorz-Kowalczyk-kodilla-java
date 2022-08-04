import java.util.Scanner;


//Simple Symbols
//Have the function SimpleSymbols(str) take the str parameter being
// passed and determine if it is an acceptable sequence by either returning
// the string true or false. The str parameter will be composed of + and = symbols
// with several characters between them (ie. ++d+===+c++==a) and for the string to be
// true each letter must be surrounded by a + symbol. So the string to the left would be
// false. The string will not be empty and will have at least one letter.

//I

public class SimpleSymbols {

    public static String SimpleSymbols(String str) {

        int n = str.length() - 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.isEmpty()) {
                return "false";
            }
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if (str.charAt(0) == '+' && str.charAt(n) == '+' && str.contains("+")) {

                    return "true";
                }
            }
        }
        return "false";

        //II
    }
    public static String SimpleSymbols1(String str) {

        for (int n = 0; n < str.length(); n++) {

            if (Character.isLetter(str.charAt(n)) && n == 0) break;
            if (Character.isLetter(str.charAt(n))) {
                if (str.charAt(n - 1) == '+' && str.charAt(n + 1) == '+') {
                    return "true";
                }
                break;
            }
        }
        return "false";
    }
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SimpleSymbols1(s.nextLine()));
    }
}

