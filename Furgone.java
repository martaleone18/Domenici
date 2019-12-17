/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.garage;

/**
 *
 * @author tss
 */
public class Furgone extends veicoliMotoriV {

    protected int capacità;

    public Furgone(String marca, int anno, int cilindrata, int capacità) {
        super(marca, anno, cilindrata);
        this.capacità = capacità;
    }
 @Override
    public String toString(){
               return super.toString()+ String.format(" Furgone %s", capacità);
    }

}
