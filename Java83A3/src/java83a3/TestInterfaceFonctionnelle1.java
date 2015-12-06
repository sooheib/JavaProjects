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
public class TestInterfaceFonctionnelle1 {
    
    
    public static void main(String[] args) {
        
       // display(s->System.out.print(s));
      
        //display(System.out::println);
        System.out.println( convertir(e->Integer.parseInt(e)));
    }
    
//    public static void display(InterfaceFonctionnelle1<String> inter){
//        
//        inter.afficher("TEST Interface");
//        
//    }
    
    public static Integer convertir(InterfaceFonctionnelle1<String,Integer> inter){
        return inter.afficher("4");
    }
    
    
}
