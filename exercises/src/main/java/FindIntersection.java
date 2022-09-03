import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

import static java.util.stream.Collectors.toCollection;


//Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements: the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the string false.
//Examples
//Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
//Output: 1,4,13
//Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
//Output: 1,9,10
class FindIntersection {

    public static String FindIntersection(String[] strArr) {
        // System.out.println(Integer.parseInt("12"));

        Collection<Integer> set1 = Arrays.stream(strArr[0]
                        // .replace(" ", "")
                        .split(", "))
                .map(Integer::parseInt)
                .collect(toCollection(TreeSet::new));

        Collection<Integer> set2 = Arrays.stream(strArr[1]
                        // .replace(" ", "")
                        .split(", "))
                .map(Integer::parseInt)
                .collect(toCollection(TreeSet::new));
        set1.retainAll(set2);

        return Arrays.toString(new TreeSet<>(set1).toArray()).replace("]", "").replace("[", "").replace(" ", "");

    }

public static void main (String[] args) {
        // keep this function call here
       // Scanner s = new Scanner(System.in);
        System.out.print(FindIntersection(new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));
        }
        }