package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata113Test {

    @Test
    public void BasicTest1() {
        assertEquals(0, Kata113.sum(new int[]{}));
    }

    @Test
    public void BasicTest2() {
        assertEquals(0, Kata113.sum(new int[]{0,0,0,0,0}));
    }

    @Test
    public void BasicTest3() {
        assertEquals(0, Kata113.sum(null));
    }

    @Test
    public void BasicTest4() {
        assertEquals(16, Kata113.sum(new int[]{6, 2, 1, 8, 10}));
    }

    @Test
    public void BasicTest5() {
        assertEquals(0, Kata113.sum(new int[]{6, 2}));
    }

    @Test
    public void BasicTest6() {
        assertEquals(0, Kata113.sum(new int[]{6}));
    }
}