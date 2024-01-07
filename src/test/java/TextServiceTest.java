import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextServiceTest {

    @Test
    public void testCountWord() {
        TextService textService = new TextService();
        String text = "This is a test text. This text will be used for testing word count.";

        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("this", 2);
        expectedWordCount.put("is", 1);
        expectedWordCount.put("a", 1);
        expectedWordCount.put("test", 1);
        expectedWordCount.put("text", 2);
        expectedWordCount.put("will", 1);
        expectedWordCount.put("be", 1);
        expectedWordCount.put("used", 1);
        expectedWordCount.put("for", 1);
        expectedWordCount.put("testing", 1);
        expectedWordCount.put("word", 1);
        expectedWordCount.put("count", 1);

        Map<String, Integer> actualWordCount = textService.countWord(text);

        assertEquals(expectedWordCount, actualWordCount);
    }
}
