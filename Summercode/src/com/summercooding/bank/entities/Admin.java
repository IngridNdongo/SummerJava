/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.entities; 


import com.summercooding.bank.utils.Jdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ingrid
 */
public class Admin {
    int idadmin;
    String login;
    String password;
    String nom;
    
    
    
    
    public void save ( String login,
            String password,
            String nom) throws SQLException{
        
        
       
            String command = "INSERT INTO `admin` ( `login`, `password`, `nom`) VALUES (?, ?, ?)";
            PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);
            
            addstmt.setObject(1, login);
            addstmt.setObject(2, password);
            addstmt.setObject(3, nom);
            addstmt.execute ();
   
    }
      
    
    
      public void update(String login ,String password ,String nom,int idadmin)throws SQLException{
        
        
       
            String command =" UPDATE `admin` SET `login` = ? , `password` = ?, `nom` = ? WHERE `admin`.`idadmin` = ?";
            PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);
            
            addstmt.setObject(1, login);
            addstmt.setObject(2, password);
            addstmt.setObject(3, nom);
            addstmt.setObject(4, idadmin);
            addstmt.execute ();
   
    }
      
      
      
      
      
       public void delete( int idadmin)throws SQLException{
        
        
       
            String command ="DELETE FROM `admin` WHERE `admin`.`idadmin` = ?";
            PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);
            
            addstmt.setObject(1, idadmin);
            addstmt.execute ();
   
    }
    
    public Admin getOne(int idadmin) throws SQLException{
        String cmd = "select * from admin where idadmin = ?";
        PreparedStatement stmt
                =Jdbc.getconnexion().prepareStatement(cmd);
        stmt.setObject(1, idadmin);
        ResultSet rs=stmt.executeQuery();
        while (rs.next()){
             
            
            return new Admin (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
            
            
        }
        return null;
    }
    
     public Admin getByLoginAndPassword(String login,String password) throws SQLException{
        String cmd = "select * from admin where login = ? and password = ?";
        PreparedStatement stmt
                =Jdbc.getconnexion().prepareStatement(cmd);
        stmt.setObject(1, login);
        stmt.setObject(2, password);
        ResultSet rs=stmt.executeQuery();
        while (rs.next()){
             
            
            return new Admin (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
            
            
        }
        return null;
    }
    
      public List<Admin>getAllAdmin () throws SQLException{
        String cmd = "select * from admin";
        PreparedStatement stmt
                =Jdbc.getconnexion().prepareStatement(cmd);
        ResultSet rs=stmt.executeQuery(); 
        
        List <Admin>listAdmin = new ArrayList<>();
        while (rs.next()){
            listAdmin.add(new Admin (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
        }
        return listAdmin;
    }
     
    
    
    
    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public static void main (String arg []){    
        
    Admin admin = new Admin ();
        try {
        //admin.save("vanou", "van237", "ngongo");
        //  String result =admin.getOne(2).toString();
         // System.out.println(result);
         // result =admin.getByLoginAndPassword("ingrid","ingrid").toString();
         // System.out.println(result);
         // result =admin.getAllAdmin().toString();
         // System.out.println(result);
         // admin.update("ppp","xxx","ookkj",2);
         admin.delete(5);
                  
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "Admin{" + "idadmin=" + idadmin + ", login=" + login + ", password=" + password + ", nom=" + nom + '}';
    }
    

    public Admin() {
    }

    public Admin(int idadmin, String login, String password, String nom) {
        this.idadmin = idadmin;
        this.login = login;
        this.password = password;
        this.nom = nom;
    }
    
    
    
}