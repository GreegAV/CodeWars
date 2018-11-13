package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class Kata027Test {

    @Test
    public void fixedTest10005() {
        assertTrue(Kata027.isDivisible(10005, 1));
    }

    @Test
    public void fixedTest10000() {
        assertTrue(Kata027.isDivisible(10000, 20));
    }

    @Test
    public void fixedTest4050() {
        assertTrue(Kata027.isDivisible(4050, 27));
    }

    @Test
    public void fixedTest4066() {
        assertFalse(Kata027.isDivisible(4066, 27));
    }

    @Test
    public void fixedTest10005_2() {
        assertFalse(Kata027.isDivisible(10005, 2));
    }
}