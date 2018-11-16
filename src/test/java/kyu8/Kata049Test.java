package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata049Test {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething1() {
        assertEquals(1, Kata049.find_average(new int[]{1, 1, 1}), DELTA);
    }

    @Test
    public void testSomething2() {
        assertEquals(2, Kata049.find_average(new int[]{1, 2, 3}), DELTA);
    }

    @Test
    public void testSomething3() {
        assertEquals(3, Kata049.find_average(new int[]{1, 2, 3, 4, 5}), DELTA);
    }

    @Test
    public void testSomething137() {
        assertEquals(137.4, Kata049.find_average(new int[]{121, 125, 137, 149, 155}), DELTA);
    }
}