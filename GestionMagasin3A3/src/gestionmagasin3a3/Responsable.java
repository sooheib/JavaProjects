/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmagasin3a3;

/**
 *
 * @author wiemhjiri
 */
public class Responsable extends Employe{
     private int prime;

    public Responsable() {
    }

    public Responsable(int prime, int id, String nom, String adresse, int nb_heure) {
        super(id, nom, adresse, nb_heure);
        this.prime = prime;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return super.toString()+" Responsable{" + "prime=" + prime + '}';
    }
     

    
     @Override
    public float calculerSalaire() {
        float s=0;
        if(nb_heure>160)
            s=160*10+(nb_heure-160)*12+prime;
        else
            s=nb_heure*10+prime;
        
        return s;
    }
    
     
     
    
}
