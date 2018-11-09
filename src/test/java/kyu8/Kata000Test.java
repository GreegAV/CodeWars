package kyu8;

import kyu8.Kata000;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class Kata000Test {
    @Test
    public void testDouble() {
        assertEquals(Double.valueOf(0), Kata000.multiply(Double.valueOf(0),Double.valueOf(0)));
    }
}