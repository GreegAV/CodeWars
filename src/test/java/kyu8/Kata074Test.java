package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata074Test {

    private static final double delta = 0.0001;

    @Test
    public void example4() {
        assertEquals(4, Kata074.getVolumeOfCuboid(1, 2, 2), delta);
    }

    @Test
    public void example63() {
        assertEquals(63, Kata074.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}
