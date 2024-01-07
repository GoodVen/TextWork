import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class FileService {
    public String fileReader(String filePath) {

        StringBuilder text = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error of reading: " + e.getMessage());
        }
        String result = text.toString();


        return result;
    }
    public void fileSaver(Map<String, Integer> wordCount){

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        String filePath = "src/main/resources/result.csv";

        try (FileWriter csvWriter = new FileWriter(filePath)) {
            csvWriter.append("Word,Count\n");

            for (Map.Entry<String, Integer> entry : sortedList) {
                csvWriter.append(entry.getKey())
                        .append(",")
                        .append(String.valueOf(entry.getValue()))
                        .append("\n");
            }

            System.out.println("Saveing succesfull: " + filePath);
        } catch (IOException e) {
            System.err.println("Mistake with writing CSV file : " + e.getMessage());
        }
    }

}
