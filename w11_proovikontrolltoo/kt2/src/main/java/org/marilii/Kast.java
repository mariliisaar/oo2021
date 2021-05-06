package org.marilii;

import java.util.List;

public class Kast {
    private String kastityyp;
    private double kastimass;
    private int pesasid;
    private int pudeleid = 0;
    private Joogipudel pudel;

    public Kast(String kastityyp, double kastimass, int pesasid) {
        this.kastityyp = kastityyp;
        this.kastimass = kastimass;
        this.pesasid = pesasid;
    }

    public String kastityyp() {
        return this.kastityyp;
    }

    public int getPesadeArv() {
        return this.pesasid;
    }

    public int getTaitumus() {
        return this.pudeleid;
    }

    public Boolean kasPudelidMahuvad(int pudeleid) {
        if (this.pesasid >= pudeleid) {
            return true;
        } else {
            return false;
        }
    }

    public void setTaitumus(List<Joogipudel> pudelid) {
        if (this.pesasid >= pudelid.size()) {
            this.pudeleid = pudelid.size();
            this.pudel = pudelid.get(0);
        }
    }

    public double getKastiMass() {
        if (this.pudeleid != 0) {
            return this.kastimass + this.pudeleid * this.pudel.getMass();
        } else {
            return this.kastimass;
        }
    }

    public double getKastiHind() {
        if (this.pudeleid != 0) {
            return this.pudeleid * this.pudel.getHind();
        } else {
            return 0;
        }
    }
}
