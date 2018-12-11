package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Kata122Test {

    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Kata122.monkeyCount(5));
        assertArrayEquals(new int[]{1, 2, 3}, Kata122.monkeyCount(3));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, Kata122.monkeyCount(9));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, Kata122.monkeyCount(10));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, Kata122.monkeyCount(20));
    }
}