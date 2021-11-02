import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Test
    void probablyIWillThrowExceptionTest() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When and Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 4));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5));
    }
}


