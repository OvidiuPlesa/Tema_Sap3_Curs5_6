package com.itFactory.problema1.magazin;

import com.itFactory.problema1.Produs;

public class Imbracaminte extends Produs {

    private String tipImbracaminte;
    public Imbracaminte(String numeProdus, double pretProdus, double discountProdus, String tipImbracaminte) {
        super(numeProdus, pretProdus, discountProdus);
        this.tipImbracaminte = tipImbracaminte;
    }


}

