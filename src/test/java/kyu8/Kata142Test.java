package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata142Test {
    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals("Nope!", Kata142.areYouPlayingBanjo("Martin"), "Martin does not play banjo");
        assertEquals("Nope!", Kata142.areYouPlayingBanjo("Rikke"), "Rikke plays banjo");
    }
}