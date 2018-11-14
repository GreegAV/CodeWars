package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class Kata032Test {
    @Test
    public void fixedTests() {
        // assertEquals("expected", "actual");
        assertEquals("Hi", Kata032.remove("Hi!", 1));
        assertEquals("Hi", Kata032.remove("Hi!", 100));
        assertEquals("Hi!!", Kata032.remove("Hi!!!", 1));
        assertEquals("Hi", Kata032.remove("Hi!!!", 100));
        assertEquals("Hi", Kata032.remove("!Hi", 1));
        assertEquals("Hi!", Kata032.remove("!Hi!", 1));
        assertEquals("Hi", Kata032.remove("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", Kata032.remove("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", Kata032.remove("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", Kata032.remove("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", Kata032.remove("!!!Hi !!hi!!! !hi", 100));
    }
}