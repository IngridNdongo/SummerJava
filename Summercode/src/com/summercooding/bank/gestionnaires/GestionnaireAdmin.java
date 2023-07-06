/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.gestionnaires;

import com.summercooding.bank.entities.Admin;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ingrid
 */
public class GestionnaireAdmin {
    private Admin admin = new Admin ();
    
    public Admin login (String login , String pwd) throws SQLException{
        
        return admin.getByLoginAndPassword(login , pwd);
    
    }
    
    
    
    
    public void saveAdmin (String login ,String password ,String nom) throws SQLException{
            admin.save(login , password , nom);
    
    }
    
    
    public List<Admin> ListAllAdmin() throws SQLException{
            return admin.getAllAdmin();
    
    }
    
    
}
