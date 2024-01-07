import java.util.Map;

public class TextWork {
    public static void main(String[] args) {
        String filePath = "src/main/resources/test.txt";
 FileService reader = new FileService();
 TextService count = new TextService();
  String text = reader.fileReader(filePath);
  Map res = count.countWord(text);
  reader.fileSaver(res);
    }
}
