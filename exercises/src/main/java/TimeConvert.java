import java.util.Scanner;
public class TimeConvert {
    //Time Convert
    //Have the function TimeConvert(num) take the num parameter
    // being passed and return the number of hours and minutes
    // the parameter converts to (ie. if num = 63 then the output should be 1:3). Separate the number of hours and minutes with a colon.
    //Examples
    //Input: 126
    //Output: 2:6
    //Input: 45
    //Output: 0:45
    public static String TimeConvert(int num) {
        int hour = num / 60;
        int minutes = num % 60;
        String time = hour + ":" + minutes;
        return time;
    }
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(TimeConvert(126));
    }
}

