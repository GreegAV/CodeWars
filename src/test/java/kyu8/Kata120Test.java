package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Kata120Test {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", Kata120.position('a'));
        assertEquals("Position of alphabet: 26", Kata120.position('z'));
        assertEquals("Position of alphabet: 5", Kata120.position('e'));
    }
}