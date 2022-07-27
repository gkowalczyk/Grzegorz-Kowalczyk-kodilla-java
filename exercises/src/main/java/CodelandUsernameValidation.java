import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodelandUsernameValidation {

    //Codeland Username Validation
    //Have the function CodelandUsernameValidation(str) take the str parameter being passed and determine if the string is a valid username according to the following rules:
    //
    //1. The username is between 4 and 25 characters.
    //2. It must start with a letter.
    //3. It can only contain letters, numbers, and the underscore character.
    //4. It cannot end with an underscore character.
    //
    //If the username is valid then your program should return the string true, otherwise return the string false.
    //Examples
    //Input: "aa_"
    //Output: false
    //Input: "u__hello_world123"
    //Output: true


        public static String CodelandUsernameValidation(String str) {

            //{x,y} – oznacza, że element poprzedzający musi wystąpić od x do y razy.
            //A-Z] – znak z tej klasy znaków, wielka litera,
            //[a-z] mała litera użyta co najmniej raz.
            //[^-]* – Jakikolwiek znak tylko nie minus powtórzony dowolną ilość razy,


            Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]");
            Matcher matcher = pattern.matcher(str);
            return matcher.matches() ? "true" : "false";
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(CodelandUsernameValidation(s.nextLine()));
        }
    }

