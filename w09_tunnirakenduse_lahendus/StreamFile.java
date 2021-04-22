import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamFile {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("data_processed.txt"));

        Files.readAllLines(Paths.get("data.txt"))
        .stream()
        .map(e -> e.split(","))
        .filter(e -> Integer.parseInt(e[1]) >= 3)
        .map(e -> e[1] + " :: " + e[0])
        .forEach(pw::println);

        pw.close();
    }
}
