package com.itFactory.problema2abstracte.banca;

import com.itFactory.problema2abstracte.persoana.Persoana;

public class BancaPentruLocuinte  extends UnitateBancara{

    @Override
    public double calculCredit(Persoana persoana) {
        double credit = persoana.getSalariuNet() * 100;
        return credit;
    }

    @Override
    public double calculDobanda(Persoana persoana) {
        double dobanda = (calculCredit(persoana) * 5) / 100 ;
        return dobanda;
    }

}
