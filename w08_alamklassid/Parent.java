public abstract class Parent {
    private String name;
    private String dream;
    private int ab;
    public int age = 20;

    public Parent(String name, String dream) {
        this.name = name;
        this.dream = dream;
    }

    public void favouriteHobbyIs(String hobby) {
        System.out.println(this.name + "'s favourite hobby is " + hobby +".");
    }

    public void firstThingIDo() {
        System.out.println("I brush my teeth");
    }

    public abstract void howISpendMyEvenings();

    public int addAB(int a, int b) {
        ab = a + b;
        return ab;
    }

    public String getDream() {
        return dream;
    }
}