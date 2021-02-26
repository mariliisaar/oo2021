import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class OnlineRW{
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(new URL("http://www.tlu.ee/~ray/lengths.txt").openStream()));

        PrintWriter pw = new PrintWriter(new FileWriter("answer.txt"));

        String[] lineData = br.readLine().split(" ");

        System.out.println(sum(lineData));
        System.out.println(average(lineData));

        pw.println("Sum is " + sum(lineData));
        pw.println("Average is " + average(lineData));

        br.close();
        pw.close();
    }

    public static int sum(String[] input) {
        int sum = 0;
        for (String n : input) {
            sum += Integer.parseInt(n);
        }

        return sum;
    }

    public static double average(String[] input) {
        return sum(input) / input.length;
    }

}
