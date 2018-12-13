package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata130Test {

    @Test
    public void exampleTest1() {
        assertEquals(5.65d, Kata130.fuelPrice(5, 1.23d), 0.001d);
    }

    @Test
    public void exampleTest2() {
        assertEquals(18.40d, Kata130.fuelPrice(8, 2.5d), 0.001d);
    }

    @Test
    public void exampleTest3() {
        assertEquals(27.50d, Kata130.fuelPrice(5, 5.6d), 0.001d);
    }
}