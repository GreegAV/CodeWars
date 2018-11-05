import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinWordsTest {
    @Test
    public void testOneWord() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
    }

    @Test
    public void testSentence(){
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }

}