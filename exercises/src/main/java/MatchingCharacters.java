import java.util.*;

public class MatchingCharacters {

    //Have the function MatchingCharacters(str) take the str parameter
    // being passed and determine the largest number of unique characters
    // that exists between a pair of matching letters anywhere in the string.
    // For example: if str is "ahyjakh" then there are only two pairs of
    // matching letters, the two a's and the two h's. Between the pair of a's
    // there are 3 unique characters: h, y, and j. Between the h's there are
    // 4 unique characters: y, j, a, and k. So for this example your program
    // should return 4.
    //
    //Another example: if str is "ghececgkaem" then your program should
    // return 5 because the most unique characters exists within the
    // farthest pair of e characters. The input string may not contain
    // any character pairs, and in that case your program should just
    // return 0. The input will only consist of lowercase alphabetic characters.
    //Examples
    //Input: "mmmerme"
    //Output: 3
    //Input: "abccdefghi"
    //Output: 0

    //  "a h y j a k h"
    public static String MatchingCharacters(String str) {


        List<Integer> list = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        String s = str;
        int l = s.length();
        for (int z = 0; z < s.length() - 1; z++) {
            if (Objects.equals(str.charAt(z), str.charAt(z + 1))) {
                s = str.substring(z, l);
            }
        }
        String s1 = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i; j < s.length() - 1; j++) {

                if (s.charAt(i) == s.charAt(j + 1) && i != j) {
                    characters.add(s.charAt(i));
                    list.add(j - i);
                    s1 = s.substring(i + 1, j + 2);
                    break;
                }
            }
        }
        if (list.isEmpty()) {
            return 0 + "";
        }
        if (characters.get(0) == characters.get(characters.size() - 1)) {
            list.add(list.get(0) + list.get(list.size() - 1));
        }
        if ((s1).repeat(s.length() / s1.length()).equals(str)) {
            return s1.length() + "";
        }
        return characters.size() == 1 ? Collections.min(list) + "" : list.isEmpty() || str.length() <= 2 ? 0 + "" : Collections.max(list) + "";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(MatchingCharacters("ahyjakh"));
    }
}

//"abcabcabc"

/*

        Set<Character> uniqueLtrs = new HashSet<>();
        String strToCheck = "";
        int maxLetters = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    strToCheck = str.substring(i+1, j);
                for (int k = 0; k < strToCheck.length(); k++) {
                    uniqueLtrs.add(strToCheck.charAt(k));
                }
                if (uniqueLtrs.size() > maxLetters)
                    maxLetters = uniqueLtrs.size();
                uniqueLtrs.clear();
            }
        }
        return maxLetters;
    }
*/

