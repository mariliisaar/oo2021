public class Main {
    public static void main(String[] args) {
        Child child = new Child("Mari", "becoming a developer");
        child.favouriteHobbyIs("dancing");
        child.firstThingIDo();
        System.out.println(child.addThree(1, 2, 3));
        child.IDream();
        child.setAge(10);
        System.out.println(child.getAge());
    }
}
