package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Kata029Test {

    @Test
    public void fixedTestTrue() {
        assertTrue(Kata029.feast("great blue heron", "garlic nann"));
        assertTrue(Kata029.feast("chickadee", "chocolate cake"));
    }

    @Test
    public void fixedTestFalse() {
        assertFalse(Kata029.feast("brown bear", "bear claw"));
        assertFalse(Kata029.feast("chjgh jgjhj", "cef hjkokc"));
    }
}