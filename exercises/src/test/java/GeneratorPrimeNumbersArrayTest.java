import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumArrayTest {

    @Test
    public void testSum() {
        assertEquals(0,      SumArrays.sum1(new double[] { }),                1e-4);
        assertEquals(-2.398, SumArrays.sum1(new double[] {-2.398}),           1e-4);
        assertEquals(6,      SumArrays.sum1(new double[] {1, 2, 3}),          1e-4);
        assertEquals(6.6,    SumArrays.sum1(new double[] {1.1, 2.2, 3.3}),    1e-4);
        assertEquals(9.2,    SumArrays.sum1(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
        assertEquals(320,    SumArrays.sum1(new double[] {30, 89, 100, 101}), 1e-4);
    }
}
