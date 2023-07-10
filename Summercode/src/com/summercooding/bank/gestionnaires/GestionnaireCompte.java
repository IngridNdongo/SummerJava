/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.gestionnaires;

import com.summercooding.bank.entities.Admin;
import com.summercooding.bank.entities.Compte;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ingrid
 */
public class GestionnaireCompte {
    
    
    
    private Compte compte = new Compte();
    
    
    public void saveCompte(double solde , int iduser  ,int idadmin) throws SQLException {
    
         compte.save(solde , iduser , idadmin);
    }
    
    }

    
            
     