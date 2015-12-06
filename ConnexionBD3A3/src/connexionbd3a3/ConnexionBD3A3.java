/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexionbd3a3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wiemhjiri
 */
public class ConnexionBD3A3 {

    /**
     * @param args the command line arguments
     */
    static String password="root";
    static String login="root";
    static String url="jdbc:mysql://127.0.0.1:3306/esprit";
    
    static Connection cnx;
    
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            cnx=DriverManager.getConnection(url, login, password);
            CRUD crud=new CRUD();
           crud.ajouterPersonne("Taktak", "AbdelHafidh");
            //crud.delete(9);
           // crud.update(10, "Haskim");
           // crud.displayAll();
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBD3A3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        
        
    
    
}
