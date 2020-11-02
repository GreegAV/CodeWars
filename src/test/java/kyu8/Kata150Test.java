package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

public class Kata150Test {
    @Test
    public void checkSmallValues() {
        assertEquals(6, Kata150.expressionsMatter(2, 1, 2));
        assertEquals(3, Kata150.expressionsMatter(1, 1, 1));
        assertEquals(4, Kata150.expressionsMatter(2, 1, 1));
        assertEquals(9, Kata150.expressionsMatter(1, 2, 3));
        assertEquals(5, Kata150.expressionsMatter(1, 3, 1));
        assertEquals(8, Kata150.expressionsMatter(2, 2, 2));
    }

    @Test
    public void checkIntermediateValues() {
        assertEquals(20, Kata150.expressionsMatter(5, 1, 3));
        assertEquals(105, Kata150.expressionsMatter(3, 5, 7));
        assertEquals(35, Kata150.expressionsMatter(5, 6, 1));
        assertEquals(8, Kata150.expressionsMatter(1, 6, 1));
        assertEquals(14, Kata150.expressionsMatter(2, 6, 1));
        assertEquals(48, Kata150.expressionsMatter(6, 7, 1));
    }

    @Test
    public void checkMixedValues() {
        assertEquals(60, Kata150.expressionsMatter(2, 10, 3));
        assertEquals(27, Kata150.expressionsMatter(1, 8, 3));
        assertEquals(126, Kata150.expressionsMatter(9, 7, 2));
        assertEquals(20, Kata150.expressionsMatter(1, 1, 10));
        assertEquals(18, Kata150.expressionsMatter(9, 1, 1));
        assertEquals(300, Kata150.expressionsMatter(10, 5, 6));
        assertEquals(12, Kata150.expressionsMatter(1, 10, 1));
    }
}