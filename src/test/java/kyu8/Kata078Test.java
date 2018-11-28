package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Kata078Test {

    @Test
    public void one() {
        assertArrayEquals(new int[]{1, 15, 15}, Kata078.humanYearsCatYearsDogYears(1));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2, 24, 24}, Kata078.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10, 56, 64}, Kata078.humanYearsCatYearsDogYears(10));
    }

}