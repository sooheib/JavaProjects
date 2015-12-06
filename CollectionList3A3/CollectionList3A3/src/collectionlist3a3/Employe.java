/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlist3a3;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author sooheib
 */
public class Employe implements Comparator<Employe>, Comparable<Employe>{
    
    private int cin;
    private String matricule;
    private String prenom;
    private String nom;

    public Employe() {
    }

    public Employe(int cin, String matricule, String prenom, String nom) {
        this.cin = cin;
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.cin;
        hash = 83 * hash + Objects.hashCode(this.matricule);
        hash = 83 * hash + Objects.hashCode(this.prenom);
        hash = 83 * hash + Objects.hashCode(this.nom);
        return hash;
    }

    @Override
    public String toString() {
        return "Employe{" + "cin=" + cin + ", matricule=" + matricule + ", prenom=" + prenom + ", nom=" + nom + '}';
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
        final Employe other = (Employe) obj;
        if (this.cin != other.cin) {
            return false;
        }
        return true;
    }

    @Override
    public int compare(Employe o1, Employe o2) {
    return o1.getNom().compareTo(nom);
    }

    @Override
    public int compareTo(Employe o) {
    return this.matricule.compareTo(matricule);
    }
    
   
}
