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
public class Vendeur extends Employe{
    
    private int taux_vente;

    public Vendeur() {}
    

    public Vendeur(int taux_vente, int id, String nom, String adresse, int nb_heure) {
        super(id, nom, adresse, nb_heure);
        this.taux_vente = taux_vente;
    }

    public int getTaux_vente() {
        return taux_vente;
    }

    public void setTaux_vente(int taux_vente) {
        this.taux_vente = taux_vente;
    }

    @Override
    public String toString() {
        return super.toString()+" \n Vendeur{" + "taux_vente=" + taux_vente + '}';
    }
    
    @Override
    public float calculerSalaire(){        
        return 450*taux_vente;
    }
    
    
    
    
    
}
