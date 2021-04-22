public class Child extends Parent {

    public Child(String name, String dream) {
        super(name, dream);
    }

    @Override
    public void firstThingIDo() {
        super.firstThingIDo();
        System.out.println("I get up to mischief");
    }

    @Override
    public void howISpendMyEvenings() {
        System.out.println("I run around");
    }

    public int addThree(int a, int b, int c) {
        return super.addAB(a, b) + c;
    }

    public void IDream() {
        System.out.println("I dream of " + this.getDream());
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
}
