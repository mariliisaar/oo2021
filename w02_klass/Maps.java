import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        hashMap();
    }

    public static void hashMap() {
        HashMap<String, String> capitals = new HashMap<String, String>();

        capitals.put("Estonia", "Tallinn");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Latvia", "Riga");
        capitals.put("Lithuania", "Vilnius");
        capitals.put("Finland", "Helsinki");

        System.out.println(capitals);
        System.out.println(capitals.get("Estonia"));
        System.out.println(capitals.size());

        for (String i : capitals.keySet()) {
            System.out.println(i);
        }

        for (String i : capitals.values()) {
            System.out.println(i);
        }
    }
}
