package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata103Test {

    @Test
    public void basicTest1() {
        assertEquals(-1, Kata103.nthPower(new int[]{1, 2}, 2));
    }

    @Test
    public void basicTest2() {
        assertEquals(8, Kata103.nthPower(new int[]{3, 1, 2, 2}, 3));
    }

    @Test
    public void basicTest3() {
        assertEquals(4, Kata103.nthPower(new int[]{3, 1, 2}, 2));
    }
}