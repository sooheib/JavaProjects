/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpression3a3;

import java.util.Objects;

/**
 *
 * @author wiemhjiri
 */
public class Etudiant {
    
    private int id;
    private String nom;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Etudiant(int id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    public Etudiant() {
    }

    

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", age=" + age + '}';
    }

   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id;
        hash = 41 * hash + nom.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }
    
    
    
}
