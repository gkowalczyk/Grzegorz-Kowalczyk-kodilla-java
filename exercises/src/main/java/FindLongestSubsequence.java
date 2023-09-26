import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindLongestSubsequence {

    public static int findLCS(String str1, String str2) {

        int str1Lenght = str1.length();
        int str2Lenght = str2.length();
        int array[][] = new int[str1Lenght + 1][str2Lenght + 1];

        IntStream.rangeClosed(1, str1Lenght).forEach(i -> {
            IntStream.rangeClosed(1, str2Lenght).forEach(j -> {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    array[i][j] = array[i - 1][j - 1] + 1;
                } else {
                    array[i][j] = Math.max(array[i - 1][j], array[i][j - 1]);
                }
            });
        });
        IntStream.rangeClosed(1, str1Lenght).forEach(i -> {
            IntStream.rangeClosed(1, str2Lenght).forEach(j -> {
                System.out.print(array[i][j] + " | ");
            });
            System.out.println();
        });
        OptionalInt result = Arrays.stream(array).flatMapToInt(Arrays::stream).max();
        return result.getAsInt();
    }


      /*  for (int i = 1; i <= str1Lenght; i++) {
            for (int j = 1; j <= str2Lenght; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    array[i][j] = array[i - 1][j - 1] + 1;
                } else {
                    array[i][j] = Math.max(array[i - 1][j], array[i][j - 1]);
                }
            }
        }
        int max = 0;
        for (int i = 0; i <= str1Lenght; i++) {
            for (int j = 0; j <= str2Lenght; j++) {
                System.out.print(array[i][j] + " | ");
                max = array[i][i];
            }
            System.out.println();
        }
        return max;*/

    public static void main(String[] args) {
        String str1 = "FISH";
        String str2 = "FOSH";
        Integer lcs = findLCS(str1, str2); //Longest Common Subsequence
        System.out.println("Longest Common Subsequence = " + lcs);
    }
}
