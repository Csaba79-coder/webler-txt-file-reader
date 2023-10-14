import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    // figyelem! ha van fejléc kezelni kell!!! -> első sort akkor nem szoktuk beolvasni, ha csak adatok kellenek és fejléc nem!
    // figyelem! ha van a file sorai között üres sor, akkor másképp is kezelhető a beolvasás while része!!!
    // extra szóköz elvétele trim() metódussal

    public static void main(String[] args) {

        // Define the file path
        // absolute and relative path

        String filePath = "books.txt"; // ezt most így hagyjuk, mert a resources könyvtárban van a file, és lássunk hibát is!

        // try with resources
        // nem kell ide finally, mert try with resources-t használunk

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
}
