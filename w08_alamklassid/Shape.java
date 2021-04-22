public class Shape {
    public static void main(String[] args) throws IllegalTriangleException {
        Square square1 = new Square(4);
        Tetragon square2 = new Tetragon(4, 4, 4, 4, Math.sqrt(2) * 4, Math.sqrt(2) * 4);
        Square square3 = new Square(3);
        Tetragon tetragon = new Tetragon(4, 5, 6, 7, 8, 9);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Square: " + square1.getName());
        System.out.println("Square1: " + square1.getArea());
        System.out.println("Square1: " + square1.getPerimeter());
        System.out.println("Square: " + square3.getName());
        System.out.println("Square3: " + square3.getArea());
        System.out.println("Square3: " + square3.getPerimeter());
        System.out.println("Tetragon: " + square2.getName());
        System.out.println("Square2: " + square2.getArea());        
        System.out.println("Square2: " + square2.getPerimeter());
        System.out.println("Tetragon: " + tetragon.getName());
        System.out.println("Tetragon: " + tetragon.getArea());        
        System.out.println("Tetragon: " + tetragon.getPerimeter());
        System.out.println(triangle.getName());
        System.out.println("Triangle: " + triangle.getArea());        
        System.out.println("Triangle: " + triangle.getPerimeter());
    }
}
