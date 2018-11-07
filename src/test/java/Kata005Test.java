import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata005Test {
    @Test
    public void test1(){
        assertEquals("pere", Kata005.stringMerge("person","here", 'e'));
    }
    @Test
    public void test2(){
        assertEquals("apowiejouh", Kata005.stringMerge("apowiejfoiajsf","iwahfeijouh", 'j'));
    }
    @Test
    public void test3(){
        assertEquals("abcdefxxxyyyxyzz", Kata005.stringMerge("abcdefxxxyzz","abcxxxyyyxyzz", 'x'));
    }
}