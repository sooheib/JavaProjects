/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlist3a3;

import java.util.Collections;
import java.util.*;



/**
 *
 * @author wiemhjiri
 */
public class EspritVector implements University{
    
       List<Etudiant> list=new Vector<>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        list.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
       return list.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
//        for(int i=0;i<list.size();i++){
//            if(list.get(i).getNom().equals(nom))
//                return true;
//        }
//        return false;
        
        for(Etudiant e:list){
            if(e.getNom().equals(nom)) return true;
        }
        return false;
        
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        list.remove(e);
    }

    @Override
    public void displayEtudiants() {
       for(Etudiant e:list)
            System.out.println(e);
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(list);
    }

    @Override
    public void trierEtudiantsParNom() {
       Collections.sort(list, new TrieParNom());
    }
    
    public void trierEtudiantsParPrenom() {
       Collections.sort(list, new TrieParPrenom());
    }
    
}
