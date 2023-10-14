import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainWithSplit {

    public static void main(String[] args) {
        String filePath = "resources/books.txt";

        List<String[]> result = new ArrayList<>();

        int lineCount = countLinesInFile(filePath); // ez megszámolja a txt file sorainak a számát!
        String[][] matrix = new String[lineCount][]; // -> 54 a sorok megszámolásával kijöhetett volna! :)

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");

                if (line.endsWith("*")) {
                    parts[parts.length - 1] = parts[parts.length - 1] + " raktáron";
                } else {
                    parts[parts.length - 1] = parts[parts.length - 1] + " nincs raktáron";
                }

                result.add(parts);
            }
        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }

        for (String[] row : result) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static int countLinesInFile(String filePath) {
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
        return lineCount;
    }
}
