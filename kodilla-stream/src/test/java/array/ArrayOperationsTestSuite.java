package array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.jupiter.api.*;

public class ArrayOperationsTestSuite {

    @BeforeEach
    public void beforeEveryTest() {
        System.out.println("Preparing to execute test Get average and display Array");
    }
    @DisplayName("average and display array")
    @Test
    void testGetAverage() {
        //Given
            int[] arrays = new int[5];
            arrays[0] = 1;
            arrays[1] = 2;
            arrays[2] = 3;
            arrays[3] = 4;
            arrays[4] = 5;
        //When
            double result = ArrayOperations.getAverage(arrays);
        //Then
            Assertions.assertEquals(3, result);
    }
}


