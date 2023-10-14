import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainWithSplitMethod {

    public static void main(String[] args) {
        String filePath = "resources/books.txt";
        List<String[]> result = readFromFile(filePath);
        printResult(result);
    }

    public static List<String[]> readFromFile(String filePath) {
        List<String[]> temp = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = modifyLines(line);
                temp.add(parts);
            }
        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
        return temp;
    }

    // .slit() method szétszedi a regex mentén!
    // .trim() method eltávolítja a felesleges szóközöket!

    public static String[] modifyLines(String line) {
        String[] parts = line.split(";");
        if (line.endsWith("*")) {
            parts[parts.length - 1] = parts[parts.length - 1] + " raktáron";
        } else {
            parts[parts.length - 1] = parts[parts.length - 1] + " nincs raktáron";
        }
        return parts;
    }

    public static void printResult(List<String[]> result) {
        for (String[] row : result) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
