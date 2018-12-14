package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata137Test {
    @Test
    public void testSum() throws Exception {
        byte a = 1;
        byte b = 2;
        assertEquals(3, Kata137.sum(a, b));
    }
}