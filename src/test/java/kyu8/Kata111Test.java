package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata111Test {

    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", Kata111.removeExclamationMarks("Hello World!"));
    }

    @Test
    public void testSimpleString2() {
        assertEquals("Hello World", Kata111.removeExclamationMarks("H!!el!lo! !Wor!ld!!"));
    }
}