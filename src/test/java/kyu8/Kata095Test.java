package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Kata095Test {
    @Test
    public void testBasicTrue() {
        String n = "Your girlscout cookies are ready to ship. Your total comes to tree fiddy";
        System.out.println(n);
        assertTrue(Kata095.isLockNessMonster(n));
    }

    @Test
    public void testBasicTrue2() {
        String n = "I'm from Scottland. I moved here to be with my family sir. Please, $3.50 would go a long way to help me find them";
        System.out.println(n);
        assertTrue(Kata095.isLockNessMonster(n));
    }

    @Test
    public void testBasicFalse() {
        String n = "Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance.";
        System.out.println(n);
        assertFalse(Kata095.isLockNessMonster(n));
    }
}