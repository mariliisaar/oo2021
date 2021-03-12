public class Cow implements Animal{
    private String name;
    public Cow(String name) {
        this.name = name;
    }

    @Override
    public String speak() {
        return "Moo!";
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " eats grass.");        
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");        
    }

    @Override
    public void beSneaky() {
        System.out.println(name + " tries to be sneaky - you hear a cowbell ding loudly.");        
    }

    @Override
    public void lookAround() {
        System.out.println(name + " looks around. " + speak());
    }

    @Override
    public void attack(String who) {
        System.out.println(name + " is peaceful and refuses to attack " + who + ".");
    }

    @Override
    public void defend() {
        System.out.println(name + " defends everyone.");
    }
    
}
