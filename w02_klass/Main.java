import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GameCharacter character1 = new GameCharacter("Juku", GameCharacterType.RANGER);

        System.out.println(
            character1.name +" " +
            character1.getSecret()
        );

        character1.setSecret("My new secret");

        System.out.println(character1.getSecret());

        GameCharacter character2 = new GameCharacter("Kati", GameCharacterType.WARRIOR);

        System.out.println(character1);
        System.out.println(character2);

        System.out.println(character1.getXY()[1]);
    }

    public static void human() {
        Human.sayHello();
        
        Human human1 = new Human();
        System.out.println(human1.legs + " " + human1.name);

        human1.legs = 5;
        human1.name = "Juku";
        System.out.println(human1.legs + " " + human1.name);

        Human human2 = new Human("Kati");

        System.out.println(human2.name);
        human2.legs = 10;

        System.out.println(human1.legs + " " + human2.legs);
    }

    public static void lists() {
        String[] stringArray = new String[5];
        int[] numberArray = new int[5];

        ArrayList<String> stringList = new ArrayList<>(); // Ctrl + . <-- importimiseks

        numberArray[0] = 5;

        stringList.add(0, "Hello");
        stringList.add("Yellow");
        stringList.add(1, "Orange");

        for (String entry : stringList) {
            System.out.println(entry);
        }

        System.out.println(stringList.get(1));
    }
}