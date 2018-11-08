import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

public class Kata015Test {
    @Test
    public void testBoolToWord1() {
        assertEquals(Kata015.boolToWord(true), "Yes");
    }

    @Test
    public void testBoolToWord2() {
        assertEquals(Kata015.boolToWord(false), "No");
    }
}