package com.itFactory.problema1;

import com.itFactory.problema1.magazin.Electronice;
import com.itFactory.problema1.magazin.Imbracaminte;
import com.itFactory.problema1.magazin.IngrijirePersonala;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Va rog sa selectati o categorie de produs:");
        while (true) {
            System.out.println("Categoriile disponibile sunt:  " +
                    "\n1. Imbracaminte" +
                    "\n2. Ingrijire Personala" +
                    "\n3. Electronice");
            int select = scanner.nextInt();
            if (select == 1) {
                System.out.println("Selectati tipul de imbracaminte: " +
                        "\n1 - pantaloni" +
                        "\n2 - bluza" +
                        "\n3 - accesoriu");
                int optiune = scanner.nextInt();
                switch (optiune) {
                    case 1:
                        Imbracaminte obiectimbracaminte = new Imbracaminte("Blugi", 100, 10, "pantaloni");
                        double pretPantaloni = obiectimbracaminte.pretProdusFinal();
                        System.out.println("Pretul pantalonior este:" + pretPantaloni + "Ron");
                        break;
                    case 2:
                        Imbracaminte obiectimbracamite1 = new Imbracaminte("bluzaCuAnchior", 70, 20, "bluza");
                        double pretBluza = obiectimbracamite1.pretProdusFinal();
                        System.out.println("Pretul bluzei este: " + pretBluza + "Ron");
                        break;
                    case 3:
                        Imbracaminte obiectimbracamite2 = new Imbracaminte("margele", 30, 30, "accesoriu");
                        double pretAccesoriu = obiectimbracamite2.pretProdusFinal();
                        System.out.println("Pretul bluzei este: " + pretAccesoriu + "Ron");
                        break;
                    default:
                        System.out.println("Nu ati ales optiunea de imbrcaminte corespunzatoare");
                break;
                }
            } else if (select == 2) {
                System.out.println("Selecteaza daca produsul este returnabil: - prin ture / false");
                boolean produsReturnabil = scanner.nextBoolean();
                IngrijirePersonala obiectDeIngrijirePersonala = new IngrijirePersonala("Nivea", 50, 20, produsReturnabil);
                if (!produsReturnabil) {

                    System.out.println("Pretul produsului este: " + obiectDeIngrijirePersonala.pretProdusFinal());
                } else {
                    System.out.println("Pretul produsului este: " + obiectDeIngrijirePersonala.getPretProdus());
                }

            } else if (select == 3) {

                Electronice obiectElectronic = new Electronice("radio", 150, 0, 230);
                System.out.println("Introduceti valoarea voltajului pentru produsul electronic: ");
                int valoareVoltaj = scanner.nextInt();
                obiectElectronic.setValVoltaj(valoareVoltaj);

            } else {
                System.out.println("Nu ati selectat nici o optiune valida");
            }

        }
    }
}
