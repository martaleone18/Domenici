/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez.domenici;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Cellphone {

    private String gestore;
    private String numero;
    private static ArrayList<Tariffa> tariffario = new ArrayList<Tariffa>();

    public Cellphone(String gestore, String numero) {
        this.gestore = gestore;
        this.numero = numero;
    }

    public static void setCost(String gestore1, String gestore2, double costo) {
        Tariffa tariffa1 = new Tariffa(gestore1, gestore2, costo);
        tariffario.add(tariffa1);
    }

    public double getCost(Cellphone cellphone, int durata) {
        for (Tariffa t : tariffario) {
            if (t.getGestore1().equals(this.gestore) && t.getGestore2().equals(cellphone.gestore)) {
                return t.getCosto() * durata;
            }

        }
        throw new IllegalArgumentException("tariffario non disponibile");

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    public String getGestore() {
        return gestore;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cellphone other = (Cellphone) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
    

    public static ArrayList<Tariffa> getTariffario() {
        return tariffario;
    }

    public static void printArray() {
        String result = "";
        for (Tariffa element : tariffario) {
            result += element.toString() + "\n";
        }
        System.out.println(result);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Tariffa {

        private String gestore1;
        private String gestore2;
        private double costo;

        public Tariffa(String gestore1, String gestore2, double costo) {
            this.gestore1 = gestore1;
            this.gestore2 = gestore2;
            this.costo = costo;
        }

        public String getGestore1() {
            return gestore1;
        }

        public String getGestore2() {
            return gestore2;
        }

        public double getCosto() {
            return costo;
        }

    }

}
