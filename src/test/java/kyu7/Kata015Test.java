package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

public class Kata015Test {
    @Test
    public void should_return_the_output_provided08() {
        PawnDistance actual = Kata015.redKnight(0, 8);
        PawnDistance expected = new PawnDistance("White", 16);
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_the_output_provided07() {
        PawnDistance actual = Kata015.redKnight(0, 7);
        PawnDistance expected = new PawnDistance("Black", 14);
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_the_output_provided16() {
        PawnDistance actual = Kata015.redKnight(1, 6);
        PawnDistance expected = new PawnDistance("Black", 12);
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_the_output_provided15() {
        PawnDistance actual = Kata015.redKnight(1, 5);
        PawnDistance expected = new PawnDistance("White", 10);
        assertEquals(expected, actual);
    }

}