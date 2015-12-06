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
public class TestCalcul {
    
    public static void main(String[] args) {
        
        System.out.println(testCalculer((x,y)->x+y));
        
    }
    
    public static int testCalculer(Calcul c){
        return c.calculer(2, 3);
    }
    
}
