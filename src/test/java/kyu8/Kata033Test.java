package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata033Test {

    @Test
    public void FixedTests18() {
        assertEquals(18, Kata033.century(1705));
    }

    @Test
    public void FixedTests19() {
        assertEquals(19, Kata033.century(1900));
    }

    @Test
    public void FixedTests17() {
        assertEquals(17, Kata033.century(1601));
    }

    @Test
    public void FixedTests20() {
        assertEquals(20, Kata033.century(2000));
    }

    @Test
    public void FixedTests1() {
        assertEquals(1, Kata033.century(89));
    }
}