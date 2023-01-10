import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSequence {
//Have the function LongestIncreasingSequence(arr) take the
// array of positive integers stored in arr and return the length
// of the longest increasing subsequence (LIS). A LIS is a subset
// of the original list where the numbers are in sorted order, from
// lowest to/ highest, and are in increasing order. The sequence does
// not need to be contiguous or unique, and there can be several different
// subsequences. For example: if arr is [4, 3, 5, 1, 6] then a possible
// LIS is [3, 5, 6], and another is [1, 6]. For this input, your program
// should return 3 because that is the length of the longest increasing
// subsequence.
//Examples
//Input: new int[] {9, 9, 4, 2}
//Output: 1
//Input: new int[] {10, 22, 9, 33, 21, 50, 41, 60, 22, 68, 90}
//Output: 7

    public static int LongestIncreasingSequence(int[] arr ) {
        int[] tempArray = new int[arr.length];
        Arrays.fill(tempArray, 1);
        for (int a = 1; a < arr.length; a++) {

            for (int b = 0; b  < a; b++) {
                if (arr[a] > arr[b]) {
                    tempArray[a] = Math.max(tempArray[b] + 1, 0);
                    }
                }
            }
            int result = 0;
            for (int number : tempArray) {
                result = Math.max(0, number);
                System.out.println(result);
            }
            return result;
        }




        /*



        int tempCounter = 0;
        List<Integer> integerList = new ArrayList<>();
        for (int n = 0; n < arr.length; n++) {
            int max = 0;

            for (int k = n; k < arr.length; k++) {
                int valueK = arr[k];
                if (valueK > max) {
                    max = valueK;
                    tempCounter++;

                }
            }
            integerList.add(tempCounter);

        }
        IntStream differences =
                IntStream.range(0, integerList.size()-1)
                        .map(i -> integerList.get(i+1)  - integerList.get(i));
        int max = differences
               // .mapToLong(x->x)

                .max()
                .orElse(0);
        // System.out.println(max);


        return max;*/


    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestIncreasingSequence(new int[]{10, 22, 9, 33}));  //7
    }
}
