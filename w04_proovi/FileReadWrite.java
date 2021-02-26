import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * FileReadWrite
 */
public class FileReadWrite {
    public static void main(String[] args) throws IOException{
        File file = new File("dummy1.txt");
        File fileWrite = new File("out_dummy1.txt");
        // System.out.println(
        //     file.getName() + "\n" +
        //     file.isFile() + "\n" +
        //     file.isDirectory() + "\n" +
        //     file.isHidden() + "\n" +
        //     file.lastModified()
        // );

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            String[] lineData = line.split(",");

            System.out.println(lineData[0] + " | " + lineData[lineData.length - 1]);
            line = br.readLine();
        }

        fr.close();
        br.close();

        if (!fileWrite.exists()) {
            fileWrite.createNewFile();
        }

        PrintWriter pw = new PrintWriter(fileWrite);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line2 = scanner.nextLine();
            String[] lineData = line2.split(",");
            pw.println(
                "Number is " + lineData[0] +
                " and name is " + lineData[1] +
                " and lang is " + lineData[2] +
                " and year is " + lineData[3]
            );
        }

        scanner.close();
        pw.close();

        BufferedReader br2 = new BufferedReader(new FileReader("numbers.txt"));
        PrintWriter pw2 = new PrintWriter("out_numbers.txt");

        String numbers = br2.readLine();
        int sum = 0;

        while(numbers != null) {
            String[] numberData = numbers.split(",");

            for(String n : numberData) {
                sum += Integer.valueOf(n);
            }

            numbers = br2.readLine();
        }
        System.out.println(sum); 

        br2.close();
        pw2.close();
    }
}