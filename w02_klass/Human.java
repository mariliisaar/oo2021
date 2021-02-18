public class Human {
    public int head = 1;
    public int eyes = 2;
    public int hands = 2;
    public int legs = 2;

    public String name = "";

    public Human() {
        System.out.println("Constructor");
    }

    public Human(String name) {
        this.name = name;
    }

    public static void sayHello() { // pole oluline luua new Human()
        System.out.println("Hello");
    }
}
