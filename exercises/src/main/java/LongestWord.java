//Longest Word
//Have the function LongestWord(sen) take
// the sen parameter being passed and return the
// longest word in the string. If there are two or
// more words that are the same length, return the first
// word from the string with that length. Ignore punctuation
// and assume sen will not be empty. Words may also contain numbers,
// for example "Hello world123 567"
//Examples
//Input: "fun&!! time"
//Output: time
//Input: "I love dogs"
//Output: love


public class LongestWord {

    public static String LongestWord(String sen) {

        String[] arrayOfStrings = sen.split("[^a-z^0-9^]");

        int maxIndexLengthOfArray = 0;
        String maxLengthWord = "";

        for (int n = 0; n < arrayOfStrings.length; n++) {
            if (arrayOfStrings[n].length() > maxIndexLengthOfArray) {
                maxLengthWord = arrayOfStrings[n];
                maxIndexLengthOfArray = arrayOfStrings[n].length();
            }
        }
        return maxLengthWord;
    }

    public static void main(String[] args) {
        System.out.println(LongestWord("Hello world123 567"));
    }
}
