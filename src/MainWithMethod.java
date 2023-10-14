import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainWithMethod {

    private final static String FILE_PATH = "resources/books.txt";

    public static void main(String[] args) {
        readFromFile(FILE_PATH);
        System.out.println("-----------------");
        readFromFile();
        System.out.println("-----------------");
        try {
            readLinesFromFile(FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.println("-----------------");
        try {
            readLinesFromFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Print each line as it is without modification
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Print each line as it is without modification
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void readLinesFromFile(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Print each line as it is without modification
                System.out.println(line);
            }
        }
    }

    private static void readLinesFromFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Print each line as it is without modification
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
