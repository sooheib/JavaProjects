/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlist3a3;

/**
 *
 * @author wiemhjiri
 */
public class Enseignant implements Comparable<Enseignant>{
    
    private int id;
    private String nom;
    private String prenom;

    public Enseignant() {
    }

    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Enseignant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    @Override
    public int hashCode() {
     
      return id*3;
    }

   

    @Override
    public boolean equals(Object obj) {
       // System.out.println("equals");
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Enseignant other = (Enseignant) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Enseignant o) {
        return this.id-o.id;
    }
    
            
}
