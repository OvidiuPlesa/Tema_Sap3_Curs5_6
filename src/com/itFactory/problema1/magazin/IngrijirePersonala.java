package com.itFactory.problema1.magazin;

import com.itFactory.problema1.Produs;

public class IngrijirePersonala extends Produs {

    private boolean returnareProdus;

    public IngrijirePersonala(String numeProdus, double pretProdus, double discountProdus, boolean returnareProdus) {
        super(numeProdus, pretProdus, discountProdus);
        this.returnareProdus = returnareProdus;
    }


}
