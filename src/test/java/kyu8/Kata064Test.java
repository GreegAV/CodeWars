package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata064Test {

    @Test
    public void testX() {
        assertEquals("Congratulations! You're going to have a daughter.", Kata064.chromosomeCheck("XX"));
    }
    
    @Test
    public void testY() {
        assertEquals("Congratulations! You're going to have a son.", Kata064.chromosomeCheck("XY"));
    }
}