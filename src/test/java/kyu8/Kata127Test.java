package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata127Test {
    @Test
    public void fixedTest1() {
        assertEquals(Kata127.buildString("Cheese", "Milk", "Chocolate"), "I like Cheese, Milk, Chocolate!");
    }

    @Test
    public void fixedTest2() {
        assertEquals(Kata127.buildString("Cheese", "Milk"), "I like Cheese, Milk!");
    }

    @Test
    public void fixedTest3() {
        assertEquals(Kata127.buildString("Chocolate"), "I like Chocolate!");
    }
}