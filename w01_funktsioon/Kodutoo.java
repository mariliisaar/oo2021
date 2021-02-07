import java.util.Scanner;

public class Kodutoo {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        double a = Double.NaN;
        double b = Double.NaN;
        double c = Double.NaN;

        System.out.println("Sisesta esimese kaateti pikkus");
        String aIn = userIn.nextLine();
        a = makeDouble(aIn);

        System.out.println("Sisesta teise kaateti pikkus");
        String bIn = userIn.nextLine();
        b = makeDouble(bIn);

        System.out.println("Sisesta kolmanda kaateti pikkus");
        String cIn = userIn.nextLine();
        c = makeDouble(cIn);

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Tegemist on kolmnurgaga");
        } else {
            System.out.println("Selliste kaatetitega kolmnurka ei eksisteeri");
        }

    }

    public static boolean isNumber(String s) {
        if (s == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static double makeDouble(String s) {
        Scanner userIn = new Scanner(System.in);
        while (!isNumber(s)) {
            System.out.println("See ei ole number, proovi uuesti");
            s = userIn.nextLine();
        }
        double d = Double.parseDouble(s);
        return d;
    }
}
