import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EstonianID est = new EstonianID("48702240276");
        FinnishID fin = new FinnishID("230181-237J");
        Cat cat = new Cat("Miisu");
        Cow cow = new Cow("Maasu");
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(2.6);
        Rectangle r1 = new Rectangle(2, 2);
        Rectangle r2 = new Rectangle(3.8, 7.4);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(cow);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(r1);
        shapes.add(r2);

        System.out.println("Eesti ID:");
        System.out.println(est.getGender());
        System.out.println(est.getFullYear());
        System.out.println(est.getDOB());
        System.out.println(est.getAge());

        System.out.println("\nSoome ID:");
        System.out.println(fin.getGender());
        System.out.println(fin.getFullYear());
        System.out.println(fin.getDOB());
        System.out.println(fin.getAge());

        System.out.println("\nAnimals:");
        for (Animal a : animals) {
            System.out.println(a.speak());
            a.eat("wet food");
            a.beSneaky();
            a.attack("George");
            a.lookAround();
            a.defend();
            a.sleep();
            System.out.println();
        }

        System.out.println("\nShapes:");
        for (Shape s : shapes) {
            System.out.println(s.getType() + " measurements are: ");
            System.out.println(s.getMeasurements());
            System.out.println("Circumference: " + s.getCircumference());
            System.out.println("Area: " + s.getArea());
        }
    }
}
