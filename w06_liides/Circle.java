import java.text.DecimalFormat;
import java.util.ArrayList;

public class Circle implements Shape {
    private static DecimalFormat df = new DecimalFormat("0.00");
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getType() {
        return "circle";
    }

    @Override
    public double getArea() {
        return Double.parseDouble(df.format(Math.PI * Math.pow(radius, 2)));
    }

    @Override
    public double getCircumference() {
        return Double.parseDouble(df.format(2 * Math.PI * radius));
    }

    @Override
    public ArrayList<Double> getMeasurements() {
        final ArrayList<Double> measurements = new ArrayList<>();
        measurements.add(radius);
        return measurements;
    }
    
}
