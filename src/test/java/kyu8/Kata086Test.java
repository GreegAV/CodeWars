package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata086Test {
    @Test
    public void testBob() {
        assertEquals("Should return 0.", 0, Kata086.enough(10, 5, 5));
    }

    @Test
    public void testBob2() {
        assertEquals("Should return 10.", 10, Kata086.enough(100, 60, 50));
    }
}