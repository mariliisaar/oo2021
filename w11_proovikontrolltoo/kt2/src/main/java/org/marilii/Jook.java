package org.marilii;
public class Jook {
    private String nimetus;
    private double liitrihind;
    private double liitrikaal;

    public Jook(String nimetus, double liitrihind, double kaal) {
        this.nimetus = nimetus;
        this.liitrihind = liitrihind;
        this.liitrikaal = kaal;
    }

    public String getNimetus() {
        return this.nimetus;
    }

    public double getLiitrihind() {
        return this.liitrihind;
    }

    public double getKaal() {
        return this.liitrikaal;
    }
}
