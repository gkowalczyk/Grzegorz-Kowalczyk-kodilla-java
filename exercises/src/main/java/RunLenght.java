import java.util.Scanner;

class RunLenght {

//Run Length
//Have the function RunLength(str) take the str parameter
// being passed and return a compressed version of the string
// using the Run-length encoding algorithm. This algorithm works
// by taking the occurrence of each repeating character and outputting
// that number along with a single character of the repeating sequence.
// For example: "wwwggopp" would return 3w2g1o2p. The string will not
// contain any numbers, punctuation, or symbols.
//Examples
//Input: "aabbcde"
//Output: 2a2b1c1d1e
//Input: "wwwbbbw"
//Output: 3w3b1w

    public static String StringChallenge(String str) {

        for (int chars = 0; chars < str.length(); chars++) {
            int counter = 1;
            while (chars < str.length() - 1
                    && str.charAt(chars) == str.charAt(chars + 1)) {
                counter++;
                chars++;
            }
            System.out.print(counter + "" + str.charAt(chars));
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }
}

