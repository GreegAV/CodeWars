package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata131Test {

    @Test
    public void test1() {
        assertEquals(3.54f, Kata131.mpgToKPM(10), 0.001f);
    }

    @Test
    public void test2() {
        assertEquals(7.08f, Kata131.mpgToKPM(20), 0.001f);
    }

    @Test
    public void test3() {
        assertEquals(10.62f, Kata131.mpgToKPM(30), 0.001f);
    }
}