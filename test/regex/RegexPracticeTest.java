package regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexPracticeTest {
@Test
    public void matchesOne(){
    String pattern = "A";
    String text = "AAA";


        boolean result = RegexPractice.findMatch(text, pattern);

        assertTrue(result);
    }
}
