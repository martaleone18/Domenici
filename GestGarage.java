/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.garage;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class GestGarage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Garage garage = new Garage ();
        Auto auto = new Auto("fiat 500", 2004, 1200, 4, "Benzina");
        Moto moto = new Moto("Ducati", 2018, 1300, "due tempi");
        Furgone furgone = new Furgone("Doblò",2004,1000, 50);
garage.newVeicolo(moto);
garage.newVeicolo(auto);
garage.situazione();
garage.esci(2);
garage.esci(0);
garage.esci(3);
garage.newVeicolo(moto);
garage.newVeicolo(furgone);
garage.situazione();

    }

}

class Garage {

    private final veicoliMotoriV[] postiVeicoli;
    private veicoliMotoriV veicoliMotoriV;

    public Garage() {
        postiVeicoli = new veicoliMotoriV[15];
    }

    //inserire nel primo posto libero il veicolo in entrata
    //errore se non ci sono posti liberi
    public void newVeicolo(veicoliMotoriV v) {
        int postoLibero = cercaPostoLibero();
        if (postoLibero == -1) {
            throw new RuntimeException("Il garage è pieno!");
        }
        postiVeicoli[postoLibero] = v;
    }

//liberare il posto nell'array e ritornare il veicolo presente
    public veicoliMotoriV esci(int posto) {
        if (postiVeicoli == null) {
            throw new IllegalArgumentException("Il posto è vuoto");
        }
        postiVeicoli[posto] = null;
        return veicoliMotoriV;
    }

//stampa in console la situazione del garage
    public void situazione() {
        for (int i = 0; i < postiVeicoli.length; i++) {
            veicoliMotoriV v = postiVeicoli[i];
            System.out.println("--------- posto numero" + i + "--------");
            System.out.println(v == null ? "LIBERO" : v);
        }

    }

    private int cercaPostoLibero() {
        int ris = -1;
        for (int i = 0; i < postiVeicoli.length; i++) {
            if (postiVeicoli[i] == null) {
                ris = i;
                break;

            }
        }
        return ris;
    }

}
