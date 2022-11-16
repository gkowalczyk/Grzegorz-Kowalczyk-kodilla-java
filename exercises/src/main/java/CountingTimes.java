import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CountingTimes {
    public static Long CountingMinutes(String str) throws ParseException {

        // Counting Minutes
        //Have the function CountingMinutes(str) take the str parameter being passed which will be two times (each properly formatted with a colon and am or pm) separated by a hyphen and return the total number of minutes between the two times. The time will be in a 12 hour clock format. For example: if str is 9:00am-10:00am then the output should be 60. If str is 1:00pm-11:00am the output should be 1320.
        //Examples
        //Input: ""
        //Output: 690
        //Input: "1:23am-1:08am"
        //Output: 1425

        //The getTime() method of Java Date class returns the number of milliseconds since January 1, 1970, 00:00:00 GTM which is represented by Date object.
//TimeUnit.DAYS.toMillis(1));  -  CONVERT one day TIME TO [ms]


        String[] strings = str.split("-");
        String t1 = strings[0];
        String t2 = strings[1];

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mma");
        Date date1 = simpleDateFormat.parse(t1);
        Date date2 = simpleDateFormat.parse(t2);
        System.out.println(date2.getTime());

        if (date2.before(date1)) {
            date2 = new Date(date2.getTime() + TimeUnit.DAYS.toMillis(1));
        }

        return (date2.getTime() - date1.getTime()) / 60000;
    }

    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        System.out.print(CountingMinutes(s.nextLine()));
    }

}