public abstract class Polygon {
    private String name;
    private int sides;

    public Polygon(String name, int sides) {
        this.name = name;
        this.sides = sides;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int numberOfSides() {
        return sides;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    
}
