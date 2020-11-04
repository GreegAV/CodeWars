package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata162Test {

    private static final double DELTA = 1e-15;

    @Test
    public void basicTests162() {
        assertEquals(1.62, Kata162.squareArea(2), DELTA);
    }

    @Test
    public void basicTests0() {
        assertEquals(0, Kata162.squareArea(0), DELTA);
    }

    @Test
    public void basicTests80() {
        assertEquals(80, Kata162.squareArea(14.05), DELTA);
    }
}