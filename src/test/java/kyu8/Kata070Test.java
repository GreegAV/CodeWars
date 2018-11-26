package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: TDD development by writing your own tests as you solve the kata

public class Kata070Test {

    @Test
    public void test_authentication1() {
        assertEquals(true, Kata070.authenticate("Santa Claus", "Ho Ho Ho!"));
    }

    @Test
    public void test_authentication2() {
        assertEquals(false, Kata070.authenticate("Santa", "Ho Ho Ho!"));
    }

    @Test
    public void test_authentication0() {
        assertEquals(false, Kata070.authenticate("Hello", "World!"));
    }

    @Test
    public void test_authentication3() {
        assertEquals(true, Kata070.authenticate("Santa Claus", "Ho Ho Ho!"));
    }
}