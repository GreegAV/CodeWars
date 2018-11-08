import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Kata008Test {

    @Test
    public void testFixed1() {
        assertEquals("S.H", Kata008.abbrevName("Sam Harris"));
    }
    @Test
    public void testFixed2() {
        assertEquals("P.F", Kata008.abbrevName("Patrick Feenan"));
    }
    @Test
    public void testFixed3() {
        assertEquals("E.C", Kata008.abbrevName("Evan Cole"));
    }
    @Test
    public void testFixed4() {
        assertEquals("P.F", Kata008.abbrevName("P Favuzzi"));
    }
    @Test
    public void testFixed5() {
        assertEquals("D.M", Kata008.abbrevName("David Mendieta"));
    }
}