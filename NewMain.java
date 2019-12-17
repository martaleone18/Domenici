/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez.domenici;

/**
 *
 * @author tss
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cellphone a = new Cellphone("ciao", "32412");
        Cellphone b = new Cellphone("pippo", "erwrwe");
        Cellphone c = new Cellphone("pluto", "gdsfzfd");
        Cellphone.setCost(a.getGestore(), a.getGestore(), 0.5);
        Cellphone.setCost(a.getGestore(), b.getGestore(), 0.15);
        Cellphone.setCost(b.getGestore(), a.getGestore(), 0.25);
     
        System.out.println(a.getCost(b, 10));
        System.out.println(b.getCost(a, 8));
        System.out.println(a.getCost(c, 10));
        
    }
    }
    

