public class Square extends Tetragon{
    private double a;

    public Square(double a) {
        super(a, a, a, a, Math.sqrt(2) * a, Math.sqrt(2) * a);
        this.a = a;
        this.setName("Ruut");
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
    
}
