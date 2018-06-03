/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
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

    public JButton getBtn_EditKeterangan() {
        return BTN_EditKeterangan;
    }

    public JButton getBtn_OkEditKeterangan() {
        return BTN_OkEditKeterangan;
    }

    public JButton getBtn_BatalEditKeterangan() {
        return BTN_BatalEditKeterangan;
    }

    public JButton getBtn_OkTambahKeterangan() {
        return btn_OkTambahKeterangan;
    }

    public JButton getBtn_keluar() {
        return BTN_Keluar;
    }

    public JTable getTable_Keterangan() {
        return table_Keterangan;
    }

    public JTextField get_TambahBobot() {
        return JTF_TambahbobotKeterangan;
    }
    public JTextArea get_TambahDetailKeterangan() {
        return JTA_TambahDetailKeterangan ;
    }

    public JTextField get_EditIdKeterangan() {
        return JTF_EditIDKeterangan;
    }
    public JTextField get_EditIdKriteria() {
        return JTF_EditIDKriteria;
    }

    public JTextField get_EditBobot() {
        return JTF_EditBobotKeterangan;
    }
    public JTextArea get_EditDetailKeterangan() {
        return JTA_EditDetailKeterangan;
    }

    public int getSelectedRow() {
        return this.table_Keterangan.getSelectedRow();
    }

    public String getIdFromTable(int kolom) {
        return this.table_Keterangan.getValueAt(this.getSelectedRow(), kolom).toString();
    }

    public void tampilEdit(boolean active) {
        this.getBtn_OkEditKeterangan().setVisible(active);
        this.getBtn_BatalEditKeterangan().setVisible(active);
        this.get_EditBobot().setVisible(active);
        JTF_EditIDKeterangan.setVisible(active);
        JTA_EditDetailKeterangan.setVisible(active);
        JTF_EditIDKriteria.setVisible(active);
        JTF_EditBobotKeterangan.setVisible(active);
        jLabel6.setVisible(active);
        jLabel7.setVisible(active);
        jLabel8.setVisible(active);
        jLabel9.setVisible(active);
        BTN_OkEditKeterangan.setVisible(active);
        BTN_BatalEditKeterangan.setVisible(active);
        jScrollPane3.setVisible(active);
        JTA_EditDetailKeterangan.setVisible(active);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_Keluar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Keterangan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        JTF_TambahbobotKeterangan = new javax.swing.JTextField();
        btn_OkTambahKeterangan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTA_TambahDetailKeterangan = new javax.swing.JTextArea();
        JTF_EditBobotKeterangan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BTN_OkEditKeterangan = new javax.swing.JButton();
        BTN_EditKeterangan = new javax.swing.JButton();
        BTN_BatalEditKeterangan = new javax.swing.JButton();
        JTF_EditIDKeterangan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTA_EditDetailKeterangan = new javax.swing.JTextArea();
        JTF_EditIDKriteria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_Keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_keluar.png"))); // NOI18N
        BTN_Keluar.setBorderPainted(false);
        BTN_Keluar.setContentAreaFilled(false);
        BTN_Keluar.setOpaque(false);
        getContentPane().add(BTN_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        table_Keterangan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(table_Keterangan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Data Kriteria", jPanel1);

        btn_OkTambahKeterangan.setText("Ok");

        jLabel2.setText("Detail keterangan");

        jLabel3.setText("Bobot");

        JTA_TambahDetailKeterangan.setColumns(20);
        JTA_TambahDetailKeterangan.setRows(5);
        jScrollPane2.setViewportView(JTA_TambahDetailKeterangan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_OkTambahKeterangan, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(JTF_TambahbobotKeterangan)
                    .addComponent(jScrollPane2))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_TambahbobotKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(44, 44, 44)
                .addComponent(btn_OkTambahKeterangan)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tambah Keterangan", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, 410));
        getContentPane().add(JTF_EditBobotKeterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, 220, -1));

        jLabel6.setText("Id_ Kriteria");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, -1, -1));

        jLabel7.setText("Detail Kriteria");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, -1, -1));

        jLabel8.setText("Bobot");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 570, -1, -1));

        BTN_OkEditKeterangan.setText("Ok");
        getContentPane().add(BTN_OkEditKeterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 720, 90, -1));

        BTN_EditKeterangan.setText("Edit");
        getContentPane().add(BTN_EditKeterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 190, -1));

        BTN_BatalEditKeterangan.setText("Batal");
        getContentPane().add(BTN_BatalEditKeterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 720, 90, -1));
        getContentPane().add(JTF_EditIDKeterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 50, -1));

        jLabel9.setText("ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, -1));

        JTA_EditDetailKeterangan.setColumns(20);
        JTA_EditDetailKeterangan.setRows(5);
        jScrollPane3.setViewportView(JTA_EditDetailKeterangan);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, 250, 140));
        getContentPane().add(JTF_EditIDKriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 70, -1));

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
    private javax.swing.JButton BTN_BatalEditKeterangan;
    private javax.swing.JButton BTN_EditKeterangan;
    private javax.swing.JButton BTN_Keluar;
    private javax.swing.JButton BTN_OkEditKeterangan;
    private javax.swing.JTextArea JTA_EditDetailKeterangan;
    private javax.swing.JTextArea JTA_TambahDetailKeterangan;
    private javax.swing.JTextField JTF_EditBobotKeterangan;
    private javax.swing.JTextField JTF_EditIDKeterangan;
    private javax.swing.JTextField JTF_EditIDKriteria;
    private javax.swing.JTextField JTF_TambahbobotKeterangan;
    private javax.swing.JButton btn_OkTambahKeterangan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable table_Keterangan;
    // End of variables declaration//GEN-END:variables
}
