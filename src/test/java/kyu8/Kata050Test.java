package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Kata050Test {
    @Test
    public void basicTests() {
        assertEquals("One", Kata050.switchItUp(1));
        assertEquals("Three", Kata050.switchItUp(3));
        assertEquals("Five", Kata050.switchItUp(5));
    }
}