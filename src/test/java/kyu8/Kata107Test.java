package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Kata107Test {

    @Test
    public void testSomeDots() {
        assertTrue("Sorry, try again :-(", "one-two-three".equals(Kata107.replaceDots("one.two.three")));
    }
}