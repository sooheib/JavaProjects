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
public abstract class Employe {
    
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nb_heure;

    public Employe() {
        System.out.println("Création d'un Employe");
    }

    public Employe(int id, String nom, String adresse, int nb_heure) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heure = nb_heure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNb_heure() {
        return nb_heure;
    }

    public void setNb_heure(int nb_heure) {
        this.nb_heure = nb_heure;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nb_heure=" + nb_heure + '}';
    }
    
    public abstract float calculerSalaire();
    
    
}
