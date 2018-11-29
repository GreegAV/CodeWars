package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata084Test {
    @Test
    public void makingAdam() {
        Human[] paradise = Kata084.create();
        assertEquals("Adam are a man", true, paradise[0] instanceof Man);
    }
}