package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;


public class Kata021Test {

    @Test
    public void testSomething1() {
        assertEquals(15, Kata021.sum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testSomething2() {
        assertEquals(13, Kata021.sum(new int[]{1, -2, 3, 4, 5}));
    }

    @Test
    public void testSomething3() {
        assertEquals(0, Kata021.sum(new int[]{}));
    }

    @Test
    public void testSomething4() {
        assertEquals(0, Kata021.sum(new int[]{-1, -2, -3, -4, -5}));
    }

    @Test
    public void testSomething5() {
        assertEquals(9, Kata021.sum(new int[]{-1, 2, 3, 4, -5}));
    }
}