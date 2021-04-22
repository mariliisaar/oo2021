public class Rhombus extends Tetragon {
    private double a;
    private double diagonal1;
    private double diagonal2;

    public Rhombus(double a , double diagonal1, double diagonal2) {
        super(a, a, a, a, diagonal1, diagonal2);
        this.a = a;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double getArea() {
        return diagonal1 * diagonal2 / 2;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
    
}
