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
public class Caissier extends Employe{
    
    private int num_caisse;

    public int getNum_caisse() {
        return num_caisse;
    }

    public void setNum_caisse(int num_caisse) {
        this.num_caisse = num_caisse;
    }
    
    public Caissier(){
        System.out.println("Création d'un Caissier");
        
    }
    
    public Caissier(int id,String nom, String adresse, int nb_heure, int num_Caisse){
       super(id, nom, adresse, nb_heure);
        this.num_caisse=num_Caisse;    
    }

    @Override
    public String toString() {
        return super.toString()+" \n Caissier{" + "num_caisse=" + num_caisse + '}';
    }

   
    @Override
    public float calculerSalaire() {
        float s=0;
        if(nb_heure>180)
            s=180*5+(nb_heure-180)*5.75f;
        else
            s=nb_heure*5;
        return s;
    }
    
    

   
    
    
    
}
