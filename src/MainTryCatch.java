import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainTryCatch {

    public static void main(String[] args) {

        String filePath = "resources/books.txt";

        BufferedReader reader = null;

        // hagyományos try catch finally megoldás

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found! " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file " + e.getMessage());
                }
            }
        }
    }
}
