package com.itFactory.problema2Interfete.banca;

import com.itFactory.problema2Interfete.persoana.Persoana;

public class BancaPentruLocuinte implements UnitateBancara{

    @Override
    public double calculCredit(Persoana persoana) {
        double credit = persoana.getSalariuNet() * 100;
        return credit;
    }

    @Override
    public double calculDobandaCretid(Persoana persoana) {
        double dobanda = (calculCredit(persoana) * 5) / 100;
        return dobanda;
    }
}
