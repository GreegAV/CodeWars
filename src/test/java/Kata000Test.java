import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class Kata000Test {
    @Test
    public void testDouble() {
        assertEquals(Double.valueOf(0), Kata000.multiply(Double.valueOf(0),Double.valueOf(0)));
    }
}