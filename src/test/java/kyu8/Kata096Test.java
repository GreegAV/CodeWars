package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata096Test {

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", Kata096.smash(new String[]{"Bilal", "Djaghout"}));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", Kata096.smash(new String[]{}));
    }

    @Test
    public void validateOneWord() {
        assertEquals("Bilal", Kata096.smash(new String[]{"Bilal"}));
    }

}
