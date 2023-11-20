package com.itFactory.problema2Interfete.banca;

import com.itFactory.problema2Interfete.persoana.Persoana;

public class BancaPentruNevoiPersonale implements UnitateBancara {


    @Override
    public double calculCredit(Persoana persoana) {
        double credit = persoana.getSalariuNet() * 10;
        return credit;
    }

    @Override
    public double calculDobandaCretid(Persoana persoana) {
        double dobanda = (calculCredit(persoana) * 8) / 100;
        return dobanda;
    }
}
