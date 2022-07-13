import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTestSuite {

    @Test
    void fibonacciTest() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(fibonacci.fibonacci(6),8);
    }
}