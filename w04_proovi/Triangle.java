public class Triangle {
    public static void main(String[] args) {
        Polygon triangle1 = new Polygon(10, 10, 13, 16, 7, 5);
        Polygon triangle2 = new Polygon(12, 17, 6, 6, 15, 15);

        System.out.println(triangle1.getX());
        System.out.println(triangle2.getY());

        triangle1.addCoordinates(5, 17);
        triangle1.addCoordinates(5, 7);
        System.out.println(triangle1.getCoordinates());
        System.out.println(triangle1.getX());
        System.out.println(triangle1.getY());
    }
}
