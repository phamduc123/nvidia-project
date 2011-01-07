/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormLogin.java
 *
 * Created on Aug 17, 2010, 1:54:23 PM
 */

package PL;

import javax.swing.*;

import BLL.*;
import EL.*;

/**
 *
 * @author Administrator
 */
public class FormLogin extends javax.swing.JFrame {
    /* fields */
    private AccountBLO accBLO = new AccountBLO();

    /** Creates new form FormLogin */
    public FormLogin() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pWest = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pCenter = new javax.swing.JPanel();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        pSouth = new javax.swing.JPanel();
        btLogin = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FormLogin");

        pWest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        pWest.setLayout(new java.awt.GridLayout(2, 1));

        jLabel1.setText("Username");
        pWest.add(jLabel1);

        jLabel2.setText("Password");
        pWest.add(jLabel2);

        getContentPane().add(pWest, java.awt.BorderLayout.LINE_START);

        pCenter.setLayout(new java.awt.GridLayout(2, 1));
        pCenter.add(tfUsername);
        pCenter.add(tfPassword);

        getContentPane().add(pCenter, java.awt.BorderLayout.CENTER);

        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        pSouth.add(btLogin);

        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        pSouth.add(btReset);

        btRegister.setText("Register");
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });
        pSouth.add(btRegister);

        getContentPane().add(pSouth, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        String username = tfUsername.getText();
        //String password = tfPassword.getText();
        String password = new String(tfPassword.getPassword());
        Account account = new Account(username, password);
        try {
            boolean exist = accBLO.isExist(account);
            if (exist)  JOptionPane.showMessageDialog(this, "Valid user");
            else        JOptionPane.showMessageDialog(this, "Invalid user");
        } catch (Exception ex) { ex.printStackTrace(); }
    }//GEN-LAST:event_btLoginActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        tfUsername.setText("");
        tfPassword.setText("");
    }//GEN-LAST:event_btResetActionPerformed

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
        Account account = new Account(tfUsername.getText(), new String(tfPassword.getPassword()));
        try {
            if (accBLO.add(account))
                JOptionPane.showMessageDialog(this, "Register successful");
            else
                JOptionPane.showMessageDialog(this, "Register fail");
        } catch (Exception ex) { ex.printStackTrace(); }
    }//GEN-LAST:event_btRegisterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btRegister;
    private javax.swing.JButton btReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pCenter;
    private javax.swing.JPanel pSouth;
    private javax.swing.JPanel pWest;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

}