/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmagasin3a3;

import java.util.Date;

/**
 *
 * @author wiemhjiri
 */
public class Produit {
    
    protected int identifiant;
    protected String libelle;
    protected String marque;
    protected float prix;
    protected Date date_expiration;
    
    public float getPrix(){
        return this.prix;
    }
    
    public void setPrix(float prix){
        if(prix<0)
            this.prix=0;
        this.prix=prix;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Date getDate_expiration() {
        return date_expiration;
    }

    public void setDate_expiration(Date date_expiration) {
        this.date_expiration = date_expiration;
    }
    
    
    
    
    public Produit(){
        
    }
    
    public Produit(int identifiant, String libelle, String marque){
        this.identifiant=identifiant;
        this.libelle=libelle;
        this.marque=marque;
        
    }
    
    public Produit(int identifiant, String libelle, String marque,float prix){
        this.identifiant=identifiant;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
    }

    @Override
    public String toString() {
        return "id = "+identifiant+", libelle = "+libelle+""
                + ", la marque :"+marque+" le prix"+prix+" la date est = "+date_expiration;
    }
    
    public boolean comparer(Produit p){
        
        if(p.getIdentifiant()==this.identifiant && p.getLibelle().equals(this.libelle) && p.getPrix()==this.prix)
            return true;
        return false;
    }
    
    public static boolean comparer(Produit p1, Produit p2){
        if(p1.getIdentifiant()==p2.identifiant && p1.getLibelle().equals(p2.libelle) && p1.getPrix()==p2.prix)
            return true;
        return false;
        
    }
    
    public String determinerTypeProduit(){
        if(this instanceof ProduitFruit)
            return "Fruit";
        else if (this instanceof ProduitLegume)
            return "Legume";
        return null;
    }
    
    
}
