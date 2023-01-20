import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class RecruitmentTaskTest {

    private static int testCounter = 0;
    private final Random random = new Random();


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of test.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    public String generateStringsList(int expected) {

        char[] possibleChars = IntStream.rangeClosed('A', 'Z')
                .mapToObj(c -> "" + (char) c).collect(Collectors.joining()).toCharArray();
        StringBuffer string = new StringBuffer();
        for (int j = 0; j < expected; j++) {
            char randomChar = possibleChars[random.nextInt(possibleChars.length)];
            string = string.append(randomChar);
        }
        return string.toString();
    }

    @Test
    void isAnagramManualTestSuite() {

        //Given
        String leftToRight = "It seems that working at Digis company can be quite OK :) :)";
        StringBuilder rightToLeftAndLowerCase = new StringBuilder(leftToRight.toLowerCase()).reverse();

        //When
        boolean isAnagram = RecruitmentTask.isAnagram(rightToLeftAndLowerCase.toString(), leftToRight);

        //Then
        Assertions.assertFalse(isAnagram);
    }

    @Test
    void isAnagramLengthOneStringTestSuite() {

        //Given
        String oneString = generateStringsList(1);
        StringBuilder stringOne = new StringBuilder(oneString).reverse();

        //When
        boolean isAnagram = RecruitmentTask.isAnagram(stringOne.toString(), oneString);

        //Then
        Assertions.assertFalse(isAnagram);
    }

    @Test
    void isAnagramLengthThreeStringTestSuite() {
        //Given
        String threeString = generateStringsList(3);
        StringBuilder stringThree = new StringBuilder(threeString).reverse();

        //When
        boolean isAnagram = RecruitmentTask.isAnagram(threeString, stringThree.toString());

        //Then
        Assertions.assertFalse(isAnagram);
    }

    @Test
    void isAnagramLengthMoreThanThreeStringTestSuite() {
        //Given
        String moreThanThreeString = generateStringsList(4999);
        StringBuilder stringBuilderReverse = new StringBuilder(moreThanThreeString).reverse();

        //When
        boolean isAnagram = RecruitmentTask.isAnagram(stringBuilderReverse.toString(), moreThanThreeString);

        //Then
        Assertions.assertTrue(isAnagram);
    }

    @Test
    void isAnagramLengthMoreThanThreeThousandStringTestSuite() {
        //Given
        String moreThan5000 = generateStringsList(5001);
        StringBuilder stringBuilderReverse = new StringBuilder(moreThan5000).reverse();

        //When
        boolean isAnagram = RecruitmentTask.isAnagram(stringBuilderReverse.toString(), moreThan5000);

        //Then
        Assertions.assertFalse(isAnagram);
    }

    @Test
    void isAnagramLengthEqualThreeThousandStringTestSuite() {
        //Given
        String threeThousandString = generateStringsList(5000);
        StringBuilder stringBuilderReverse = new StringBuilder(threeThousandString).reverse();

        //When
        boolean isAnagram = RecruitmentTask.isAnagram(threeThousandString, stringBuilderReverse.toString());

        //Then
        Assertions.assertFalse(isAnagram);
    }

    @Test
    void isAnagramLengthZeroStringTestSuite() {

        //Given
        String zeroString = generateStringsList(0);
        StringBuilder stringZero = new StringBuilder(zeroString).reverse();

        //When
        boolean isAnagram = RecruitmentTask.isAnagram(stringZero.toString(), zeroString);

        //Then
        Assertions.assertFalse(isAnagram);
        Assertions.assertEquals("", zeroString);
    }
}


