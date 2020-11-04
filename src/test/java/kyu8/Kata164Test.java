package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata164Test {
        @Test
        public void basicTests() {
            assertArrayEquals(new String[]{"Robin", "Singh"}, Kata164.stringToArray("Robin Singh"));
            assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Kata164.stringToArray("I love arrays they are my favorite"));
        }
    }