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
public class V_PG_Kriteria extends javax.swing.JFrame {

    /**
     * Creates new form V_PG_Kriteria
     */
    public V_PG_Kriteria() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JButton getBtn_LihatKeterangan() {
        return BTN_LihatKeterangan;
    }

    public JButton getBtn_EditKriteria() {
        return BTN_EditKriteria;
    }

    public JButton getBtn_Penjualan() {
        return Btn_Penjualan;
    }

    public JButton getBtn_OkEditKriteria() {
        return BTN_OkEditKriteria;
    }

    public JButton getBtn_BatalEditKriteria() {
        return BTN_BatalEditKriteria;
    }

    public JButton getBtn_OkTambahKriteria() {
        return btn_OkTambahKriteria;
    }

    public JButton getBtn_keluar() {
        return BTN_Keluar;
    }

    public JTable getTable_Kriteria() {
        return table_Kriteria;
    }

    public JTextField get_TambahNamaKriteria() {
        return JTF_Tambahnamakriteria;
    }

    public JTextField get_TambahBobot() {
        return JTF_Tambahbobot;
    }

    public JComboBox get_TambahJenisInputan() {
        return JCB_TambahJenisInput;
    }

    public JComboBox get_TambahTipeNilai() {
        return JCB_TambahTipeNilai;
    }

    public JTextField get_EditIdKriteria() {
        return JTF_EditID;
    }

    public JTextField get_EditNamaKriteria() {
        return JTF_EditNamaKriteria;
    }

    public JTextField get_EditBobot() {
        return JTF_EditBobotKriteria;
    }

    public JComboBox get_EditTipeNilai() {
        return JCB_EditTipeNilai;
    }

    public int getSelectedRow() {
        return this.table_Kriteria.getSelectedRow();
    }

    public String getIdFromTable(int kolom) {
        return this.table_Kriteria.getValueAt(this.getSelectedRow(), kolom).toString();
    }

    public void tampilEdit(boolean active) {
        this.getBtn_OkEditKriteria().setVisible(active);
        this.getBtn_BatalEditKriteria().setVisible(active);
        this.get_EditNamaKriteria().setVisible(active);
        this.get_EditBobot().setVisible(active);
        this.get_EditTipeNilai().setVisible(active);
        JTF_EditID.setVisible(active);
        jLabel6.setVisible(active);
        jLabel7.setVisible(active);
        jLabel8.setVisible(active);
        jLabel9.setVisible(active);
        BTN_OkEditKriteria.setVisible(active);
        BTN_BatalEditKriteria.setVisible(active);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_Keluar = new javax.swing.JButton();
        Btn_kriteria = new javax.swing.JButton();
        Btn_Penjualan = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Kriteria = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        JTF_Tambahnamakriteria = new javax.swing.JTextField();
        JTF_Tambahbobot = new javax.swing.JTextField();
        btn_OkTambahKriteria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JCB_TambahJenisInput = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        JCB_TambahTipeNilai = new javax.swing.JComboBox<>();
        JTF_EditNamaKriteria = new javax.swing.JTextField();
        JCB_EditTipeNilai = new javax.swing.JComboBox<>();
        JTF_EditBobotKriteria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BTN_OkEditKriteria = new javax.swing.JButton();
        BTN_EditKriteria = new javax.swing.JButton();
        BTN_BatalEditKriteria = new javax.swing.JButton();
        BTN_LihatKeterangan = new javax.swing.JButton();
        JTF_EditID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_Keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_keluar.png"))); // NOI18N
        BTN_Keluar.setBorderPainted(false);
        BTN_Keluar.setContentAreaFilled(false);
        BTN_Keluar.setOpaque(false);
        getContentPane().add(BTN_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, -1, -1));

        Btn_kriteria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_Kriteia.png"))); // NOI18N
        Btn_kriteria.setBorderPainted(false);
        Btn_kriteria.setContentAreaFilled(false);
        Btn_kriteria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_kriteria.setDisabledSelectedIcon(null);
        Btn_kriteria.setOpaque(false);
        getContentPane().add(Btn_kriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        Btn_Penjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_Penjualan.png"))); // NOI18N
        Btn_Penjualan.setBorderPainted(false);
        Btn_Penjualan.setContentAreaFilled(false);
        Btn_Penjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Penjualan.setDisabledSelectedIcon(null);
        Btn_Penjualan.setOpaque(false);
        getContentPane().add(Btn_Penjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Data Kriteria", jPanel1);

        btn_OkTambahKriteria.setText("Ok");

        jLabel2.setText("Nama Kriteria");

        jLabel3.setText("Bobot");

        jLabel4.setText("Jenis Inputan");

        JCB_TambahJenisInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "List dengan bobot masing masing", "Input Berupa Angka" }));

        jLabel5.setText("Tipe Nilai");

        JCB_TambahTipeNilai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Benefit", "Cost" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(33, 33, 33))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(58, 58, 58)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTF_Tambahnamakriteria)
                    .addComponent(JTF_Tambahbobot)
                    .addComponent(JCB_TambahJenisInput, 0, 280, Short.MAX_VALUE)
                    .addComponent(btn_OkTambahKriteria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JCB_TambahTipeNilai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_Tambahnamakriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JCB_TambahJenisInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTF_Tambahbobot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JCB_TambahTipeNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btn_OkTambahKriteria)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tambah Kriteria", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));
        getContentPane().add(JTF_EditNamaKriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 200, 220, -1));

        JCB_EditTipeNilai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Benefit", "Cost" }));
        getContentPane().add(JCB_EditTipeNilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 350, 220, -1));
        getContentPane().add(JTF_EditBobotKriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 280, 220, -1));

        jLabel6.setText("Tipe Nilai");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 320, -1, -1));

        jLabel7.setText("Nama Kriteria");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 180, -1, -1));

        jLabel8.setText("Bobot Kriteria");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 250, -1, -1));

        BTN_OkEditKriteria.setText("Ok");
        getContentPane().add(BTN_OkEditKriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 400, 90, -1));

        BTN_EditKriteria.setText("Edit");
        getContentPane().add(BTN_EditKriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 60, -1, -1));

        BTN_BatalEditKriteria.setText("Batal");
        getContentPane().add(BTN_BatalEditKriteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 400, 90, -1));

        BTN_LihatKeterangan.setText("Lihat Keterangan");
        getContentPane().add(BTN_LihatKeterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 310, -1));
        getContentPane().add(JTF_EditID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 140, 190, -1));

        jLabel9.setText("ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 140, -1, -1));

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
            java.util.logging.Logger.getLogger(V_PG_Kriteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_PG_Kriteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_PG_Kriteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_PG_Kriteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_PG_Kriteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_BatalEditKriteria;
    private javax.swing.JButton BTN_EditKriteria;
    private javax.swing.JButton BTN_Keluar;
    private javax.swing.JButton BTN_LihatKeterangan;
    private javax.swing.JButton BTN_OkEditKriteria;
    private javax.swing.JButton Btn_Penjualan;
    private javax.swing.JButton Btn_kriteria;
    private javax.swing.JComboBox<String> JCB_EditTipeNilai;
    private javax.swing.JComboBox<String> JCB_TambahJenisInput;
    private javax.swing.JComboBox<String> JCB_TambahTipeNilai;
    private javax.swing.JTextField JTF_EditBobotKriteria;
    private javax.swing.JTextField JTF_EditID;
    private javax.swing.JTextField JTF_EditNamaKriteria;
    private javax.swing.JTextField JTF_Tambahbobot;
    private javax.swing.JTextField JTF_Tambahnamakriteria;
    private javax.swing.JButton btn_OkTambahKriteria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable table_Kriteria;
    // End of variables declaration//GEN-END:variables
}
