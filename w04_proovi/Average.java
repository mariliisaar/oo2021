import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Average {
    public static void main(String[] args) {
        double[] numbers = {75, 13, 1, 4, 87, 193, 66, 54, 13, 21, 47};
        System.out.println(average(3, 18, 9));
        System.out.println(slidingAvg(numbers));
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static ArrayList<BigDecimal> slidingAvg(double[] input) {
        ArrayList<BigDecimal> averages = new ArrayList<>(input.length - 2);
        for (int i = 0; i < input.length - 2; i++) {
            averages.add(new BigDecimal((input[i] + input[i + 1] + input[i + 2]) / 3).setScale(2, RoundingMode.HALF_UP));
        }
        return averages;
    }
}
