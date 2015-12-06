/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlist3a3;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author sooheib
 */
public class SocieteHashMap implements InterfaceSociete{
    
    Map<Employe, Departement> maps=new HashMap<>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
     maps.put(e, d);

    }

    @Override
    public void supprimerEmploye(Employe e) {
       maps.remove(e);
        
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> en : maps.entrySet()) {
            System.out.println(en.getKey()+"**"+en.getValue());
        }

    }

    @Override
    public void afficherLesEmployes() {
        System.out.println(maps.keySet());
    }

    @Override
    public void afficherLesDepartements() {
        System.out.println(maps.values()); 
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(maps.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
    return maps.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
    return maps.containsValue(e);
    }
    
}
