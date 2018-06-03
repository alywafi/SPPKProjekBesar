/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class V_login extends javax.swing.JFrame {

    /**
     * Creates new form V_login
     */
    public V_login() {
        initComponents();
        this.setLocationRelativeTo(null);
        LoadingFrame.setBackground(new Color(0, 0, 0, 0));
        LoadingFrame.setLocationRelativeTo(null);
    }

    public JTextField getNama() {
        return jt_Nama;
    }

    public JTextField getPassword() {
        return jt_Password;
    }

    public JButton get_btnlogin() {
        return btn_login;
    }

    public void showLoading(boolean active) {
        if (active) {
            LoadingFrame.setVisible(active);
        } else {
            LoadingFrame.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoadingFrame = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jt_Nama = new javax.swing.JTextField();
        jt_Password = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        LoadingFrame.setBackground(new java.awt.Color(0, 0, 0));
        LoadingFrame.setUndecorated(true);
        LoadingFrame.setResizable(false);
        LoadingFrame.setSize(new java.awt.Dimension(1366, 768));
        LoadingFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loading.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        LoadingFrame.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jt_Nama.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 27)); // NOI18N
        jt_Nama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_Nama.setBorder(null);
        jt_Nama.setOpaque(false);
        getContentPane().add(jt_Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 449, 290, 40));

        jt_Password.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 27)); // NOI18N
        jt_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_Password.setBorder(null);
        jt_Password.setOpaque(false);
        getContentPane().add(jt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 549, 290, 40));

        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_masuk.png"))); // NOI18N
        btn_login.setBorder(null);
        btn_login.setBorderPainted(false);
        btn_login.setContentAreaFilled(false);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_masuk_hover.png"))); // NOI18N
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, 160, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(V_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame LoadingFrame;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jt_Nama;
    private javax.swing.JTextField jt_Password;
    // End of variables declaration//GEN-END:variables
}
