import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Questions Marks
        Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers, letters,
        and question marks, and check if there are exactly 3 question marks between every pair of two numbers that add up to 10. If so,
        then your program should return the string true, otherwise it should return the string false. If there aren't any two numbers that
         add up to 10 in the string, then your program should return false as well.

        For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question marks
        between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.
        Examples
        Input: "aa6?9"
        Output: false
     //acc?7??sss?3rr1??????5
        Output: true*/


//d – jakakolwiek cyfra [0-9],
//Znak ? oznacza – element znajdujący się wcześniej jest opcjonalny.
// Innymi słowy to co występuje
// przed ? może wystąpić raz lub może zostać pominięte.
//find() – metoda zwraca true jeśli w łańcuchu znaków znajduje
// się coś co pasuje do wyrażenia regularnego,
//matches() – metoda zwraca true jeśli łańcuch znaków pasuje w
// całości do wyrażenia regularnego.
//acc?7??sss?3rr1??????5

//[^0-9?]" np  dla arrb6???4xxbl5???eee5  usuwa eee [5?]
public class QuestionsMarks {
    public static String QuestionsMarks(String str) {

        Pattern p = Pattern.compile("(\\d\\?+\\d)");
        Matcher m = p.matcher(str.replaceAll("[^0-9?]", ""));
        boolean match = false;
        while (m.find()) {

            int a = Integer.parseInt(m.group().substring(0, 1));
            int b = Integer.parseInt(m.group().substring(m.group().length() - 1));
            if (a + b == 10) {
                if (m.group().length() != 5) {  // np dla 3?7
                    return "false";
                }
                match = true;
            }
        }
        return match ? "true" : "false";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }

}