/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexionbd3a3;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wiemhjiri
 */
public class CRUD {
    
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    
    public void ajouterPersonne(String nom, String prenom) throws SQLException{
       pst=ConnexionBD3A3.cnx.prepareStatement("insert into personne (nom,prenom) values (?,?)");
       
       pst.setString(1, nom);
       pst.setString(2, prenom);
       
       pst.executeUpdate();
    }
    public void delete(int id){
        String sql="delete from personne where id="+id;
        try {
            st=ConnexionBD3A3.cnx.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBD3A3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void update(int id , String nom){
        String sql="update personne set nom='"+nom+"' where id="+id;
        try {
            st=ConnexionBD3A3.cnx.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBD3A3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void displayAll(){
        String sql="select * from personne";
        
        try {
            st=ConnexionBD3A3.cnx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            System.out.println(rs.getInt(1)+", "+rs.getString("nom"));
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   
}
