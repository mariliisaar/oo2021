package org.marilii;

/**
 * Hello world!
 *
 */
public class App {
    public String name;
    private int age = 34;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    // varargs
    public int[] toArray(int ...args) {
        int length = args.length;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = args[i];
        }

        return arr;
    }

    public int getAge() {
        return age;
    }
}
