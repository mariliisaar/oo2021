package org.marilii;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AppTest 
{
    static App app;
    static Jook jook = new Jook("vesi", 1.00, 1.00);
    static Jook vein = new Jook("vein", 19.5, 0.75);
    static Joogipudel pudel = new Joogipudel(5.00, "tavaline", 0.2, 0.9, jook);
    static Joogipudel tyhipudel = new Joogipudel(5.00, "tavaline", 0.2, 0.9);
    static Joogivaat vaat = new Joogivaat(10, 10);
    

    // Tühja pudeli mass
    @Test
    public void testEmptyMass()
    {
        double mass = 0.2;
        assertEquals(mass, tyhipudel.getMass(), 0 );
    }

    // Joogiga täidetud pudeli mass
    @Test
    public void testFullMass() {
        double mass = 0.2 + 5.00 * 1.00;
        assertEquals(mass, pudel.getMass(), 0);
    }

    // Tühja pudeli hind
    @Test
    public void testEmptyPrice() {
        double price = 0.9;
        assertEquals(price, tyhipudel.getHind(), 0);
    }

    // Joogiga täidetud pudeli hind
    @Test
    public void testFullPrice() {
        double price = 0.9 + 5.00 * 1.00;
        assertEquals(price, pudel.getHind(), 0);
    }

    // Pudeli täitmine - pole piisavalt jooki
    @Test
    public void testFillBottleNot() {
        Joogivaat mini = new Joogivaat(0.5, 0.5);
        Joogipudel veinipudel = new Joogipudel(0.75, "veinipudel", 0.3, 1);
        assertFalse(veinipudel.taidaPudel(mini, vein));
    }

    // Pudeli täitmine
    @Test
    public void testFillBottleTrue() {
        Joogipudel veinipudel = new Joogipudel(0.75, "veinipudel", 0.3, 1);
        assertTrue(veinipudel.taidaPudel(vaat, vein));
    }

    // Mitu pudelit jooki saab villida
    @Test
    public void testMituSaabVillida() {
        double pudeleid = 10 / 0.75;
        Joogipudel veinipudel = new Joogipudel(0.75, "veinipudel", 0.3, 1);
        assertEquals(pudeleid, vaat.mituPudelitSaabVillida(veinipudel), 0);
    }

    // Joogi villimine
    @Test
    public void testJoogiVillimine() {
        int pudeleid = (int)(Math.floor(10 / 0.75));
        List<String> pudelid = new ArrayList<>();
        for (int i = 0; i < pudeleid; i++) {
            pudelid.add("0.75, veinipudel, " + (0.3 + 0.75 * 0.75) + ", " + (1 + 0.75 * 19.5));
        }
        Joogipudel veinipudel = new Joogipudel(0.75, "veinipudel", 0.3, 1);
        List<Joogipudel> tulemused = vaat.villiJook(veinipudel, vein);
        List<String> tulem = new ArrayList<>();
        for (Joogipudel t : tulemused) {
            tulem.add(t.getMaht() + ", " + t.getPudelityyp() + ", " + t.getMass() + ", " + t.getHind());
        }
        assertEquals(pudelid, tulem);
    }

    // Tühja kasti mass
    @Test
    public void testTyhjaKastiMass() {
        double mass = 1.6;
        Kast kast = new Kast("veinikast", 1.6, 12);
        assertEquals(mass, kast.getKastiMass(), 0);
    }

    // Täis kast tühjade pudelitega
    @Test
    public void testKastTyhadePudelitega() {
        double mass = 1.6 + 8 * 0.3;
        Kast kast = new Kast("veinikast", 1.6, 12);
        List<Joogipudel> veinipudel = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            veinipudel.add(new Joogipudel(0.75, "veinipudel", 0.3, 1));
        }
        kast.setTaitumus(veinipudel);
        assertEquals(mass, kast.getKastiMass(), 0);
    }

    // Täis kast täidetud pudelitega
    @Test
    public void testKastPudelitega() {
        double mass = 1.6 + 8 * 0.3 + 8 * 0.75 * 0.75; // kasti kaal: 1,6; 8 x pudeli kaal 0,3; 8 x pudeli mahutavus (0,75) x joogi kaal (0,75)
        Kast kast = new Kast("veinikast", 1.6, 12);
        List<Joogipudel> veinipudel = new ArrayList<>();
        Joogipudel yksPudel = new Joogipudel(0.75, "veinipudel", 0.3, 1);
        yksPudel.taidaPudel(vaat, vein);
        for (int i = 0; i < 8; i++) {
            veinipudel.add(yksPudel);
        }       
        kast.setTaitumus(veinipudel);
        assertEquals(mass, kast.getKastiMass(), 0);
    }

    // Täis kasti hind
    @Test
    public void testKastHind() {
        double hind = 8 * 1 + 8 * 0.75 * 19.5; // 8 x pudeli taara (1); 8 x pudeli mahutavus (0,75) x joogi hind (19,5)
        Kast kast = new Kast("veinikast", 1.6, 12);
        List<Joogipudel> veinipudel = new ArrayList<>();
        Joogipudel yksPudel = new Joogipudel(0.75, "veinipudel", 0.3, 1);
        yksPudel.taidaPudel(vaat, vein);
        for (int i = 0; i < 8; i++) {
            veinipudel.add(yksPudel);
        }            
        kast.setTaitumus(veinipudel);
        assertEquals(hind, kast.getKastiHind(), 0);
    }

    // Pudelid ei mahu kasti
    @Test
    public void testTooManyBottles() {
        int many = 13;
        Kast kast = new Kast("veinikast", 1.6, 12);
        assertFalse(kast.kasPudelidMahuvad(many));
    }

    // Pudelid mahuvad kasti
    @Test
    public void testBottlesFit() {
        int many = 12;
        Kast kast = new Kast("veinikast", 1.6, 12);
        assertTrue(kast.kasPudelidMahuvad(many));
    }
}
