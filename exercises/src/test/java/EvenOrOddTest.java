import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {

    @Test
    public void testEvenOrOdd() {
        Even_or_Odd evenOrOdd = new Even_or_Odd();
        assertEquals("Even", evenOrOdd.even_or_odd(6));
        assertEquals("Odd", evenOrOdd.even_or_odd(7));
        assertEquals("Even", evenOrOdd.even_or_odd(0));
        assertEquals("Odd", evenOrOdd.even_or_odd(-1));
    }
}