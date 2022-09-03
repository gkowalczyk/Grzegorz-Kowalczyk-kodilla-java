import java.util.*;
import java.util.stream.Collectors;

public class NumberReverse {
    //Number Reverse
    //Have the function NumberReverse(str) take the
    // str parameter being passed which will be a
    // string of numbers, and return a new string with
    // the numbers in reverse order.
    //Examples
    //Input: "1 2 3"
    //Output: 3 2 1
    //Input: "10 20 50"
    //Output: 50 20 10


    // Try block to check for exceptions
      //  try {

        // Creating Arrays of String type
      //  String a[]
          //      = new String[] { "A", "B", "C", "D" };

        // Getting the list view of Array
       // List<String> list = Arrays.asList(a);

    //https://www.geeksforgeeks.org/split-string-java-examples/


    public static String NumberReverse(String str) {

        try {

            List<String> stringList = Arrays.asList(str.split(","));
            Collections.reverse(stringList);

            return stringList.stream()
                    .collect(Collectors.joining(" "));

        } catch (UnsupportedOperationException e) {
           return "exception:" + e;
        }
    }
        public static void main (String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.print(NumberReverse(s.nextLine()));
        }
    }









