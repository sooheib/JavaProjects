/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author wiemhjiri
 */
public class ManipulationPersonne implements Interface1<Personne>{
    
    @Override
    public void ajouter(Personne o) {
        System.out.println("ajouter");
    }

    @Override
    public void supprimer(Personne o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Personne o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int recherche() {
        System.out.println("testtttt");
        return 0;
    }
    
    public static void main(String[] args) {
       Interface1<Personne> p=new ManipulationPersonne();
       Personne p1=new Personne();
       p.ajouter(p1);
    }
    
}

