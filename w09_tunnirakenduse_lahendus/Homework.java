import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Homework {
    public static void main(String[] args) {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        List<Double> temps = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("temps.txt"));
            PrintWriter pw = new PrintWriter(new File("homework.txt"));
            while (scanner.hasNextLine()) {
                temps.add(Double.parseDouble(scanner.nextLine().split(",")[1]));
            }
            double[] tempArray = new double[temps.size()];
            for (int i = 0; i < temps.size(); i++) {
                tempArray[i] = temps.get(i);
            }
            Arrays.stream(tempArray).average().ifPresent(a -> pw.println("Aasta keskmisest temperatuurist olid soojemad " + temps.stream().filter(x -> x > a).count() + " kuud."));
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }    
    } 
}
