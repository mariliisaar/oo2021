public class First {
    public static void main(String[] args) {
        System.out.println(args.length);
        int[] numberArray = new int[5];
        int numberArray2[] = new int[5];

        String[] stringArray = new String[5];
        String[] greetingsArray = new String[]{"Hello", "world", "!"}; // algväärtustmisega

        String name = "Marilii";
        int year = 2021;

        // primitiivtüübid
        int myInt = Integer.MAX_VALUE;
        long myLong = Long.MAX_VALUE;
        byte myByte = Byte.MAX_VALUE; // -128 to 127
        short myShort = Short.MAX_VALUE;
        double myDouble = 3.4;
        float floatNumber = 3.4f;
        boolean flag = true; // false
        char character = 'F';

        // for tsükkel
        for (int i = 0; i < greetingsArray.length; i++) {
            System.out.println(greetingsArray[i]);
        }

        // foreach tsükkel
        for (String text : greetingsArray) {
            System.out.println(text);
        }

        // while tsükkel
        int length = greetingsArray.length;
        while (length > 0) {
            System.out.println("Inside while");
            length--;
        }

        if (year == 2021) {
            System.out.println(year + " is equal to 2021");
        } else if (year > 2021) {
            System.out.println(year + " is larger than 2021");
        } else {
            System.out.println(year + " is neither equal to nor larger than 2021");
        }

        System.out.println("Hello world!");
        System.out.print("\n");

        String hello = "Hello world!";
        System.out.print(hello);
    }
}