import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FileServiceTest {

    @Test
    public void testFileReader() {
        FileService fileService = new FileService();
        String filePath = "src/test/resources/testfile.txt";
        String expectedText = "This is a test file.\nIt is used for unit testing.\n";

        String actualText = fileService.fileReader(filePath);

        assertEquals(expectedText, actualText);
    }

    @Test
    public void testFileSaver() {
        FileService fileService = new FileService();
        Map<String, Integer> wordCount = new HashMap<>();
        wordCount.put("test", 3);
        wordCount.put("file", 2);
        wordCount.put("unit", 1);

        fileService.fileSaver(wordCount);
    }
}
