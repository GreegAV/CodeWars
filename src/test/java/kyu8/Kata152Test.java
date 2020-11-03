package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Kata152Test {
    @Test
    public void basicTests() {
        assertTrue(Kata152.divide(4));
        assertTrue(Kata152.divide(6));
        assertFalse(Kata152.divide(2));
        assertFalse(Kata152.divide(5));
        assertTrue(Kata152.divide(88));
        assertTrue(Kata152.divide(100));
        assertFalse(Kata152.divide(67));
        assertTrue(Kata152.divide(90));
        assertTrue(Kata152.divide(10));
        assertFalse(Kata152.divide(99));
        assertTrue(Kata152.divide(32));
    }
}