package org.marilii;
public class Joogipudel {
    private double maht; // liitrites
    private String pudelityyp;
    private double mass;
    private double taaraMaksumus;
    private Jook jook;

    public Joogipudel(double maht, String pudelityyp, double mass, double taara) {
        this.maht = maht;
        this.pudelityyp = pudelityyp;
        this.mass = mass;
        this.taaraMaksumus = taara;
    }

    public Joogipudel(double maht, String pudelityyp, double mass, double taara, Jook jook) {
        this.maht = maht;
        this.pudelityyp = pudelityyp;
        this.mass = mass;
        this.taaraMaksumus = taara;
        this.jook = jook;
    }

    public String getPudelityyp() {
        return this.pudelityyp;
    }

    public double getMaht() {
        return this.maht;
    }

    public void taidaPudel(Jook jook) {
            this.jook = jook;
    }

    public Boolean taidaPudel(Joogivaat vaat, Jook jook) {
        if (vaat.getJoogiMaht() >= this.getMaht() && this.jook == null) {
            this.jook = jook;
            return true;
        } else {
            return false;
        }
    }

    public double getMass() {
        if (this.jook != null) {
            return this.mass + this.maht * this.jook.getKaal();
        } else {
            return this.mass;
        }        
    }

    public double getHind() {
        if (this.jook != null) {
            return this.maht * this.jook.getLiitrihind() + this.taaraMaksumus;
        } else {
            return this.taaraMaksumus;
        }
    }
}
