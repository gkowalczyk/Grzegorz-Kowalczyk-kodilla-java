import java.util.*;
import java.util.stream.Collectors;

public class DistinctList {
    //Have the function DistinctList(arr) take the array of numbers stored
    // in arr and determine the total number of duplicate entries. For example
    // if the input is [1, 2, 2, 2, 3] then your program should output 2 because there are two duplicates of one of the elements.
    //Examples
    //Input: new int[] {0,-2,-2,5,5,5}
    //Output: 3
    //Input: new int[] {100,2,101,4}
    //Output: 0

    public static int DistinctList(int[] arr) {

        Set<Integer> integerSet = new HashSet<>();
        List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int counter = 0;
        for (Integer number : integerList) {
            if (integerSet.contains(number)) {
                counter++;
            }
            integerSet.add(counter);
        }
        return counter;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(DistinctList(new int[]{0, 0, 0, 0}));
    }
}
