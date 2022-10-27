import java.util.Scanner;

public class BracketMatcher {

    //Have the function BracketMatcher(str) take the
    // str parameter being passed and return 1 if the
    // brackets are correctly matched and each one is
    // accounted for. Otherwise return 0. For example:
    // if str is "(hello (world))", then the output should
    // be 1, but if str is "((hello (world))" the the output
    // should be 0 because the brackets do not correctly match
    // up. Only "(" and ")" will be used as brackets. If
    // str contains no brackets return 1.
    //Examples
    //Input: "(coder)(byte))"
    //Output: 0
    //Input: "(c(oder)) b(yte)"
    //Output: 1

//https://stormit.pl/stos-lifo/
        public static String BracketMatcher(String str) {
           // Stack<Integer> stack = new Stack<>();

            int counter1 = 0;
            int counter2 = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == '(') {
                    counter1++;

                }
                if (str.charAt(i) == ')') {
                    counter2++;
                }

            }
            System.out.println(counter1);
         return  (counter1++ == counter2++ ? 1 : 0) + "";

     }

            //return str;
    //    }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(BracketMatcher("(())"));
        }

    }

