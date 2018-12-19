package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata006Test {
    @Test
    public void Test1() {
        assertEquals("Yes", Kata006.helpZoom(new int[]{1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1}));
    }

    @Test
    public void Test2() {
        assertEquals("No", Kata006.helpZoom(new int[]{1, 1, 0, 0, 0, 0, 1, 1, 0}));
    }

}