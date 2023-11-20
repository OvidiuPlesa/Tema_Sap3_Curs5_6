package com.itFactory.problema2abstracte.persoana;

public class Persoana {

    private String nume;
    private int varsta;
    private Long cnp;
    private double salariuNet;

    public Persoana(String nume, int varsta, Long cnp, double salariuNet) {
        this.nume = nume;
        this.varsta = varsta;
        this.cnp = cnp;
        this.salariuNet = salariuNet;
    }

    public Persoana() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Long getCnp() {
        return cnp;
    }

    public void setCnp(Long cnp) {
        this.cnp = cnp;
    }

    public double getSalariuNet() {
        return salariuNet;
    }

    public void setSalariuNet(double salariuNet) {
        this.salariuNet = salariuNet;
    }
}
