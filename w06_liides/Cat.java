public class Cat implements Animal{
    private String name;
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String speak() {
        return "Meow!";
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " eats " + food + ".");        
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");        
    }

    @Override
    public void beSneaky() {
        System.out.println("A glass falls on the ground...");        
    }

    @Override
    public void lookAround() {
        System.out.println(name + " looks around");
    }

    @Override
    public void attack(String who) {
        System.out.println(name + " attacks " + who + ".");
    }

    @Override
    public void defend() {
        System.out.println(name + " defends itself.");
    }
    
}
