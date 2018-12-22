package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata013Test {

    Kata013 s = new Kata013();

    @Test
    public void Test1() {
        assertEquals(-1, s.GetSum(0, -1));
    }

    @Test
    public void Test2() {
        assertEquals(1, s.GetSum(0, 1));
    }

}