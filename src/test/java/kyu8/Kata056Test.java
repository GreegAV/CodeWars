package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata056Test {

    @Test
    public void basicTest() throws Exception {
        Kata056 cockroach = new Kata056();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
    }

    @Test
    public void basicTests30() throws Exception {
        Kata056 cockroach = new Kata056();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
    }

    @Test
    public void basicTest0() throws Exception {
        Kata056 cockroach = new Kata056();
        assertEquals(0, cockroach.cockroachSpeed(0));
    }
}