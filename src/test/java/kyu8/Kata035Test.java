package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata035Test {

    @Test
    public void testRemoval() {
        assertEquals("sdfghjkl", Kata035.remove("rsdfghjklb"));
    }

    @Test
    public void testRemoval1() {
        assertEquals("loquen", Kata035.remove("eloquent"));
    }

    @Test
    public void testRemoval2() {
        assertEquals("ountr", Kata035.remove("country"));
    }

    @Test
    public void testRemoval3() {
        assertEquals("erso", Kata035.remove("person"));
    }

    @Test
    public void testRemoval4() {
        assertEquals("lac", Kata035.remove("place"));
    }
}
