package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata093Test {

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Kata093.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Kata093.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Kata093.rps("paper", "rock"));
    }

    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Kata093.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Kata093.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Kata093.rps("rock", "paper"));
    }

    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Kata093.rps("scissors", "scissors"));
        assertEquals("Draw!", Kata093.rps("paper", "paper"));
        assertEquals("Draw!", Kata093.rps("rock", "rock"));
    }

}