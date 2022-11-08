import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeatingStudents {

    /*//Seating Students
    //Have the function SeatingStudents(arr) read the array of integers stored in arr which will be in the following format: [K, r1, r2, r3, ...] where K represents the number of desks in a classroom, and the rest of the integers in the array will be in sorted order and will represent the desks that are already occupied. All of the desks will be arranged in 2 columns, where desk #1 is at the top left, desk #2 is at the top right, desk #3 is below #1, desk #4 is below #2, etc. Your program should return the number of ways 2 students can be seated next to each other. This means 1 student is on the left and 1 student on the right, or 1 student is directly above or below the other student.
    //
    //For example: if arr is [12, 2, 6, 7, 11] then this classrooms looks like the following picture:

    Based on above arrangement of occupied desks, there are a total of 6 ways to seat 2 new students next to each other. The combinations are: [1, 3], [3, 4], [3, 5], [8, 10], [9, 10], [10, 12]. So for this input your program should return 6. K will range from 2 to 24 and will always be an even number. After K, the number of occupied desks in the array can range from 0 to K.
    Examples
    Input: new int[] {6, 4}
    Output: 4
    Input: new int[] {8, 1, 8}
    Output: 6*/


    public static int SeatingStudents(int[] arr) {
        List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.<Integer>toList());
        integerList.remove(0);
        List<Integer> integerStream = Stream.iterate(1, n -> n + 1).limit(arr[0]).collect(Collectors.toList());

        int counter = 0;
        for (int i = 0; i < integerStream.size() - 1; i++) { // poziom
            if (!integerList.contains(integerStream.get(i)))
                if (integerStream.get(i) % 2 != 0 && integerStream.contains(integerStream.get(i + 1)) && !integerList.contains(integerStream.get(i + 1))) {
                    counter++;
                }
        }
        for (int j = 0; j < integerStream.size() - 2; j++) { //pion
            if (!integerList.contains(integerStream.get(j)))
                if ((integerStream.get(j) + integerStream.get(j + 2)) % 2 == 0 && !integerList.contains(integerStream.get(j + 2))) {
                    counter++;
                }
        }
        return counter;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SeatingStudents(new int[]{12, 2, 6, 7, 11}));
    }
}
