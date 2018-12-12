package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata128Test {
    @Test
    public void Test_01() {
        assertEquals(4.66, Kata128.TwoDecimalPlaces(4.659725356), 0.00);
    }

    @Test
    public void Test_02() {
        assertEquals(173735326.38, Kata128.TwoDecimalPlaces(173735326.3783732637948948), 0.00);
    }
}