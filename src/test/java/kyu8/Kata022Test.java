package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata022Test {
    @Test
    public void test4a() {
        assertEquals("aaaa", Kata022.repeatStr(4, "a"));
    }

    @Test
    public void test3Hello() {
        assertEquals("HelloHelloHello", Kata022.repeatStr(3, "Hello"));
    }

    @Test
    public void test5empty() {
        assertEquals("", Kata022.repeatStr(5, ""));
    }

    @Test
    public void test0kata() {
        assertEquals("", Kata022.repeatStr(0, "kata"));
    }

    @Test
    public void testNegativeRepeat() {
        assertEquals("", Kata022.repeatStr(-10, "kata"));
    }
}