public class Tetragon extends Polygon {
    private double a;
    private double b;
    private double c;
    private double d;
    private double diagonalE;
    private double diagonalF;

    public Tetragon(double a, double b, double c, double d, double diagonalE, double diagonalF) {
        super("Nelinurk", 4);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.diagonalE = diagonalE;
        this.diagonalF = diagonalF;
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        double area = Math.sqrt((p - a) * (p - b) * (p - c) * (p - d) - 1.0 / 4 * (a * c + b * d + diagonalE * diagonalF) * (a * c + b * d - diagonalE * diagonalF));
        return area;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }
    
}
