package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Kata069v2Test {
    @Test
    public void tests1() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, Kata069v2.digitize(35231));
    }

    @Test
    public void tests2() {
        assertArrayEquals(new int[]{6, 0, 1}, Kata069v2.digitize(106));
    }
}