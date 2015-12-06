/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphisme3a3;

/**
 *
 * @author wiemhjiri
 */
public class Polymorphisme3A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a1=new Animal();
        
        System.out.println(a1.getClass());
        a1.create();
        
        Chat c1=new Chat();
        System.out.println(c1.getClass());
        c1.create();
        c1.sound();
        System.out.println("*****************");
//        a1=c1;
//        System.out.println(a1.getClass());
//        a1.create();
//        ((Chat)a1).sound();
             
        c1=(Chat)a1;
        
    }
    
}
