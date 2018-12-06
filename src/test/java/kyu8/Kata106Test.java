package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class Kata106Test {

    @Test
    public void basicTest1() {
        assertEquals(Integer.valueOf(6), Kata106.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
    }

    @Test
    public void basicTest2() {
        assertEquals(null, Kata106.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void basicTest3() {
        assertEquals(Integer.valueOf(6), Kata106.find(new int[]{4, 6, 7, 8, 9, 11}));
    }

    @Test
    public void basicTest4() {
        assertEquals(Integer.valueOf(11), Kata106.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
    }

    @Test
    public void basicTest5() {
        assertEquals(null, Kata106.find(new int[]{31, 32}));
    }

    @Test
    public void basicTest6() {
        assertEquals(Integer.valueOf(0), Kata106.find(new int[]{-3, -2, 0, 1}));
    }

    @Test
    public void basicTest7() {
        assertEquals(Integer.valueOf(-1), Kata106.find(new int[]{-5, -4, -3, -1}));
    }
}