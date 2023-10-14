import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BookDataProcessor {

    public static void main(String[] args) {
        String filePath = "resources/books_empty.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    // Process and print the non-empty line
                    System.out.println(line);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("-----");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    // Process and print the non-empty line
                    continue;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
