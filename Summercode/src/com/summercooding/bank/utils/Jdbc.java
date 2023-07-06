/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ingrid
 */
public class Jdbc {
        private final static String URL = "jdbc:mysql://localhost:3306/summerbankdb";
        private final static String USER ="root";
        private final static  String PASSWORD = "";
          
        public static Connection getconnexion() {
        
                try {
                     Connection Connexion = null ;
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    return (Connection) DriverManager.getConnection(URL,USER,PASSWORD);
                } catch (ClassNotFoundException ex) {
                   Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
                  
                }catch (SQLException ex) {
                  Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
                  
                }
                return null;
     
            } 

           
        }

        
        
        
    

