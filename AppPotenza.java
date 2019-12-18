/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.apppotenza;

/**
 *
 * @author tss
 */
public class AppPotenza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Potenza potenza = new Potenza(10);
        potenza.pow();
        potenza.cambiaBase(8);
        potenza.pow();
    }

}

class Potenza {

     int base;
    //private static final int POTENZA = 2; non obbligatorio

    public Potenza(int base) {
        this.base = base;
    }

    public void cambiaBase(int base) {
        
this.base=base;
    }

    public void pow() {
        System.out.println("potenza del 2: " + base * base);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.base;
        return hash;
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
        final Potenza other = (Potenza) obj;
        if (this.base != other.base) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "base: " + base;
    }
}
