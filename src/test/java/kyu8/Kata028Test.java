package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Kata028Test {

    @Test
    public void basicTest() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Kata028.mergeArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
    }

    @Test
    public void basicTest2() {
        assertArrayEquals(new int[]{2, 4, 6, 8}, Kata028.mergeArrays(new int[]{2, 4, 8}, new int[]{2, 4, 6}));
    }
}