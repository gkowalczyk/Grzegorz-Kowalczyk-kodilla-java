import java.util.*;

public class SimpleMode {

    //Simple Mode
    //Have the function SimpleMode(arr) take the array of numbers stored in arr and return the number that appears most frequently (the mode). For example: if arr contains [10, 4, 5, 2, 4] the output should be 4. If there is more than one mode return the one that appeared in the array first (ie. [5, 10, 10, 6, 5] should return 5 because it appeared first). If there is no mode return -1. The array will not be empty.
    //Examples
    //Input: new int[] {5,5,2,2,1}
    //Output: 5
    //Input: new int[] {3,4,1,6,10}
    //Output: -1

    public static int SimpleMode(int[] arr) {
        int counter = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.get(arr[i]) == null ? counter = 1 : ++counter);
        }
        int largest = 0;
        int largestKey = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > largest) {
                largest = entry.getValue();
                largestKey = entry.getKey();
            }
        }
        if (largest == 1) {
            return -1;
        }
        //  System.out.println(key);
        // map.forEach((k,v) -> System.out.println(k + ":" + v));
        return largestKey;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SimpleMode(new int[]{3, 4, 1, 6, 10}));
    }

}