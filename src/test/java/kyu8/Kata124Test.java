package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata124Test {

    @Test
    public void basicTest1() {
        // assertEquals("expected", "actual");
        assertEquals(7, Kata124.findLongest("The quick white fox jumped around the massive dog"));
    }

    @Test
    public void basicTest2() {
        // assertEquals("expected", "actual");
        assertEquals(10, Kata124.findLongest("Take me to tinseltown with you"));
    }

    @Test
    public void basicTest3() {
        // assertEquals("expected", "actual");
        assertEquals(7, Kata124.findLongest("Sausage chops"));
    }

    @Test
    public void basicTest4() {
        // assertEquals("expected", "actual");
        assertEquals(6, Kata124.findLongest("Wind your body and wiggle your belly"));
    }

    @Test
    public void basicTest5() {
        // assertEquals("expected", "actual");
        assertEquals(7, Kata124.findLongest("Lets all go on holiday"));
    }
}