import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three");
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Character> characters = Arrays.asList('a', 'b', 'c');
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);

        List<String> emptyStrings = new ArrayList<>();

        System.out.println(
            Generics.getFirst(strings) + " " +
            Generics.getFirst(integers) + " " +
            Generics.getFirst(characters) + " " +
            Generics.getFirst(doubles) + " " +
            Generics.getFirst(emptyStrings)
        );

        Generics.printList(strings);
        System.out.println("Sum of integers is " + Generics.sumOfList(integers));

        Generics.lowerBound(integers);

        // List<Long> longList = new ArrayList<>();
        // longList.add(10L);
        // Generics.lowerBound(longList);

        SimplePair<Integer, String> pair = new SimplePair<>(5, "Raimo");
        System.out.println(pair.getKey() + " " + pair.getValue());

        SimplePair<Integer, SimplePair<Integer, String>> pair2 = new SimplePair<>(1, new SimplePair<>(2, "Nested"));
        System.out.println(pair2.getKey() + "\n\t" + pair2.getValue().getKey() + ": " + pair2.getValue().getValue());

        System.out.println(Generics.getType(1) + " " + Generics.getType("raimo") + " " + 
            Generics.getType(1.0) + " " + Generics.getType(10L) + " " + Generics.getType(strings) +
            " " + Generics.getType(integers) + " " + Generics.getType('A') + " " +
            Generics.getType(pair) + " " + Generics.getType(pair2) + " " + Generics.getType(true));
        
        String[] stringArray = { "Hello", "world", "this", "is", "generics" };
        Integer[] integerArray = { 1, 2, 3, 4, 5 };

        Generics.printArray(stringArray);
        Generics.printArray(integerArray);

        SimpleGenerics<String> sg = new SimpleGenerics<>();
        sg.set("Raimo");
        System.out.println(sg.get());
        System.out.println(sg.getType());

        SimpleGenerics<Integer> in = new SimpleGenerics<>();
        in.set(5);
        System.out.println(in.get());
        System.out.println(in.getType());
    }
}