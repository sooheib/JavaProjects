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
public class Chat extends Animal{

    @Override
    public void create() {
        System.out.println("Chat!!");
    }
    
    public void sound(){
        System.out.println("Miauo!!!");
    }
    
    
}
