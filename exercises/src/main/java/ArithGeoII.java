import java.util.Scanner;

public class ArithGeoII {

    //    /Arith Geo II
//Have the function ArithGeoII(arr) take the array of numbers stored in arr
// and return the string "Arithmetic" if the sequence follows an arithmetic
// pattern or return "Geometric" if it follows a geometric pattern. If the
// sequence doesn't follow either pattern return -1. An arithmetic sequence
// is one where the difference between each of the numbers is consistent,
// where as in a geometric sequence, each term after the first is multiplied
// by some constant or common ratio. Arithmetic example: [2, 4, 6, 8] and
// Geometric example: [2, 6, 18, 54]. Negative numbers may be entered as
// parameters, 0 will not be entered, and no array will contain all the same elements.
//Examples
//Input: new int[] {5,10,15}
//Output: Arithmetic
//Input: new int[] {2,4,16,24}
//Output: -1
    public static String ArithGeoII(int[] arr) {

        boolean arithmetic = false;
        boolean geometric = false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 1] - arr[i] == arr[i + 2] - arr[i + 1]
                    && arr[arr.length - 1] - arr[arr.length - 2] == arr[1] - arr[0]) {
                arithmetic = true;
            }
            if (arr[i + 1] / arr[i] == arr[i + 2] / arr[i + 1]
                    && arr[i + 1] % arr[i] == 0
                    && arr[i + 2] % arr[i + 1] == 0
                    && arr[i + 2] / arr[i + 1] == arr[2] / arr[1]) {
                geometric = true;
            }
        }
        return geometric ? "Geometric" : arithmetic ? "Arithmetic" : "-1";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ArithGeoII(new int[]{1, 2, 3, 4, 5, 10, 20}));
    }
}
