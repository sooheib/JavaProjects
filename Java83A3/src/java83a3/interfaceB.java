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
public interface interfaceB {
    void test();
    
    default void affichage(){
         System.out.println("test B");
     }
}
