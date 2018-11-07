import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Kata006Test {

    @Test
    public void testSomething1() {
        assertEquals(Kata006.check(new Object[] {66, 101}, 66), true);
    }

    @Test
    public void testSomething2() {
        assertEquals(Kata006.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
    }
    @Test
    public void testSomething3() {
        assertEquals(Kata006.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
    }
    @Test
    public void testSomething4() {
        assertEquals(Kata006.check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
    }

}