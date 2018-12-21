package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata011Test {

    @Test
    public void testQuicksumBasic1() {
        Kata011 quicksumObject = new Kata011();
        assertEquals(46, quicksumObject.quicksum("ACM"));
    }

    @Test
    public void testQuicksumBasic2() {
        Kata011 quicksumObject = new Kata011();
        assertEquals(650, quicksumObject.quicksum("MID CENTRAL"));
    }

    @Test
    public void testQuicksumBasic3() {
        Kata011 quicksumObject = new Kata011();
        assertEquals(15, quicksumObject.quicksum("BBC"));
    }

    @Test
    public void testQuicksumBasic4() {
        Kata011 quicksumObject = new Kata011();
        assertEquals(0, quicksumObject.quicksum("???"));
    }

    @Test
    public void testQuicksumBasic5() {
        Kata011 quicksumObject = new Kata011();
        assertEquals(0, quicksumObject.quicksum("axg"));
    }

    @Test
    public void testQuicksumBasic6() {
        Kata011 quicksumObject = new Kata011();
        assertEquals(0, quicksumObject.quicksum("234 234 WEF ASDF AAA 554211 ???? "));
    }

    @Test
    public void testQuicksumBasic7() {
        Kata011 quicksumObject = new Kata011();
        assertEquals(75, quicksumObject.quicksum("A C M"));
    }
}