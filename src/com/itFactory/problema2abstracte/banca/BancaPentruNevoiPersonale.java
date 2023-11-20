package com.itFactory.problema2abstracte.banca;

import com.itFactory.problema2abstracte.persoana.Persoana;

public class BancaPentruNevoiPersonale extends UnitateBancara {


    @Override
    public double calculCredit(Persoana persoana) {
        return 0;
    }

    @Override
    public double calculDobanda(Persoana persoana) {
        return 0;
    }
}
