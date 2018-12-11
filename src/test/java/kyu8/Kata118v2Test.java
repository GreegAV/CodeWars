package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Kata118v2Test {

    @Test
    public void fixedTests() {
        assertFalse(Kata118v2.isDigit(""));
        assertTrue(Kata118v2.isDigit("7"));
        assertFalse(Kata118v2.isDigit(" "));
        assertFalse(Kata118v2.isDigit("a"));
        assertFalse(Kata118v2.isDigit("a5"));
        assertFalse(Kata118v2.isDigit("14"));
    }
}