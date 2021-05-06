package org.marilii;

public class App 
{
    public static void main( String[] args )
    {
        Jook jook = new Jook("vein", 19.50, 0.75);
        Joogipudel pudel = new Joogipudel(0.75, "veinipudel", .3, 1);
        Joogivaat vaat = new Joogivaat(10.00, 9.00);
        Kast kast = new Kast("veinikast", 1.6, 12);

        vaat.taidaKast(pudel, kast, jook);
        System.out.println("Villisime " + kast.getTaitumus() + " pudelit veini.");
        System.out.println("Kokku kaalub kast " + kast.getKastiMass() + " g.");
        System.out.println("Kastis sisalduv vein maksab " + kast.getKastiHind() + " €.");

        System.out.println("Oodatud tulemused: " + 
        (int)(9 / .75) + " pudelit, " +
        (1.6 + 12 * .3 + 12 * .75 * .75) + "g, " +
        (12 * 1 + 12 * .75 * 19.5) + "€.");
    }
}
