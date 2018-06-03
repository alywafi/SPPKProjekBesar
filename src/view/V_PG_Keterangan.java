/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class V_PG_Keterangan extends javax.swing.JFrame {

    /**
     * Creates new form V_PG_Kriteria
     */
    public V_PG_Keterangan() {
        initComponents();
    }

    public JButton getBtn_EditKriteria() {
        return BTN_EditKriteria;
    }

    public JButton getBtn_OkEditKriteria() {
        return BTN_OkEditKriteria;
    }

    public JButton getBtn_keluar() {
        return BTN_Back;
    }

    public JTable getTable_Kriteria() {
        return table_Kriteria;
    }

    public JTextField get_EditIdKeterangan() {
        return JTF_EditIDKeterangan;
    }

    public JTextField get_EditIdKriteria() {
        return JTF_EditIdKriteria;
    }

    public JTextField get_EditNamaKriteria() {
        return JTF_EditNamaKriteria;
    }

    public JTextField get_EditBobot() {
        return JTF_EditBobotKriteria;
    }

    public int getSelectedRow() {
        return this.table_Kriteria.getSelectedRow();
    }

    public String getIdFromTable(int kolom) {
        return this.table_Kriteria.getValueAt(this.getSelectedRow(), kolom).toString();
    }

    public void tampilEdit(boolean active) {
        this.getBtn_OkEditKriteria().setVisible(active);
        this.get_EditNamaKriteria().setVisible(active);
        this.get_EditBobot().setVisible(active);
        JTF_EditIDKeterangan.setVisible(active);
        jLabel7.setVisible(active);
        jLabel8.setVisible(active);
        jLabel9.setVisible(active);
        BTN_OkEditKriteria.setVisible(active);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_Back = new javax.swing.JButton();
        JTF_EditNamaKriteria = new javax.swing.JTextField();
        JTF_EditBobotKriteria = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BTN_OkEditKriteria = new javax.swing.JButton();
        BTN_EditKriteria = new javax.swing.JButton();
        JTF_EditIDKeterangan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Kriteria = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTF_EditIdKriteria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_keluar.png"))); // NOI18N
        BTN_Back.setBorderPainted(false);
        BTN_Back.setOpaque(false);
        getContentPane().add(BTN_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, -1, -1));
        getContentPane().add(JTF_EditNamaKriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 840, -1));
        getContentPane().add(JTF_EditBobotKriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 650, 840, -1));

        jLabel7.setText("Nama Kriteria");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, -1, -1));

        jLabel8.setText("Bobot Kriteria");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, -1, -1));

        BTN_OkEditKriteria.setText("Ok");
        getContentPane().add(BTN_OkEditKriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, 90, -1));

        BTN_EditKriteria.setText("Edit");
        getContentPane().add(BTN_EditKriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 260, -1));
        getContentPane().add(JTF_EditIDKeterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 110, -1));

        table_Kriteria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(table_Kriteria);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 840, -1));

        jLabel9.setText("ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, -1, -1));

        jLabel2.setText("Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));

        jLabel3.setText("Id Kriteria");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, -1, -1));
        getContentPane().add(JTF_EditIdKriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 120, -1));

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
            java.util.logging.Logger.getLogger(V_PG_Keterangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_PG_Keterangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_PG_Keterangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_PG_Keterangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_PG_Keterangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Back;
    private javax.swing.JButton BTN_EditKriteria;
    private javax.swing.JButton BTN_OkEditKriteria;
    private javax.swing.JTextField JTF_EditBobotKriteria;
    private javax.swing.JTextField JTF_EditIDKeterangan;
    private javax.swing.JTextField JTF_EditIdKriteria;
    private javax.swing.JTextField JTF_EditNamaKriteria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Kriteria;
    // End of variables declaration//GEN-END:variables
}
