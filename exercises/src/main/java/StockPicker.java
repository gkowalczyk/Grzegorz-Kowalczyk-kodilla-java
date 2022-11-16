import java.util.Scanner;

public class StockPicker {

    //Have the function StockPicker(arr) take the array of numbers stored in arr which will contain integers that represent the amount in dollars that a single stock is worth, and return the maximum profit that could have been made by buying stock on day x and selling stock on day y where y > x. For example: if arr is [44, 30, 24, 32, 35, 30, 40, 38, 15] then your program should return 16 because at index 2 the stock was worth $24 and at index 6 the stock was then worth $40, so if you bought the stock at 24 and sold it at 40, you would have made a profit of $16, which is the maximum profit that could have been made with this list of stock prices.
    //
    //If there is not profit that could have been made with the stock prices, then your program should return -1. For example: arr is [10, 9, 8, 2] then your program should return -1.
    //Examples
    //Input: new int[] {10,12,4,5,9}
    //Output: 5
    //Input: new int[] {14,20,4,12,5,11}
    //Output: 8

    public static int StockPicker(int[] arr) {
        // code goes here

        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int profit = arr[j] - arr[i];
                //System.out.println("max =" + max + "for pos i =" + arr[i] );
                //System.out.println("max =" + max + "for pos j =" + arr[j] );
                if (profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StockPicker(new int[]{10,12,4,5,9}));
    }
}