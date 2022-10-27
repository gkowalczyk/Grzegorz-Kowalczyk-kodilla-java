import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {

    //Have the function VowelCount(str) take the str string parameter being passed and return the number of
    // vowels the string contains (ie. "All cows eat grass and moo" would return 8). Do not count y as a vowel for this challenge.
    //Examples
    //Input: "hello"
    //Output: 2
    //Input: "coderbyte"
    //Output: 3
    //Tags

    // //{x,y} – oznacza, że element poprzedzający musi wystąpić od x do y razy.
    //            //A-Z] – znak z tej klasy znaków, wielka litera,
    //            //[a-z] mała litera użyta co najmniej raz.
    //            //[^-]* – Jakikolwiek znak tylko nie minus powtórzony dowolną ill razy,
    //
    //
    //            Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]");
    //            Matcher matcher = pattern.matcher(str);
    //            return matcher.matches() ? "true" : "false";

    public static String VowelCount(String str) {

        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(str);
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {

            if (matcher.find()) {
                counter++;
            }
        }
        return "" + counter++;
    }


    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(VowelCount("All cows eat grass and moo"));
    }

}


