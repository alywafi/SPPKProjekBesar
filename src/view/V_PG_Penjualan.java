/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class V_PG_Penjualan extends javax.swing.JFrame {

    /**
     * Creates new form V_Pgudang
     */
    public V_PG_Penjualan() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void settampil (boolean active) {
        btn_BatalBeli.setVisible(active);
        btn_OkBeli.setVisible(active);
        Jtf_KuantitasBeli.setVisible(active);
        jLabel2.setVisible(active);
    }

    public JButton getBtnBatalBeli () {
        return btn_BatalBeli ;
    }
    public JButton getBtnOkBeli () {
        return btn_OkBeli ;
    }
    public JTextField getKuantitaskBeli () {
        return Jtf_KuantitasBeli ;
    }

    public JTable getTableIkan() {
        return JTable_Ikan;
    }
    public JButton getBtnKriteria () {
        return btn_kriteria ;
    }

    public JButton getBtnBeli() {
        return btn_Beli;
    }

    public int getSelectedRow() {
        return this.JTable_Ikan.getSelectedRow();
    }

    public String getIdFromTable() {
        return this.JTable_Ikan.getValueAt(this.getSelectedRow(), 1).toString();
    }
    public String getDataFromTable(int index) {
        return this.JTable_Ikan.getValueAt(this.getSelectedRow(),index ).toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Ikan = new javax.swing.JTable();
        btn_Beli = new javax.swing.JButton();
        btn_kriteria = new javax.swing.JButton();
        btn_penjualan = new javax.swing.JButton();
        Jtf_KuantitasBeli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_OkBeli = new javax.swing.JButton();
        btn_BatalBeli = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTable_Ikan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTable_Ikan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 930, -1));

        btn_Beli.setText("Beli");
        getContentPane().add(btn_Beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 200, 49));

        btn_kriteria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_Kriteia.png"))); // NOI18N
        btn_kriteria.setBorderPainted(false);
        btn_kriteria.setContentAreaFilled(false);
        getContentPane().add(btn_kriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        btn_penjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_Penjualan.png"))); // NOI18N
        btn_penjualan.setBorderPainted(false);
        btn_penjualan.setContentAreaFilled(false);
        getContentPane().add(btn_penjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));
        getContentPane().add(Jtf_KuantitasBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 120, 40));

        jLabel2.setText("Kuantitas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, -1, -1));

        btn_OkBeli.setText("Ok");
        getContentPane().add(btn_OkBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 660, 80, 50));

        btn_BatalBeli.setText("Batal");
        getContentPane().add(btn_BatalBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 660, 80, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gudang.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(V_PG_Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_PG_Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_PG_Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_PG_Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_PG_Penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable_Ikan;
    private javax.swing.JTextField Jtf_KuantitasBeli;
    private javax.swing.JButton btn_BatalBeli;
    private javax.swing.JButton btn_Beli;
    private javax.swing.JButton btn_OkBeli;
    private javax.swing.JButton btn_kriteria;
    private javax.swing.JButton btn_penjualan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
