import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentItem {


    @Test
    public void stringEquality() {
        String text1 = "Java Rocks!";
        String text2 = new String("Java Rocks!");
        String text3 = "Java Rocks!";
        assertNotSame(text1, text2);
        assertEquals(text1, text2);
        assertSame(text1, text3);
        assertTrue(text1.equalsIgnoreCase(text2));
        assertTrue(Objects.equals(text1, text2));
    }}