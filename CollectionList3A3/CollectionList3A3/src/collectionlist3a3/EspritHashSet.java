/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlist3a3;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author wiemhjiri
 */
public class EspritHashSet implements GestionEnseignant{
        
    Set<Enseignant> enseignants=new HashSet<>();
    
    @Override
    public void ajouterEnseignant(Enseignant e) {
       enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for(Enseignant e:enseignants)
            if(e.getId()==id) 
                return true;
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(enseignants);
    }
    
    
    
}
