import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        hashSet();
    }

    public static void hashSet() {
        // Every item is UNIQUE and an OBJECT
        // Puudub sorteerimise võimalus
        int total = 0;

        HashSet<String> colours = new HashSet<String>();
        colours.add("purple");
        colours.add("teal");
        colours.add("green");
        colours.add("pink");
        colours.add("purple");
        colours.add("mauve");
        System.out.println(colours);

        System.out.println(colours.contains("pink"));
        colours.remove("green");

        System.out.println(colours);
        System.out.println(colours.size());
        colours.clear();
        System.out.println(colours.size());

        HashSet<Integer> nums = new HashSet<Integer>();

        nums.add(4);
        nums.add(14);
        nums.add(10);
        nums.add(4);
        nums.add(5);
        nums.add(4);
        nums.add(9);
        nums.add(10);
        nums.add(6);
        nums.add(4);
        nums.add(4);

        System.out.println(nums.size());

        for (Integer n : nums) {
            total = total + n;
        }

        System.out.println(total);
    }
}
