import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Lists {
    public static void main(String[] args) {
        vectors();
    }

    public static void vectors() {
        // Suurus muutub vastavalt vajadusele
        /* First, Vectors are synchronized which gives it an advantage over ArrayList as compared to multithreaded programs as there are risks of data corruption. 
           Secondly, Vectors have some legacy functions which can be implemented only on vectors and not on ArrayLists */
        // Another interesting point is that unlike arrays, vectors do not contain real objects, but only references to the objects. Hence, it allows objects of DIFFERENT DATA TYPES to be stored in the same vector.
        Vector<Integer> v1 = new Vector<Integer>();
        Vector<Integer> v2 = new Vector<Integer>(20);
        Vector<Integer> v3 = new Vector<Integer>(30, 10);
        Vector<Integer> v4 = new Vector<Integer>(v2);
        System.out.println(v1.capacity());
        System.out.println(v2.capacity());
        System.out.println(v3.capacity());
        System.out.println(v4.capacity());

        v2.add(199);
        v2.add(199);
        v2.add(199);

        Vector<Integer> v5 = new Vector<Integer>(v2);
        System.out.println("v5 capacity: " + v5.capacity());
        System.out.println("-----".repeat(5));

        Vector<Integer> v6 = new Vector<Integer>(3, 2);
        System.out.println("v6 capacity: " + v6.capacity());
        v6.add(20);
        v6.add(30);
        v6.add(40);
        System.out.println("v6 capacity: " + v6.capacity());
        v6.add(50);
        System.out.println("v6 capacity: " + v6.capacity());
        v6.trimToSize();
        System.out.println("v6 capacity: " + v6.capacity());
        System.out.println("*****".repeat(5));

        for (int i = 0; i < v6.size(); i++) {
            System.out.println(v6.get(i));
        }
        v6.add(1, 100);
        System.out.println("*****".repeat(5));

        for (int i = 0; i < v6.size(); i++) {
            System.out.println(v6.get(i));
        }

        System.out.println("Does v6 contain 50? " + v6.contains(50));
    }

    public static void linkedLists() {
        LinkedList<String> colours = new LinkedList<String>();

        colours.add("green");
        colours.add("purple");
        colours.add("teal");

        System.out.println(colours);

        // Olemas kõik ArrayList funktsioonid

        /* It is best to use an ArrayList when:
            You want to access random items frequently
            You only need to add or remove elements at the end of the list

        It is best to use a LinkedList when:
            You only use the list by looping through it instead of accessing random items
            You frequently need to add and remove items from the beginning, middle or end of the
            list */

        colours.addFirst("mauve");
        System.out.println(colours);

        colours.addLast("ochre");
        System.out.println(colours);

        System.out.println(colours.getFirst());
        System.out.println(colours.getLast());

        colours.removeLast();
        System.out.println(colours);

        colours.removeFirst();
        System.out.println(colours);
    }

    public static void arrayLists() {
        ArrayList<String> colours = new ArrayList<String>();

        colours.add("green");
        colours.add("purple");
        colours.add("teal");

        System.out.println(colours);
        System.out.println(colours.get(1));

        colours.set(2, "mauve");
        System.out.println(colours);
        colours.add("teal");

        colours.remove(0);
        System.out.println(colours);

        System.out.println("Listi suurus on: " + colours.size() + " elementi");

        for (int i = 0; i < colours.size(); i++) {
            System.out.println(colours.get(i));
        }

        System.out.println("---".repeat(5));

        for (String i : colours) {
            if (i.length() > 4) {
                System.out.println(i);
            }
        }

        Collections.sort(colours);
        System.out.println(colours);

        colours.clear();
        System.out.println(colours);
    }
}
