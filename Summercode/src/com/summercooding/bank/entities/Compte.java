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
public class Compte {

    int idcompte;
    double solde;
    int iduser;
    int idadmin;

    public void save(double solde, int iduser, int idadmin) throws SQLException {

        String command = "INSERT INTO `compte` ( `solde`, `iduser`,`idadmin`) VALUES ( ?, ? ,?)";
        PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);

        addstmt.setObject(1, solde);
        addstmt.setObject(2, iduser);
        addstmt.setObject(3, idadmin);

        addstmt.execute();

    }

    public void update( int idcompte,double solde, int iduser, int idadmin) throws SQLException {

        String command = " UPDATE `compte` SET `solde` = ? , `iduser` = ?, `idadmin` = ? WHERE `compte`.`iidcompte` = ?";
        PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);

        addstmt.setObject(1, solde);
        addstmt.setObject(2, iduser);
        addstmt.setObject(3, idadmin);
        addstmt.setObject(4, idcompte);
        addstmt.execute();

    }

    public void delete(int idcompte) throws SQLException {

        String command = "DELETE FROM `compte` WHERE `compte`.`iidcompte` = ?";
        PreparedStatement addstmt = Jdbc.getconnexion().prepareStatement(command);

        addstmt.setObject(1, idcompte);
        addstmt.execute();
    }

    public Compte getOne(int idcompte) throws SQLException {
        String cmd = "select * from compte where iidcompte = ?";
        PreparedStatement stmt
                = Jdbc.getconnexion().prepareStatement(cmd);
        stmt.setObject(1, idcompte);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {

            return new Compte(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));

        }
        return null;
    }

    public Compte getByIduserAndIdadmin(int iduser , int idadmin) throws SQLException {
        String cmd = "select * from compte where iduser = ? and idadmin = ?";
        PreparedStatement stmt
                = Jdbc.getconnexion().prepareStatement(cmd);
        stmt.setObject(1, iduser);
        stmt.setObject(2, idadmin);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {

            return new Compte(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));

        }
        return null;
    }
    
    
    
      public List<Compte>getAllCompte () throws SQLException{
        String cmd = "select * from compte";
        PreparedStatement stmt
                =Jdbc.getconnexion().prepareStatement(cmd);
        ResultSet rs=stmt.executeQuery(); 
        
        List <Compte>listCompte = new ArrayList<>();
        while (rs.next()){
            listCompte.add (new Compte(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4)));
            
        }
        return listCompte;
    }
 
    

    public int getIdcompte() {
        return idcompte;
    }

    public void setIdcompte(int idcompte) {
        this.idcompte = idcompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;

    }

    public Compte() {

    }

    public Compte(int idcompte, double solde, int iduser, int idadmin) {
        this.idcompte = idcompte;
        this.solde = solde;
        this.iduser = iduser;
        this.idadmin = idadmin;
    }

    @Override
    public String toString() {
        return "Compte{" + "idcompte=" + idcompte + ", solde=" + solde + ", iduser=" + iduser + ", idadmin=" + idadmin + '}';
    }

    public static void main(String arg[]) {
        try {
            Compte compte = new Compte();
              compte.save(100,3,4);
             //compte.delete (1);
           // compte.update(3,300, 5, 3);
          // String result = compte.getOne(3).toString();
         // result = compte.getByIduserAndIdadmin(2, 4).toString();
        // result = compte.getAllCompte().toString();
          // System.out.println(result);
        } catch (SQLException ex) {
            Logger.getLogger(Compte.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
