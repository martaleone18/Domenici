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
public class Auto extends veicoliMotoriV {

    protected int porte;
    protected String alimentazione;
    protected static String DIESEL = "Diesel";
      protected static String BENZINA = "Benzina";
  

    public Auto(String marca, int anno, int cilindrata, int porte, String alimentazione) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
        ValidateAlimentazione();
    }
    
     @Override
    public String toString(){
        return super.toString()+String.format(" Auto %s ",porte, alimentazione);
    }
private void ValidateAlimentazione() {
        if (!this.alimentazione.equals(DIESEL)
                && !this.alimentazione.equals(BENZINA)) {
            throw new IllegalArgumentException("Alimentazione non valida..");
        }
    }

}
