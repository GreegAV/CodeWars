package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata105Test {
    static int[] p1 = {3, 4, 5};
    static int[] p2 = {3, 5, 7};

    Kata105 pT = new Kata105();

    @Test
    public void validTriple() {
        assertEquals(1, pT.pythagoreanTriple(p1));
    }

    public void invalidTriple() {
        assertEquals(0, pT.pythagoreanTriple(p2));
    }
}