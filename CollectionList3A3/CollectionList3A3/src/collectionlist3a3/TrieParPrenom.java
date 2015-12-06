/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlist3a3;

import java.util.Comparator;

/**
 *
 * @author wiemhjiri
 */
public class TrieParPrenom implements Comparator<Etudiant>{

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        return o1.getPrenom().compareTo(o2.getPrenom());
    }
    
}
