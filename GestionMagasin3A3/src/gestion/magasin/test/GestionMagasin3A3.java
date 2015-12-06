/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.magasin.test;

import gestionmagasin3a3.*;
import gestionmagasin3a3.Magasin;
import gestionmagasin3a3.Produit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wiemhjiri
 */
public class GestionMagasin3A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produit p1=new Produit();
        p1.setIdentifiant(1);
        
        Produit p2=new Produit(3250, "t", "Sicam", 1.2f);
       // p2.setPrix(0.7f);
       
        Produit p3=new Produit(2510, "Yaourt", "Vitalait");
         p3.setPrix(0.9f);
        Produit p4=new Produit(3250, "Tomate", "Sicam", 1.2f);
        
        p4.setDate_expiration(new Date(2015, 05, 11));
       // System.out.println(p4);
        
        Magasin m1=new Magasin();
        m1.setId(1);
        m1.setNom("Carrefour");
        m1.setAdresse("Centre ville");
        
        Magasin m2=new Magasin(2, "Monoprix", "Menzeh 6");
        
//       m1.ajouterProduit(p4);
//       m1.ajouterProduit(p2);
//       m1.ajouterProduit(p1);
       // m2.ajouterProduit(p2);
//        System.out.println("la qte courante est "+m1.getQte()+""
//                + ", la qte totale est ="+Magasin.qte_totale);
//        
//        System.out.println("la qte courante est "+m2.getQte()+""
//                + ", la qte totale est ="+Magasin.qte_totale);
//        System.out.println(m1.chercherProduit(p4));
//        System.out.println(m1.chercherProduit(p2));
//        System.out.println(m1.supprimerProduit(p2));
//        System.out.println(Magasin.qte_totale);
       
       
       Caissier c1=new Caissier(1, "Rihab", "ariana", 20, 2);
       Caissier c2=new Caissier(2, "Ibrahim", "sousse", 3, 1);
       Responsable r1=new Responsable(200, 3, "Imen", "Chotrana", 30);
       Vendeur v1=new Vendeur(20, 4, "Firas", "LaMarsa", 43);
       
       m1.ajouterEmploye(c1);
        m1.ajouterEmploye(c2);
         m1.ajouterEmploye(r1);
          m1.ajouterEmploye(v1);
          
          
          //System.out.println(m1);
          
          ProduitFruit pr1=new ProduitFruit(12.3f, "MArs", 1254, "Fraise");
          ProduitFruit pr2=new ProduitFruit(50, "JUIN", 1224, "Pastéque");
          ProduitLegume pl1=new ProduitLegume(14, "Janvier", 8521, "Artichaud");
        
          
        try {
            m1.ajouterProduit(pr1);
             m1.ajouterProduit(pr2);
          m1.ajouterProduit(pl1);
        } catch (MagasinPleinException ex) {
           // Logger.getLogger(GestionMagasin3A3.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
         
          
          System.out.println(m1.calculerStock());
       
       
       
        
    }
    
}
