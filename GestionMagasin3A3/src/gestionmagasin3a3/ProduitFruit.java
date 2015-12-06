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
public class ProduitFruit extends Produit implements Critere{
        
    private float quantite;
    private String saison;

    public ProduitFruit(float quantite, String saison, int identifiant, String libelle) {
        this.identifiant=identifiant;
        this.libelle=libelle;
        this.quantite = quantite;
        this.saison = saison;
    }
    
            
    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    @Override
    public String toString() {
        return identifiant+" "+libelle+ "ProduitFruit{" + "quantite=" + quantite + ", saison=" + saison + '}';
    }

    @Override
    public boolean estFrais(String saison) {
       if(this.saison.equals(saison))
           return true;
       return false;
    }
    
    
    
    
}
