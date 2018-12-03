package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata097Test {

    @Test
    public void exampleTest1() {
        assertEquals("15-20", Kata097.datingRange(17));
    }

    @Test
    public void exampleTest2() {
        assertEquals("27-66", Kata097.datingRange(40));
    }

    @Test
    public void exampleTest3() {
        assertEquals("14-16", Kata097.datingRange(15));
    }

    @Test
    public void exampleTest4() {
        assertEquals("24-56", Kata097.datingRange(35));
    }

    @Test
    public void exampleTest5() {
        assertEquals("9-11", Kata097.datingRange(10));
    }
}