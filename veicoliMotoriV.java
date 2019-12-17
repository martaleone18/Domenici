package it.tss.garage;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tss
 */
public class veicoliMotoriV {

    protected String marca;
    protected int anno;
    protected int cilindrata;

    public veicoliMotoriV(String marca, int anno, int cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }
    
    @Override
    public String toString(){
        return String.format("veicolo %s, %s, %s", marca, anno, cilindrata);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.marca);
        hash = 73 * hash + this.anno;
        hash = 73 * hash + this.cilindrata;
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
        final veicoliMotoriV other = (veicoliMotoriV) obj;
        if (this.anno != other.anno) {
            return false;
        }
        if (this.cilindrata != other.cilindrata) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }

}
