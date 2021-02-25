import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta tekst:");
        String text = scanner.nextLine().toLowerCase();
        Random r = new Random();
        StringBuilder sb = new StringBuilder(text.length());
        HashMap<Character, Integer> chars = new HashMap<Character, Integer>();

        for (int i = 0; i < text.length(); i++) {
            if (!chars.containsKey(text.charAt(i))) {
                chars.put(text.charAt(i), 1);
            } else {
                chars.put(text.charAt(i), chars.get(text.charAt(i)) + 1);
            }
        }

        System.out.println("Tekstis \"" + text +"\" esinevad järgmised tähed:");
        for (Character c : chars.keySet()) {
            if (Character.isLetter(c)) {
                if (Integer.valueOf(chars.get(c)) == 1) {
                    System.out.println("\"" + c + "\" - " + chars.get(c) + " kord.");
                }
                else {
                    System.out.println("\"" + c + "\" - " + chars.get(c) + " korda.");
                }
            }
        }

        for (char c : text.toCharArray()) {
            sb.append(r.nextBoolean() ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        
        System.out.println(sb);
    }
}
