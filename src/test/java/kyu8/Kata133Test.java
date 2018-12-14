package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Kata133Test {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, Kata133.pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, Kata133.pipeFix(new int[]{1, 2, 3, 12}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{6, 7, 8, 9}, Kata133.pipeFix(new int[]{6, 9}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4}, Kata133.pipeFix(new int[]{-1, 4}));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[]{1, 2, 3}, Kata133.pipeFix(new int[]{1, 2, 3}));
    }
}