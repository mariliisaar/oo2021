import java.text.DecimalFormat;
import java.util.ArrayList;

public class Rectangle implements Shape {
    private static DecimalFormat df = new DecimalFormat("0.00");
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getType() {
        String type = "rectangle";
        if (width == height) {
            type = "square";
        }
        return type;
    }

    @Override
    public double getArea() {
        return Double.parseDouble(df.format(width * height));
    }

    @Override
    public double getCircumference() {
        return Double.parseDouble(df.format(2 * width + 2 * height));
    }

    public ArrayList<Double> getMeasurements() {
        final ArrayList<Double> measurements = new ArrayList<>();
        measurements.add(width);
        measurements.add(height);
        return measurements;
    }    
}
