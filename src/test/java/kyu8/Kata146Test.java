package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata146Test {
    @Test
    public void setAlarmTest() {
        assertTrue("Should be true.", Kata146.setAlarm(true, false));
        assertFalse("Should be false.", Kata146.setAlarm(true, true));
        assertFalse("Should be false.", Kata146.setAlarm(false, false));
        assertFalse("Should be false.", Kata146.setAlarm(false, true));
    }
}