package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

public class Kata177Test {
    @Test
    public void fixedTests1() {
        assertEquals(4, Kata177.nextId(new int[]{0, 1, 2, 3, 5}));
    }

    @Test
    public void fixedTests2() {
        assertEquals(4, Kata177.nextId(new int[]{1, 2, 0, 2, 3}));
    }

    @Test
    public void fixedTests3() {
        assertEquals(4, Kata177.nextId(new int[]{1, 2, 0, 2, 3, 5}));
    }

    @Test
    public void fixedTests4() {
        assertEquals(11, Kata177.nextId(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    public void fixedTests5() {
        assertEquals(0, Kata177.nextId(new int[]{}));
    }


}
