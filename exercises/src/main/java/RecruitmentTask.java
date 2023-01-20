public class RecruitmentTask {

    //Here is a test task:
    //
    //You have two strings as an input , 3 < n < 5000, where n is a string length
    //Output is a boolean, which indicates if these two string are anagrams(case insensitive)
    //Write unit tests that covers at least 80% cases
    //Tech stack: Java 8+, JUnit 5
    //Publish in Gitlab/Github
    //Be ready to explain solution
    public static boolean isAnagram(String str1, String str2) {

        StringBuilder leftToRight = new StringBuilder(str1.replaceAll("[^a-zA-Z?]", ""));
        StringBuilder rightToLeft = new StringBuilder(str2.replaceAll("[^a-zA-Z?]", "")).reverse();
        if (leftToRight.toString().equals(rightToLeft.toString())) {
            return str1.length() > 3 && str1.length() < 5000;
        }
        return false;
    }
}

