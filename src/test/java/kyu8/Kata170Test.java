package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata170Test {
    @Test
    public void basicTests() {
        assertEquals(8, Kata170.move(0, 4));
        assertEquals(15, Kata170.move(3, 6));
        assertEquals(12, Kata170.move(2, 5));
    }

}