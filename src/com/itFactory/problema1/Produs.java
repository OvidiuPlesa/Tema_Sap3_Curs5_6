package com.itFactory.problema1;

public class Produs {

    private String numeProdus;
    private double pretProdus;
    private double discountProdus;

    public Produs(String numeProdus, double pretProdus, double discountProdus){
        this.numeProdus = numeProdus;
        this.pretProdus = pretProdus;
        this.discountProdus = discountProdus;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public double getPretProdus() {
        return pretProdus;
    }

    public void setPretProdus(double pretProdus) {
        this.pretProdus = pretProdus;
    }

    public double getDiscountProdus() {
        return discountProdus;
    }
    public void setDiscountProdus(double discountProdus) {
        if (0 <= discountProdus && discountProdus <= 100){
        this.discountProdus = discountProdus;
        } else {
            System.out.println("Discount-ul nu se incadreaza intre 0 si 100");
        }
    }

    public double pretProdusFinal(){
        double pretProdusFinal = pretProdus - ((discountProdus/100)*pretProdus);
        return pretProdusFinal;
    }



}
