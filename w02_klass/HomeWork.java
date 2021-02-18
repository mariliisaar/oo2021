import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Sisesta esimese konto omaniku nimi");
        Account acct1 = new Account(checkName(obj.nextLine()));
        
        System.out.println(acct1.getHolder() + " konto");
        System.out.println(acct1);

        System.out.println("Kui palju " + acct1.getHolder() + " oma kontole kannab?");
        BigDecimal addition = makeDecimal(obj.nextLine());

        System.out.println(acct1.addBalance(addition));
        System.out.println(acct1);
        System.out.println("*****".repeat(5));

        System.out.println("Sisesta teise konto omaniku nimi");
        String acctName = checkName(obj.nextLine());

        System.out.println("Mis on " + acctName + " konto algne jääk?");
        BigDecimal sum = makeDecimal(obj.nextLine());

        Account acct2 = new Account(acctName, sum);
        
        System.out.println(acct2.getHolder() + " konto");
        System.out.println(acct2);

        System.out.println("Kui palju " + acct2.getHolder() + " oma kontolt raha välja võtab?");
        BigDecimal withdraw = makeDecimal(obj.nextLine());

        System.out.println(acct2.subtractBalance(withdraw));
        System.out.println(acct2);
        System.out.println("*****".repeat(5));
        System.out.println(acct1.getHolder() + " ja " + acct2.getHolder() + " kontodel on kokku " + acct1.getBalance().add(acct2.getBalance()) + "€");
    }

    public static boolean isLetters(String holder) {
        // ?U unicode support, p{L} letters, p{M} all marks, whitespace inside string
        Pattern p = Pattern.compile("(?U)[\\p{L}\\p{M}'-]+(?:\\s[\\p{L}\\p{M}'-]+)*", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(holder);
        boolean matches = m.find();
        if(matches) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isNumber(String s) {
        if (s == null) {
            return false;
        }
        try {
            BigDecimal d = new BigDecimal(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String checkName(String s) {
        Scanner userIn = new Scanner(System.in);
        while (!isLetters(s)) {
            System.out.println("Nimi võib sisaldada ainult tähti, proovi uuesti");
            s = userIn.nextLine();
        }
        return s;
    }

    public static BigDecimal makeDecimal(String s) {
        Scanner userIn = new Scanner(System.in);
        s = s.replace(",", ".");
        while (!isNumber(s)) {
            System.out.println("See ei ole number, proovi uuesti");
            s = userIn.nextLine();
        }
        BigDecimal d = new BigDecimal(s);
        return d;
    }
}
