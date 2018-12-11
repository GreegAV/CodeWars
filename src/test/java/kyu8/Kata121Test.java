package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata121Test {
    @Test
    public void test1() {
        assertEquals("stringToNumber(1234)", 1234, Kata121.stringToNumber("1234"));
    }

    @Test
    public void test2() {
        assertEquals("stringToNumber(605)", 605, Kata121.stringToNumber("605"));
    }

    @Test
    public void test3() {
        assertEquals("stringToNumber(1405)", 1405, Kata121.stringToNumber("1405"));
    }

    @Test
    public void test4() {
        assertEquals("stringToNumber(-7)", -7, Kata121.stringToNumber("-7"));
    }
}