import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CountingMinutesI {
    //Have the function CountingMinutesI(str) take the str parameter being passed which will be two times
    // (each properly formatted with a colon and am or pm) separated by a hyphen and return the total number
    // of minutes between the two times. The time will be in a 12 hour clock format. For example: if str is
    // 9:00am-10:00am then the output should be 60. If str is 1:00pm-11:00am the output should be 1320.
    //Examples
    //Input: "12:30pm-12:00am"
    //Output: 690
    //Input: "1:23am-1:08am"
    //Output: 1425
    public static String CountingMinutesI(String str) throws ParseException {

String[] arr = str.split("-");
String t1 = arr[0];
String t2 = arr[1];

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mma");
        Date date1 = simpleDateFormat.parse(t1);
        Date date2 = simpleDateFormat.parse(t2);

        long diff = 0;
        if (date2.before(date1)) {
         date2 = new Date(date2.getTime() + TimeUnit.DAYS.toMillis(1));
        }
         diff = ((date2.getTime() - date1.getTime())/60000);
        System.out.println(diff);
        return "";
    }

    public static void main (String[] args) throws ParseException {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CountingMinutesI(s.nextLine()));
    }

}
