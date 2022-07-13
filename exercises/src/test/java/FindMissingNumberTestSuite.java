import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMissingNumberTestSuite {

    @Test
    void findMissingNumberTest() {
        FindMissingNumber findMissingNumber = new FindMissingNumber();
      //  System.out.println(findMissingNumber.elementToFind(0,1,2,3,4,5,7));
        assertEquals(6, findMissingNumber.elementToFind(0,1,2,3,4,5,7));
    }
}
