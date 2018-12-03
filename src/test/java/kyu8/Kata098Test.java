package kyu8;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Kata098Test {

    @Test
    public void testSimple1() {
        assertTrue(Arrays.equals(new long[]{2, 4, 6}, Kata098.divisibleBy(new long[]{1, 2, 3, 4, 5, 6}, 2)));
    }

    @Test
    public void testSimple2() {
        assertTrue(Arrays.equals(new long[]{3, 6}, Kata098.divisibleBy(new long[]{1, 2, 3, 4, 5, 6}, 3)));
    }

    @Test
    public void testSimple3() {
        assertTrue(Arrays.equals(new long[]{0, 4}, Kata098.divisibleBy(new long[]{0, 1, 2, 3, 4, 5, 6}, 4)));
    }
}
