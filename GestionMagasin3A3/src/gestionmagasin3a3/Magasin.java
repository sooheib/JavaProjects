/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmagasin3a3;

/**
 *
 * @author wiemhjiri
 */
public class Magasin {
    
    private int id;
    private String nom;
    private String adresse;
    public static final int CAPACITE=2;
    private int qte=0;
    public static int qte_totale=0;
    
    public static final int MAX_EMPS=20;
    private int posEmp=0;   
    private Employe[] emps=new Employe[MAX_EMPS];
    
    
    private Produit[] prods=new Produit[CAPACITE];

    public Magasin(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
    }

    public Magasin() {
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Produit[] getProds() {
        return prods;
    }

    public void setProds(Produit[] prods) {
        this.prods = prods;
    }
    
    
    public boolean ajouterProduit(Produit p) throws MagasinPleinException{
        
        if(!existe(p)){
            if(qte>=CAPACITE)
             throw new MagasinPleinException("Magasin Plein");
            prods[qte]=p;
            qte++;
            qte_totale++;
            return true;
        }
       return false;  
    }
    
    public boolean existe(Produit p){
        for (int i = 0; i < qte; i++) {
            if(prods[i].comparer(p))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
    String s1="";
    String s="";
    
        for (int i = 0; i < qte; i++) {
            s+=prods[i];
        }
        for (int i = 0; i < posEmp; i++) {
            s1+=emps[i];
        }
    return "id ="+id+", nom ="+nom+", adresse = "+adresse+" \n la liste des produits est ="+s+""
            + " \n la liste des employes est = \n"+s1;
    }
    
    public int chercherProduit(Produit p){
        int pos=-1;
        
        for (int i = 0; i < qte; i++) {
            if(prods[i].comparer(p))
                pos=i;
        }
        return pos;
    }
    
    public boolean supprimerProduit(Produit p){
        int pos=chercherProduit(p);
        if(pos!=-1 && pos!=CAPACITE-1){
            for (int i = pos; i < qte; i++) 
                prods[i]=prods[i+1];               
            
            qte--;
            qte_totale--;
            return true;
        }
        else if(pos==49){
            prods[pos]=null;
            qte--;
            qte_totale--;
            return true;
        }
        return false;
            
        
    }
    
    public void ajouterEmploye(Employe e){
        if(posEmp<MAX_EMPS){
            emps[posEmp]=e;
            posEmp++;
        }
        else System.out.println("Insertion Emp impossible!!");
         
    }
    
    public float calculerStock(){
        float stock=0;
        for (int i = 0; i < qte; i++) {
            if(prods[i].determinerTypeProduit().equals("Fruit"))
                stock+=((ProduitFruit)prods[i]).getQuantite();
        }
        return stock;
    }
    
    
    
}
