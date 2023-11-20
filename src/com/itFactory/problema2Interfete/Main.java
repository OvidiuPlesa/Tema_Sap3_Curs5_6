package com.itFactory.problema2Interfete;

import com.itFactory.problema2Interfete.banca.BancaPentruLocuinte;
import com.itFactory.problema2Interfete.banca.BancaPentruNevoiPersonale;
import com.itFactory.problema2Interfete.banca.UnitateBancara;
import com.itFactory.problema2Interfete.persoana.Persoana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UnitateBancara unitateBancara = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele: ");
        String nume = scanner.nextLine();

        System.out.println("Introduceti varsta: ");
        int varsta = scanner.nextInt();

        System.out.println("Introduceti cnp-ul: ");
        Long cnp = scanner.nextLong();

        System.out.println("Introduceti salariu Net: ");
        double salariuNet = scanner.nextDouble();

        Persoana persoana = new Persoana(nume, varsta, cnp, salariuNet);

        if(varsta < 18){
            System.out.println("Persoana nu este eligibila pentru un credit");
            System.exit(0);
        } else if (varsta >= 18 && varsta <= 40){
            unitateBancara = new BancaPentruLocuinte();
        } else {
            unitateBancara = new BancaPentruNevoiPersonale();
        }

        double credit = unitateBancara.calculCredit(persoana);
        double dobanda = unitateBancara.calculDobandaCretid(persoana);

        System.out.println("Limita maxima a creditului pentru: " + persoana.getNume() + " este de: " + credit + " RON.");
        System.out.println("Dobanda acordata pentru credit este in valoare de " + dobanda + ".");




//        Persoana persoana = new Persoana();
//        persoana.setCnp("18825697885441");
//        persoana.setNume("Gigel");
//        persoana.setVarsta(40);
//        persoana.setSalariuNet(10000);
//
//        UnitateBancara unitateBancara = new BancaPentruLocuinte();
//
//        double credit = unitateBancara.calculCredit(persoana);
//        double dobanda = unitateBancara.calculDobandaCretid(persoana);
//
//        System.out.println("Valoarea creditului pentru: " + persoana.getNume() + " este de: -> " + credit);
//        System.out.println("Valoarea dobanzi pentru: " + persoana.getNume() + " este de: -> " + dobanda);



    }
}
