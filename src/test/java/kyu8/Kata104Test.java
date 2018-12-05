package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Kata104Test {

    @Test
    public void test1() {
        assertEquals(new Integer(2), Kata104.calculateTip(30d, "Poor"));
    }

    @Test
    public void test2() {
        assertEquals(new Integer(4), Kata104.calculateTip(20d, "Excellent"));
    }

    @Test
    public void test3() {
        assertNull(Kata104.calculateTip(20d, "hi"));
    }

    @Test
    public void test4() {
        assertEquals(new Integer(17), Kata104.calculateTip(107.65, "Great"));
    }
}