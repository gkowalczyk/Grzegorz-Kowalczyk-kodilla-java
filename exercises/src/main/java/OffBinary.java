import java.util.Scanner;

public class OffBinary {

    //Have the function OffBinary(strArr) read the array of strings stored in strArr, which will
    // contain two elements, the first will be a positive decimal number and the second element
    // will be a binary number. Your goal is to determine how many digits in the binary number need to
    // be changed to represent the decimal number correctly (either 0 change to 1 or vice versa).
    // For example: if strArr is ["56", "011000"] then your program should return 1 because only
    // 1 digit needs to change in the binary number (the first zero needs to become a 1) to correctly
    // represent 56 in binary.
    //Examples
    //Input: new String[] {"5624", "0010111111001"}
    //Output: 2                     1010111111000
    //Input: new String[] {"44", "111111"}
    //Output: 3
//1, 2, 4, 8, 16, 32, 64, 128
    // 128  64   32   16   8  4   2   1
    //56      1 1 1 0 0 0          32   16   8  0  0   0
    // 44     1  0  1  1  0  0
    public static String OffBinary(String[] strArr) {
        String binary = strArr[1];
        int counter = 0;
        for (int i = 0; i < binary.length(); i++) {
            String decimalToBinary = Integer.toBinaryString(Integer.parseInt(strArr[0]));
            if (binary.charAt(i) != (decimalToBinary.charAt(i))) {
                counter++;
            }
        }
        return Integer.toString(counter);
    }
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(OffBinary(new String[]{"44", "111111"}));
    }
}

