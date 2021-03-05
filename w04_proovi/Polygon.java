import java.util.ArrayList;

public class Polygon {
    private ArrayList<Integer> x = new ArrayList<>();
    private ArrayList<Integer> y = new ArrayList<>();

    public Polygon(int x, int y, int x2, int y2, int x3, int y3) {
        this.x.add(x);
        this.y.add(y);
        this.x.add(x2);
        this.y.add(y2);
        this.x.add(x3);
        this.y.add(y3);
    }

    public ArrayList<Integer> getX() {
        return x;
    }

    public ArrayList<Integer> getY() {
        return y;
    }

    public ArrayList<Coordinate> getCoordinates() {
        ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
        for (int i = 0; i < this.x.size(); i++) {
            // Coordinate c = new Coordinate(this.x.get(i), this.y.get(i));
            coordinates.add(new Coordinate(this.x.get(i), this.y.get(i)));
            // put(this.x.get(i), this.y.get(i));
        }
        
        return coordinates;
    }

    public void addCoordinates(int x, int y) {
        this.x.add(x);
        this.y.add(y);
    }

    public double Circumference() {
        double circumference = 0;
        for (int i = 0; i < this.x.size(); i++) {
            
        }

        return circumference;
    }
}
