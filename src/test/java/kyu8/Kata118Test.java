package kyu8;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class Kata118Test {

    @Test
    public void fixedTests() {
        assertFalse(Kata118.isDigit(""));
        assertTrue(Kata118.isDigit("7"));
        assertFalse(Kata118.isDigit(" "));
        assertFalse(Kata118.isDigit("a"));
        assertFalse(Kata118.isDigit("a5"));
        assertFalse(Kata118.isDigit("14"));
    }
}