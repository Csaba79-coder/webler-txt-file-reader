import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainTryCatchWithMethod {

    private static final String FILE_PATH = "books.txt"; // mindenhonnan az osztály bármely részéről el lehet érni (a privát miatt, ha ez public, akkor egész programban elérhető!)

    public static void main(String[] args) {

        final String FILE_PATH = "resources/books.txt"; // ez a filepath csak és kizárólag a psvm-en belül a metódus blokkjában érhető el!

        readFromFile(FILE_PATH);

        System.out.println("-----------------");

        readFromFile();
    }

    private static void readFromFile(String filePath) {
        BufferedReader reader = null;
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

    private static void readFromFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(FILE_PATH)); // ez  FILE_PATH a hibás!!!
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
