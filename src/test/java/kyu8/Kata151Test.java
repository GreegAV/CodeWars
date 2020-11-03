package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.runners.JUnit4;

public class Kata151Test {
    @Test
    public void testSomething() {
        assertTrue(Kata151.zeroFuel(50, 25, 2));
        assertFalse(Kata151.zeroFuel(100, 50, 1));
    }
}