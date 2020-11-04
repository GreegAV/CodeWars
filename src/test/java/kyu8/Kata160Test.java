package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata160Test {
    @Test
    public void basicTests() {
        assertEquals(9, Kata160.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, Kata160.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, Kata160.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, Kata160.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, Kata160.sumOfDifferences(new int[0]));
        assertEquals(0, Kata160.sumOfDifferences(new int[]{0}));
        assertEquals(0, Kata160.sumOfDifferences(new int[]{-1}));
        assertEquals(0, Kata160.sumOfDifferences(new int[]{1}));
    }
    
    @Test
    public void basicTests0() {
        assertEquals(9, Kata160.sumOfDifferences(new int[]{1, 2, 10}));
    }

    @Test
    public void basicTests1() {
        assertEquals(2, Kata160.sumOfDifferences(new int[]{-3, -2, -1}));
    }

    @Test
    public void basicTests2() {
        assertEquals(0, Kata160.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void basicTests3() {
        assertEquals(34, Kata160.sumOfDifferences(new int[]{-17, 17}));
    }

    @Test
    public void basicTests4() {
        assertEquals(0, Kata160.sumOfDifferences(new int[0]));
    }

    @Test
    public void basicTests5() {
        assertEquals(0, Kata160.sumOfDifferences(new int[]{0}));
    }

    @Test
    public void basicTests6() {
        assertEquals(0, Kata160.sumOfDifferences(new int[]{-1}));
    }

    @Test
    public void basicTests7() {
        assertEquals(0, Kata160.sumOfDifferences(new int[]{1}));
    }

}