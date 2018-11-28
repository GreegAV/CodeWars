package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Kata079Test {

    Kata079 u = new Kata079();

    @Test
    public void testSomething() {
        assertEquals("HELLO",u.MakeUpperCase("hello"));
    }
}