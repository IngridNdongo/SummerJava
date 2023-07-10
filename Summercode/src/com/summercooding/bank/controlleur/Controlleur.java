/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.controlleur;

import com.summercooding.bank.entities.Admin;
import com.summercooding.bank.entities.Compte;
import com.summercooding.bank.entities.Utilisateur;
import com.summercooding.bank.gestionnaires.GestionnaireAdmin;
import com.summercooding.bank.gestionnaires.GestionnaireCompte;
import com.summercooding.bank.gestionnaires.GestionnaireUtilisateur;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author ingrid
 */
public class Controlleur {
    GestionnaireAdmin gestionnaireAdmin = new GestionnaireAdmin ();
    
    GestionnaireUtilisateur gestionnaireUtilisateur = new GestionnaireUtilisateur ();
    
    GestionnaireCompte gestionnaireCompte = new GestionnaireCompte ();
    
    
      public Admin routeVersLogin(String login ,String pwd) throws SQLException{
           
          return gestionnaireAdmin.login(login , pwd);
      }
        
      
     public void routeVersSaveAdmin(String login , String password , String nom) throws SQLException{
         
         gestionnaireAdmin.saveAdmin(login, password, nom);
     }
    
    
     public void routeVersSaveUtilisateur(String login , String password , String nom , String prenom, LocalDate datenaiss, String genre, int idadmin) throws SQLException{
         
         gestionnaireUtilisateur.saveUtilisateur(login , password, nom , prenom , datenaiss , genre , idadmin);
         
     }     
         
    public void routeVersSaveCompte(double solde , int iduser  , int idadmin) throws SQLException {
          gestionnaireCompte.saveCompte(solde, iduser, idadmin);
              
    }
    
    
    
     public List<Admin> routeVersListAllAdmin() throws SQLException{
            return gestionnaireAdmin.ListAllAdmin();
     }
     

     public Utilisateur routeVersLoginUtilisateur(String login , String password) throws SQLException{
             return gestionnaireUtilisateur.login(login, password );
     }
   
}
     
