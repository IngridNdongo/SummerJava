/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercooding.bank.ui;

import com.summercooding.bank.controlleur.Controlleur;
import com.summercooding.bank.entities.Admin;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ingrid
 */
public class JFrameSaveUtilisateur extends javax.swing.JFrame {
    Controlleur controlleur = new Controlleur ();

    /**
     * Creates new form JFrameSaveUtilisateur
     */
    public JFrameSaveUtilisateur() { 
        
        initComponents();
        RadioButtonFeminin. setSelected(true);
       for(int i = 2023 ; i >= 900 ; i --)
           ComboBoxAnnee.addItem(i+"");
        
       
        
        for (int i = 1 ; i<=12 ;i++)
           ComboBoxMois.addItem(i+"");
          
        
        for(  int i = 1 ; i <=31 ; i ++ )
            ComboBoxJour.addItem(i+"");
            
        try {
            for (Admin admin : controlleur.routeVersListAllAdmin()){
                ComboBoxIdadmin.addItem(admin.getIdadmin()+" " + admin.getLogin());
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboBoxAnnee = new javax.swing.JComboBox<>();
        ComboBoxMois = new javax.swing.JComboBox<>();
        ComboBoxJour = new javax.swing.JComboBox<>();
        champPassword = new javax.swing.JPasswordField();
        RadioButtonMasculin = new javax.swing.JRadioButton();
        RadioButtonFeminin = new javax.swing.JRadioButton();
        ComboBoxIdadmin = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        champPrenom = new javax.swing.JTextField();
        champNom = new javax.swing.JTextField();
        champLogin = new javax.swing.JTextField();
        ButtonOK = new javax.swing.JButton();
        ButtonCANCEL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Password");

        jLabel5.setText("DateNaiss");

        jLabel6.setText("Genre");

        jLabel7.setText("Idadmin");

        ComboBoxAnnee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020" }));

        ComboBoxMois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        ComboBoxJour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        champPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champPasswordActionPerformed(evt);
            }
        });

        RadioButtonMasculin.setText("Masculin");
        RadioButtonMasculin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonMasculinActionPerformed(evt);
            }
        });

        RadioButtonFeminin.setSelected(true);
        RadioButtonFeminin.setText("Feminin");
        RadioButtonFeminin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonFemininActionPerformed(evt);
            }
        });

        ComboBoxIdadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxIdadminActionPerformed(evt);
            }
        });

        jLabel1.setText("Login");

        jLabel2.setText("Nom (s)");

        jLabel3.setText("Prenom(s)");

        champPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champPrenomActionPerformed(evt);
            }
        });

        ButtonOK.setText("OK");
        ButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOKActionPerformed(evt);
            }
        });

        ButtonCANCEL.setText("CANCEL");
        ButtonCANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCANCELActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBoxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboBoxMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboBoxJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(champLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addComponent(champNom, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(champPrenom, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(champPassword, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(RadioButtonMasculin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RadioButtonFeminin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ComboBoxIdadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(ButtonCANCEL)))))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonOK)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(champLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(champPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(champPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ComboBoxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(RadioButtonMasculin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonFeminin)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ComboBoxIdadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(champNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonOK)
                    .addComponent(ButtonCANCEL))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioButtonMasculinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonMasculinActionPerformed
        // TODO add your handling code here:
        RadioButtonFeminin.setSelected(false);
    }//GEN-LAST:event_RadioButtonMasculinActionPerformed

    private void RadioButtonFemininActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonFemininActionPerformed
        // TODO add your handling code here:
        RadioButtonMasculin.setSelected(false);
    }//GEN-LAST:event_RadioButtonFemininActionPerformed

    private void champPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champPasswordActionPerformed

    private void champPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champPrenomActionPerformed

    private void ComboBoxIdadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxIdadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxIdadminActionPerformed

    private void ButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOKActionPerformed
        try {
            // TODO add your handling code here:
            
            
            
            
            String Login = champLogin.getText();
            String nom =champNom .getText();
            String prenom = champPrenom .getText();
            String password =champPassword .getText();
            String genre = RadioButtonFeminin.getText();
            if (RadioButtonMasculin.isSelected())
                genre = RadioButtonMasculin.getText();
            
            int annee = Integer.parseInt(ComboBoxAnnee.getSelectedItem().toString());
            int mois = Integer.parseInt(ComboBoxMois.getSelectedItem().toString());
            int jour = Integer.parseInt(ComboBoxJour.getSelectedItem().toString());
            LocalDate dateNaiss = LocalDate.of(annee, mois, jour);
            
            
            String idAdminString = ComboBoxIdadmin.getSelectedItem().toString().split("")[0];
            int idAdmin = Integer.parseInt(idAdminString);
            
            controlleur.routeVersSaveUtilisateur(Login, password, nom, prenom, dateNaiss, genre, idAdmin);
            JOptionPane.showMessageDialog(null, "Success");
          
            
            champLogin.setText("");
            champPassword.setText("");
            champNom.setText("");
            champPrenom.setText("");
            champPassword.setText("");
          //  champGenre.setText("");
           // champIdadmin.setText("");
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(null, "Veuillez contacter l'administrateur");
          
        }
        
        
    }//GEN-LAST:event_ButtonOKActionPerformed

    private void ButtonCANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCANCELActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ButtonCANCELActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSaveUtilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCANCEL;
    private javax.swing.JButton ButtonOK;
    private javax.swing.JComboBox<String> ComboBoxAnnee;
    private javax.swing.JComboBox<String> ComboBoxIdadmin;
    private javax.swing.JComboBox<String> ComboBoxJour;
    private javax.swing.JComboBox<String> ComboBoxMois;
    private javax.swing.JRadioButton RadioButtonFeminin;
    private javax.swing.JRadioButton RadioButtonMasculin;
    private javax.swing.JTextField champLogin;
    private javax.swing.JTextField champNom;
    private javax.swing.JPasswordField champPassword;
    private javax.swing.JTextField champPrenom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
