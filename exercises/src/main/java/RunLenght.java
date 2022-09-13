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

        for (int n = 0; n < str.length(); n++) {
         //  System.out.println("                     petla for n :" + n);


            int counter = 1;

            while (n < str.length() -1  // -1  bo mamy przy 5 przebiegu np dla "aaabbcc" nie mam wartości n+1
                    && str.charAt(n) == str.charAt(n + 1)) {
               // System.out.println("n0:" + n);
                counter++;
                n++;
               //System.out.println("n1:" + n);
              //  System.out.println("char(n):" + str.charAt(n));
               // System.out.println("counter:" + counter);

            }
            System.out.println(counter + "" + str.charAt(n));
        }
        return "";
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge("aaabbc"));
    }
}

