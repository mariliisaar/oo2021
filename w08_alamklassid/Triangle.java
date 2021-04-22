public class Triangle extends Polygon {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        super("Kolmnurk", 3);
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException(a, b, c);
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        } 
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public boolean checkIfTriangle() {
        if (a + b > c || a + c > b || b + c > a) {
            return true;
        } else {
            return false;
        }
    }
    
}
