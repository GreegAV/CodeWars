package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata174Test {
    @Test
    public void exampleTests1() {
        assertEquals(1, Kata174.quarterOf(1));
    }

    @Test
    public void exampleTests2() {
        assertEquals(2, Kata174.quarterOf(5));
    }

    @Test
    public void exampleTests3() {
        assertEquals(3, Kata174.quarterOf(8));
    }

    @Test
    public void exampleTests4() {
        assertEquals(4, Kata174.quarterOf(11));
    }
}