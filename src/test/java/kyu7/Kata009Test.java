package kyu7;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata009Test {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Kata009.getCount("abracadabra"));
    }

}