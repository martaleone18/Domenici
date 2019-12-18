/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.appgestionecc;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class GestioneCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //try{
        CC cc = new CC();
        cc.versamento(100);
        cc.versamento(20);
        cc.ultimiMovimenti();
        cc.prelievo(15);
        cc.prelievo(40);
        cc.versamento(80);
        //cc.prelievo(300); errore
        cc.prelievo(50);
        cc.prelievo(25);
        cc.ultimiMovimenti();
        cc.versamento(200);
        cc.versamento(20);
        cc.prelievo(55);
        cc.versamento(20);
        cc.ultimiMovimenti();
        //}catch (Exception ex){
        //System.out.println ("qualcosa è andato storto")
    }

}

class CC {

    private ArrayList<Double> movimenti;
    private double saldo;

    public CC() {
        saldo = 0;
        movimenti = new ArrayList<>(5);
    }
    //solo return perchè itorna solo il saldo al quale si va ad aggiungere 
    // di volta in volta il versamento o il prelievo aggiunto
    public double getSaldo() {
        return saldo;
    }

    public void prelievo(int somma) {
        checkPrelievo(somma);
        saldo -= somma;
        storicizza(-somma);
    }

    public void versamento(double somma) {
        checkVersamento(somma);
        saldo += somma;
        storicizza(somma);
    }

    public void ultimiMovimenti() {
        System.out.println("Saldo:" + saldo);
        System.out.println(movimenti);
    }

//inserire il nuovo movimento in movimenti-fare report
    private void storicizza(double somma) {
        if (movimenti.size() < 5) {
            movimenti.add(somma);
        } else {
            movimenti.remove(0);
            movimenti.add(somma);
        }
    }
//da errore nel caso di somma non disponibile o tentativo di prelievo maggiore alla somma disponibile
    private void checkPrelievo(int somma) {
        if (somma <= 0) {
            throw new IllegalArgumentException("somma versamento non valida: " + somma);
        }
        if (saldo < somma) {
            throw new IllegalArgumentException("somma prelievo non disponibile: " + somma);
        }
    }
// da errore nel caso si versi una somma non esistente
    private void checkVersamento(double somma) {
        if (somma <= 0) {
            throw new IllegalArgumentException("somma versamento non valida: " + somma);
        }
    }
}
