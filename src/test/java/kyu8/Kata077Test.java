package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class Kata077Test {

    @Test
    public void sampleTest1() {
        assertEquals(21, Kata077.arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }

    @Test
    public void sampleTest2() {
        assertEquals(-21, Kata077.arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}));
    }

    @Test
    public void sampleTest3() {
        assertEquals(15, Kata077.arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6}));
    }

    @Test
    public void sampleTest4() {
        assertEquals(2100, Kata077.arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600}));
    }
}