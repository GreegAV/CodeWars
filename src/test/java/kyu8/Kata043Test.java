package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata043Test {

    @Test
    public void exampleTests0() {
        assertEquals(0, Kata043.nthEven(1));
    }

    @Test
    public void exampleTests2() {
        assertEquals(2, Kata043.nthEven(2));
    }

    @Test
    public void exampleTests4() {
        assertEquals(4, Kata043.nthEven(3));
    }

    @Test
    public void exampleTests198() {
        assertEquals(198, Kata043.nthEven(100));
    }

    @Test
    public void exampleTests2597466() {
        assertEquals(2597466, Kata043.nthEven(1298734));
    }
}