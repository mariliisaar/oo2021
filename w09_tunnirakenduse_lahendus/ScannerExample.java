import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Scanner scanner = null;

        /*try {
            scanner = new Scanner(new File("datax.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        } */

        try (Scanner scanner = new Scanner(new File("data.txt"));
        PrintWriter pw = new PrintWriter(new File("data_output.txt"))) {
            while (scanner.hasNextLine()) {
                pw.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
