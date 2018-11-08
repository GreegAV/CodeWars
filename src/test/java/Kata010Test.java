import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class Kata010Test {
    @Test
    public void exampleTests() {
        assertEquals(96, Kata010.seatsInTheater(16, 11, 5, 3));
    }

    @Test
    public void exampleTests2() {
        assertEquals(0, Kata010.seatsInTheater(1, 1, 1, 1));
    }

    @Test
    public void exampleTests3() {
        assertEquals(18, Kata010.seatsInTheater(13, 6, 8, 3));
    }

    @Test
    public void exampleTests4() {
        assertEquals(99, Kata010.seatsInTheater(60, 100, 60, 1));
    }

    @Test
    public void exampleTests5() {
        assertEquals(0, Kata010.seatsInTheater(1000, 1000, 1000, 1000));
    }

}