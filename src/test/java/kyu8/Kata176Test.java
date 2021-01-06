package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata176Test {

    @Test
    public void Test0() {
        assertEquals(0, Kata176.sum(new double[]{}), 1e-4);
    }

    @Test
    public void Test23() {
        assertEquals(-2.398, Kata176.sum(new double[]{-2.398}), 1e-4);
    }

    @Test
    public void Test6() {
        assertEquals(6, Kata176.sum(new double[]{1, 2, 3}), 1e-4);
    }

    @Test
    public void Test66() {
        assertEquals(6.6, Kata176.sum(new double[]{1.1, 2.2, 3.3}), 1e-4);
    }

    @Test
    public void Test92() {
        assertEquals(9.2, Kata176.sum(new double[]{1, 5.2, 4, 0, -1}), 1e-4);
    }

    @Test
    public void Test320() {
        assertEquals(320, Kata176.sum(new double[]{30, 89, 100, 101}), 1e-4);
    }
}