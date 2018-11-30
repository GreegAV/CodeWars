package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata090Test {

    @Test
    public void testStar() {
        repeatTest("*", 3, "***");
    }

    @Test
    public void testHello() {
        repeatTest("Hello", 11, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello");
    }

    public void repeatTest(final Object toRepeat, final int n, final String expected) {
        final String testMessage = String.format("Testing with toRepeat = %s and n = %d", toRepeat, n);
        assertEquals(testMessage, expected, Kata090.repeatString(toRepeat, n));
    }
}