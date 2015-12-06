/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlist3a3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author wiemhjiri
 */
public class CollectionList3A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        List<String> list=new ArrayList<>();
//        list.add("test");
//        list.add("a");
//        list.add("w");
//        
//        for (String s : list) {
//            System.out.println(s);
//        }
//        
//        Collections.sort(list);
//        for (String s : list) {
//            System.out.println(s);
//        }
//         Etudiant e1=new Etudiant(1, "test", "test");
//        Etudiant e2=new Etudiant(2, "test", "test");
//        EspritArrayList esprit=new EspritArrayList();
//        esprit.ajouterEtudiant(e2);
//        esprit.ajouterEtudiant(e1);
//        esprit.displayEtudiants();
//        esprit.trierEtudiantsParId();
//        esprit.displayEtudiants();
        
       Enseignant e1=new Enseignant(1, "sassi", "Ibrahim");
       Enseignant e2=new Enseignant(2, "nasri", "souha");
       Enseignant e3=new Enseignant(3, "Daoues", "Dhafer");
       Enseignant e4=new Enseignant(1, "sassi", "Ibrahim");
     //  GestionEnseignant gestion=new EspritHashSet();
       
       GestionEnseignant gestion=new EspritTreeSet();
       gestion.ajouterEnseignant(e1);
       gestion.ajouterEnseignant(e4);
       gestion.ajouterEnseignant(e2);
       gestion.ajouterEnseignant(e3);
       
       gestion.displayEnseignants();
       
//       Set<String> set=new TreeSet<>();
//       set.add("test");
//       set.add("a");
//       set.add("tea");
//        System.out.println(set);
       
       Employe e111 =new Employe(1,"test", "test", "test");
       Employe e222=new Employe(2,"test", "test", "test");
     
       //InterfaceSociete societe=new SocieteHashMap();
       InterfaceSociete societe=new SocieteTreeMap();
       societe.ajouterEmployeDepartement(e111, new Departement(1, "info"));
       societe.ajouterEmployeDepartement(e222, new Departement(1, "info"));
       societe.afficherLesEmployesLeursDepartements();
       
       
        
    }
    
}
