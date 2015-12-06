/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java83a3;

/**
 *
 * @author wiemhjiri
 */
public class ClasseC implements interfaceA,interfaceB{

    @Override
    public void test() {
        System.out.println("test");
    }
    
    @Override
    public void affichage(){
        interfaceA.super.affichage();
       // interfaceB.super.affichage();
    }
   
}
