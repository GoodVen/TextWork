import java.util.HashMap;
import java.util.Map;

public class TextService {
    public Map<String, Integer> countWord(String text) {

        String textR = text.replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] words = textR.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {

            String lowercaseWord = word.toLowerCase();

            if (wordCount.containsKey(lowercaseWord)) {
                wordCount.put(lowercaseWord, wordCount.get(lowercaseWord) + 1);
            } else {
                wordCount.put(lowercaseWord, 1);
            }

        }
        return wordCount;
    }
}
