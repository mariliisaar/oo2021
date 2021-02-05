public class Second {
    public static void main(String[] args) {
        System.out.println(myName());
        System.out.println(add(5, 10));
        System.out.println(fullName("Marilii", "Saar"));
        System.out.println(checkEqual(5, 5));
        System.out.println(notEqual(4, 4));
        
        myMath();
        myLogical();
        areStringsEqual();
    }

    public static String myName() {
        return "Marilii";
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName + "!";
    }

    public static boolean checkEqual(int number1, int number2) {
        return number1 == number2;
    }

    public static boolean notEqual(int number1, int number2) {
        return number1 != number2;
    }

    public static void myMath() {
        System.out.println(Math.pow(5, 2));

        int number = (int)Math.pow(5, 2); // casting
        System.out.println(number);

        System.out.println(Math.sqrt(9));
    }

    public static void myLogical() {
        System.out.println(5 < 10 && 5 > 4);
        System.out.println(6 < 8 || 3 == 3);
    }

    public static void areStringsEqual() {
        String name1 = "Raimo";
        String name2 = "Raimo";

        System.out.println(name1 == name2);

        String newName1 = new String("Raimo");
        String newName2 = new String("Raimo");

        System.out.println(newName1 == newName2); // false => ei ole samad objektid

        System.out.println(newName1.equals(newName2)); // true => võrdleb väärtusi
    }
}
