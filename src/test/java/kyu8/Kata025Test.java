package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

import java.util.*;

// TODO: Replace examples and use TDD development by writing your own tests

public class Kata025Test {

    @Test
    public void test6() {
        assertEquals(6, Kata025.grow(new int[]{1, 2, 3}));
    }

    @Test
    public void test16() {
        assertEquals(16, Kata025.grow(new int[]{4, 1, 1, 1, 4}));
    }

    @Test
    public void test24() {
        assertEquals(64, Kata025.grow(new int[]{2, 2, 2, 2, 2, 2}));
    }

    @Test
    public void test120() {
        assertEquals(120, Kata025.grow(new int[]{1, 2, 3, 4, 5}));
    }

}