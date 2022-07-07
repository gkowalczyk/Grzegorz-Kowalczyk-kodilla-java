import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GravityFlipTest {
    @Test
    public void Sample() {
        GravityFlip gravityFlip = new GravityFlip();

        assertArrayEquals(new int[]{ 1,2,2,3 }, gravityFlip.flip('R', new int[]{ 2,2,1,3 }));
        assertArrayEquals(new int[]{ 5,5,4,3,1 }, gravityFlip.flip('L', new int[]{ 1,4,5,3,5 }));
    }
}

