package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata173Test {
    @Test
    public void tests() {
        Player[] players = makePlayerArr(new String[] {"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"});
        assertEquals("a", Kata173.duckDuckGoose(players, 1));
        assertEquals("c", Kata173.duckDuckGoose(players, 3));
        assertEquals("z", Kata173.duckDuckGoose(players, 10));
        assertEquals("z", Kata173.duckDuckGoose(players, 20));
        assertEquals("z", Kata173.duckDuckGoose(players, 30));
        assertEquals("g", Kata173.duckDuckGoose(players, 18));
        assertEquals("g", Kata173.duckDuckGoose(players, 28));
        assertEquals("b", Kata173.duckDuckGoose(players, 12));
        assertEquals("b", Kata173.duckDuckGoose(players, 2));
        assertEquals("f", Kata173.duckDuckGoose(players, 7));
    }

    private Player[] makePlayerArr(String[] names) {
        Player[] players = new Player[names.length];
        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i]);
        }
        return players;
    }
}