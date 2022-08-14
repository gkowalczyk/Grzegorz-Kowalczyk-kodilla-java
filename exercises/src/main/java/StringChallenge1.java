import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class StringChallenge1 {
    public static String StringChallenge(String str) {



    //String Challenge
//Have the function StringChallenge(str) take the str parameter being passed which
// will be two times (each properly formatted with a colon and am or pm) separated by
// a hyphen and return the total number of minutes between the two times. The time will be
// in a 12 hour clock format. For example: if str is 9:00am-10:00am then the output should be 60.
// If str is 1:00pm-11:00am the output should be 1320.
//Examples
//Input: "12:30pm-12:00am"
//Output: 690
//Input: "1:23am-1:08am"
//Output: 1425
    String[] arrayOfStrings = str.split("-");

    String time1 = arrayOfStrings[0];
    String time2 = arrayOfStrings[1];

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm a");
    LocalTime t1 = LocalTime.parse(time1, fmt);
    LocalTime t2 = LocalTime.parse(time2, fmt);
    long seconds = ChronoUnit.SECONDS.between(t1, t2);

        System.out.println(seconds);

        return "";
}

    public static void main (String[] args) {
        // keep this function call here

        System.out.print(StringChallenge("12:12 AM-12:13 AM"));
    }

}

