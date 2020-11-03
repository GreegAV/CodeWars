package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata155Test {
    @Test
    public void basicTests() {
        assertEquals(0, Kata155.goals(0, 0, 0));
        assertEquals(58, Kata155.goals(43, 10, 5));
    }

}