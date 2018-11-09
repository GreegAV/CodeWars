package kyu8;

import kyu8.Kata012;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata012Test {

    @Test
    public void testSomething() {
        assertEquals(1, Kata012.strCount("Hello", 'o'));
    }

    @Test
    public void testSomething2() {
        assertEquals(2, Kata012.strCount("Hello", 'l'));
    }

    @Test
    public void testSomething3() {
        assertEquals(0, Kata012.strCount("", 'z'));
    }
}