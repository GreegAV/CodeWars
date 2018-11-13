package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata023Test {

    @Test
    public void testOddAndEven() {
        assertEquals(true, Kata023.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        assertEquals(false, Kata023.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        assertEquals(false, Kata023.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        assertEquals(true, Kata023.isLove(0, 1));
    }

}