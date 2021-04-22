import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Classwork {
    public static void main(String[] args) {
        Scanner scanner;
        String nimi = null;
        Double a = 3.0;
        Double b = null;

        Logger logger = Logger.getLogger(Example.class.getName());
        FileHandler fh;
        SimpleFormatter sf = new SimpleFormatter();

        List<String> strings = Arrays.asList("koer", "kass", "kala", "küülik", "hobune", "kits");
        List<String> days = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        strings.forEach(x -> System.out.println(x));
        integers.forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("Max: " + Collections.max(integers));
        System.out.println("Min: " + Collections.min(integers));
        System.out.println("Arve kokku: " + integers.stream().count());
        System.out.println();
        List<String> shortDays = days.stream().map(e -> e.substring(0, 3)).collect(Collectors.toList());
        shortDays.forEach(d -> System.out.println(d));
        System.out.print("T-ga algavad päevad: ");
        shortDays.stream().filter(d -> d.substring(0, 1).toLowerCase().equals("t")).forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("InstStream");
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20).filter(e -> e % 2 == 0).forEach(e -> System.out.print(e + " "));
        System.out.println();
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20).filter(e -> e % 2 != 0).forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println(IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).allMatch(e -> e % 2 == 0));
        System.out.println(IntStream.of(2, 4, 6, 8, 10).allMatch(e -> e % 2 == 0));
        System.out.println(IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).anyMatch(e -> e % 2 == 0));

        try {
            fh = new FileHandler("newlog.txt");
            fh.setFormatter(sf);
            logger.addHandler(fh);
        } catch (Exception e) {
            System.out.println("I hope this doesn't happen");
        }

        try {
            scanner = new Scanner(new File("datax.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            logger.warning(e.getMessage());
        }

        try {
            System.out.println(nimi.length());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Double c = a + b;
            System.out.println(c);
        } catch(Exception e) {
            logger.severe(e.getMessage());
        }
    }
}
