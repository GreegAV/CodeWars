package kyu6;

import kyu6.Kata004;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata004Test {
    @Test
    public void testOneWord() {
        assertEquals("emocleW", new Kata004().spinWords("Welcome"));
    }

    @Test
    public void testSentence() {
        assertEquals("Hey wollef sroirraw", new Kata004().spinWords("Hey fellow warriors"));
    }

}