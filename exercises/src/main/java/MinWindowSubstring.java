import java.util.Scanner;

public class MinWindowSubstring {

    //Have the function MinWindowSubstring(strArr) take the array of strings stored in strArr, which will
    // contain only two strings, the first parameter being the string N and the second parameter being a string
    // K of some characters, and your goal is to determine the smallest substring of N that contains all the characters
    // in K. For example: if strArr is ["aaabaaddae", "aed"] then the smallest substring of N that contains the characters
    // a, e, and d is "dae" located at the end of the string. So for this example your program should return the string dae.
    //
    //Another example: if strArr is ["aabdccdbcacd", "aad"] then the smallest substring of N that contains all of the
    // characters in K is "aabd" which is located at the beginning of the string. Both parameters will be strings ranging
    // in length from 1 to 50 characters and all of K's characters will exist somewhere in the string N. Both strings will only contains lowercase alphabetic characters.
    //Examples
    //Input: new String[] {"ahffaksfajeeubsne", "jefaa"}
    //Output: aksfaje
    //Input: new String[] {"aaffhkksemckelloe", "fhea"}
    //Output: affhkkse
    public static String MinWindowSubstring(String[] strArr) {

        String a = strArr[0];
        String b = strArr[1];
        String result = "";

        for (int i = 0; i < a.length(); i++) {
           // System.out.println(String.valueOf(a.charAt(i)));
            StringBuilder pattern = new StringBuilder(b);
            for (int j = i; j < a.length(); j++) {
                //System.out.println(String.valueOf(a.charAt(j)));
                  if(pattern.toString().contains(String.valueOf(a.charAt(j)))){
        int index = pattern.indexOf(String.valueOf(a.charAt(j)));

        pattern.replace(index, index + 1, "");
                }
    if (pattern.length() ==0) {
        result = a.substring(i, j+1);
        break;
    }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(MinWindowSubstring(new String[]{"ahffaksfajeeubsne", "jefaa"}));
    }

}
