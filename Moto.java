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
public class Moto extends veicoliMotoriV {

    protected String tempi;

    public Moto(String marca, int anno, int cilindrata, String tempi) {
        super(marca, anno, cilindrata);
        this.tempi = tempi;
    }
 @Override
    public String toString(){
        return super.toString()+ String.format(" Moto %s", tempi);
    }

}
