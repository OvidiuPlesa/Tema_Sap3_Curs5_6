package com.itFactory.problema1.magazin;

import com.itFactory.problema1.Produs;

public class Electronice extends Produs {

    private int valVoltaj;

    public Electronice(String numeProdus, double pretProdus, double discountProdus, int valVoltaj) {
        super(numeProdus, pretProdus, discountProdus);
        this.valVoltaj = valVoltaj;
    }

    public int getValVoltaj() {
        return valVoltaj;
    }

    public void setValVoltaj(int valVoltaj) {
        if ( 220 <= valVoltaj && valVoltaj <= 240 ) {
            this.valVoltaj = valVoltaj;
        } else {
            System.out.println("Aceasta valoare: " + valVoltaj + " - nu se incadreaza intre 220 si 240 de Volti confrorm UE ");
        }
    }
}
