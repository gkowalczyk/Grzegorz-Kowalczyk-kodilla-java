import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class A_wolf_in_sheeps_clothing_test {

    @Test
    public void testSomething() {
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", A_wolf_in_sheeps_clothing.attention(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", A_wolf_in_sheeps_clothing.attention(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", A_wolf_in_sheeps_clothing.attention(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", A_wolf_in_sheeps_clothing.attention(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep", A_wolf_in_sheeps_clothing.attention(new String[]{"sheep", "sheep", "wolf"}));
    }
}

