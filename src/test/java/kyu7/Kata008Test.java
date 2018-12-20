package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata008Test {

    @Test
    public void basicTest1() {
        assertEquals(2, Kata008.snail(3, 2, 1));
    }

    @Test
    public void basicTest2() {
        assertEquals(5, Kata008.snail(10, 3, 1));
    }

    @Test
    public void basicTest3() {
        assertEquals(8, Kata008.snail(10, 3, 2));
    }

    @Test
    public void basicTest4() {
        assertEquals(7, Kata008.snail(100, 20, 5));
    }

    @Test
    public void basicTest5() {
        assertEquals(1, Kata008.snail(5, 10, 3));
    }
}