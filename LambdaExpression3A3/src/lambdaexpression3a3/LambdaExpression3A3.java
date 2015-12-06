/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpression3a3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author wiemhjiri
 */
public class LambdaExpression3A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Etudiant> etudiants=new ArrayList<>();
        
        etudiants.add(new Etudiant(1, "Sassi", 23));
        etudiants.add(new Etudiant(2, "Ghorbel", 21));
        etudiants.add(new Etudiant(3, "Kammoun", 18));
        
        //System.out.println(etudiants);
       // diplaySelonAge(etudiants);
        //displaySelonAge(etudiants, e -> e.getAge()>20);
      //displaySelonAge(etudiants, e->e.getAge()>20, e->System.out.println(e));
      //displaySelonAge(etudiants, e->e.getNom().startsWith("S"), e->System.out.println(e));
        //Affichage en utilisant les méthodes de réferences
      //  displaySelonAge(etudiants, e->e.getNom().startsWith("S"), System.out::println);
        //Création des instances avec l'interface Supplier
       etudiants.add(CreateEtudiant(()->new Etudiant(4, "taktak", 25)));
      //Création des instances avec l'interface Supplier via une méthode de référence
      // etudiants.add(CreateEtudiant(Etudiant::new));       
     // System.out.println(etudiants);
      //  System.out.println(Convertor(etudiants, e -> e.getNom()));
       
       //Trie avec la méthode Trier()
       // Trier(etudiants, (e1,e2)->e1.getNom().compareTo(e2.getNom()));
     
       //Trie directement avec Comparator
       Collections.sort(etudiants,(e1,e2)->e1.getNom().compareTo(e2.getNom()));
        System.out.println(etudiants);
        
    }
    
    //afficher les étudiants dont l'age>20 without java 8
    public static void diplaySelonAge(List<Etudiant> etudiants){
        for(Etudiant e:etudiants){
            if(e.getAge()>20)
                System.out.println(e);
        }
    }
    //afficher les étudiants dont l'age>20 avec Predicate
    public static void displaySelonAge(List<Etudiant> etudiants,Predicate<Etudiant> pre){
        for(Etudiant e:etudiants)
            if(pre.test(e)) System.out.println(e);
    }
    
    //afficher les étudiants dont l'age>20 avec Predicate et Consumer
    public static void displaySelonAge(List<Etudiant> etudiants,
            Predicate<Etudiant> pre,
            Consumer<Etudiant> cons){
        for(Etudiant e:etudiants)
            if(pre.test(e)) cons.accept(e);
    }
    
    //Créer un étudiant
    public static Etudiant CreateEtudiant(Supplier<Etudiant> supp){
        return supp.get();
    }
    
    //Retourner une liste de String
    public static List<String> Convertor(List<Etudiant> etudiants, Function<Etudiant,String> func){
        List<String> noms=new ArrayList<>();
        for(Etudiant e: etudiants)
            noms.add(func.apply(e));
        return noms;
        
    }
    
    //Trie Etudiant
    public static void Trier (List<Etudiant> etudiants, Comparator<Etudiant> comp){
        Collections.sort(etudiants, comp);
        
    }
}
