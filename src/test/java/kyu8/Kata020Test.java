package kyu8;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.runners.JUnit4;

public class Kata020Test
{
    Kata020 basicOps = new Kata020();

    @Test
    public void testBasicsPlus()
    {
        assertThat(basicOps.basicMath("+", 4, 7), is(11));
    }
    @Test
    public void testBasicsMinus()
    {
        assertThat(basicOps.basicMath("-", 15, 18), is(-3));
    }
    @Test
    public void testBasicsMult()
    {
        assertThat(basicOps.basicMath("*", 5, 5), is(25));
    }
    @Test
    public void testBasicsDiv()
    {
        assertThat(basicOps.basicMath("/", 49, 7), is(7));
    }
}
