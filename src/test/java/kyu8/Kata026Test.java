package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

public class Kata026Test {

    @Test
    public void update_red() {
        assertEquals("green", Kata026.updateLight("red"));
    }

    @Test
    public void update_yellow() {
        assertEquals("red", Kata026.updateLight("yellow"));
    }

    @Test
    public void update_green() {
        assertEquals("yellow", Kata026.updateLight("green"));
    }
}