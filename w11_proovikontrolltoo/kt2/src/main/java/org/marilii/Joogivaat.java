package org.marilii;

import java.util.ArrayList;
import java.util.List;

public class Joogivaat {
    private double ruumala; // kuupmeetrites
    private double joogiMaht; // liitrites

    public Joogivaat(double ruumala, double joogiMaht) {
        this.ruumala = ruumala;
        this.joogiMaht = joogiMaht;
    }

    public double getRuumala() {
        return this.ruumala;
    }

    public double getJoogiMaht() {
        return this.joogiMaht;
    }

    public double mituPudelitSaabVillida(Joogipudel pudel) {
        return this.getJoogiMaht() / pudel.getMaht();
    }

    public List<Joogipudel> villiJook(Joogipudel pudel, Jook jook) {
        int pudelitearv = (int)(Math.floor(this.mituPudelitSaabVillida(pudel)));
        List<Joogipudel> pudelid = new ArrayList<>();
        for (int i = 0; i < pudelitearv; i++) {
            pudelid.add(new Joogipudel(0.75, "veinipudel", 0.3, 1, jook));
        }
        return pudelid;
    }

    public void taidaKast(Joogipudel pudel, Kast kast, Jook jook) {
        int pudelitearv = (int)(Math.floor(this.mituPudelitSaabVillida(pudel)));
        if (kast.kasPudelidMahuvad(pudelitearv)) {
            kast.setTaitumus(this.villiJook(pudel, jook));
        } else {
            System.out.println("Peab vist rohkem kaste tellima...");
        }
    }
}
