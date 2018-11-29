package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata089Test {

    @Test
    public void BasicTest1() {
        assertEquals(100, Kata089.saleHotdogs(1));
    }

    @Test
    public void BasicTest2() {
        assertEquals(400, Kata089.saleHotdogs(4));
    }

    @Test
    public void BasicTest3() {
        assertEquals(475, Kata089.saleHotdogs(5));
    }

    @Test
    public void BasicTest4() {
        assertEquals(855, Kata089.saleHotdogs(9));
    }

    @Test
    public void BasicTest5() {
        assertEquals(900, Kata089.saleHotdogs(10));
    }

    @Test
    public void BasicTest6() {
        assertEquals(9000, Kata089.saleHotdogs(100));
    }
}