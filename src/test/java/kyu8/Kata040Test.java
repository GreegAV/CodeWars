package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata040Test {
    @Test
    public void testDna() throws Exception {
        Kata040 b = new Kata040();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() throws Exception {
        Kata040 b = new Kata040();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }
}