import java.util.Scanner;
/**
 * Kahendsüsteem
 * 
 * Teata, kas sisestatud neljakohaline arv koosneb vaid ühtedest ja nullidest.
 * Kui tingimus on tõene, väljasta selle kahendsüsteemi arvu väärtus
 * kümnendsüsteemis. Võrreldes eelmisega võib sisestatud kahendsüsteemi arv olla
 * kuni kümnekohaline. Eraldi kuvatase välja, millisele väärtusele iga "üks"
 * selles arvus vastab.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Sisesta nelja- kuni kümnekohaline kahendsüsteemi arv:");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        isBinary(number);        
        scanner.close();
    }
    
    public static void isBinary(String number) {
        if (number.length() >= 4 && number.length() <= 10) {
            if (number.matches("[01]+")) {
                System.out.println("Arv koosneb vaid ühtedest ja nullidest. \nKümnendsüsteemis on see: " + Integer.parseInt(number, 2));
                String sb = new StringBuilder(number).reverse().toString();
                char[] numArray = sb.toCharArray();
                System.out.print("Iga \"ühe\" väärtused on: ");

                for (int i = 0; i < numArray.length; i++) {
                    char c = numArray[i];
                    if (c == '1') {
                        System.out.print(Math.pow(2, i) + " ");
                    }
                }
            } else {
                System.out.println("See ei ole kahendsüsteemi arv");
            }
        } else {
            System.out.println("Palun sisesta nelja- kuni kümnekohaline arv!");
        }
    }
}