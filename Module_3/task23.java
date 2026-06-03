import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {

        try (Scanner reader = new Scanner(new File("output.txt"))) {

            System.out.println("Contents of output.txt:");

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}