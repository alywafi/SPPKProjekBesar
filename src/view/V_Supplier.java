/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class V_Supplier extends javax.swing.JFrame {

    /**
     * Creates new form V_Supplier
     */
    public V_Supplier() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public int getbau() {
        int a = 0;
        if (jrb_bau_9.isSelected()) {
            a = 9;
        } else if (jrb_bau_8.isSelected()) {
            a = 8;
        } else if (jrb_bau_7.isSelected()) {
            a = 7;
        } else if (jrb_bau_5.isSelected()) {
            a = 5;
        } else if (jrb_bau_3.isSelected()) {
            a = 3;
        } else if (jrb_bau_1.isSelected()) {
            a = 1;
        }
        return a;
    }

    public int getmata() {
        int a = 0;
        if (jrb_mata_9.isSelected()) {
            a = 9;
        } else if (jrb_mata_8.isSelected()) {
            a = 8;
        } else if (jrb_mata_7.isSelected()) {
            a = 7;
        } else if (jrb_mata_6.isSelected()) {
            a = 6;
        } else if (jrb_mata_5.isSelected()) {
            a = 5;

        } else if (jrb_mata_3.isSelected()) {
            a = 3;

        } else if (jrb_mata_1.isSelected()) {
            a = 1;
        }
        return a;
    }

    public int getinsang() {
        int a = 0;
        if (jrb_insang_9.isSelected()) {
            a = 9;
        } else if (jrb_insang_8.isSelected()) {
            a = 8;
        } else if (jrb_insang_7.isSelected()) {
            a = 7;
        } else if (jrb_insang_6.isSelected()) {
            a = 6;
        } else if (jrb_insang_5.isSelected()) {
            a = 5;
        } else if (jrb_insang_3.isSelected()) {
            a = 3;
        } else if (jrb_insang_1.isSelected()) {
            a = 1;
        }
        return a;
    }

    public int getbadan() {
        int a = 0;
        if (jrb_badan_9.isSelected()) {
            a = 9;
        } else if (jrb_badan_8.isSelected()) {
            a = 8;
        } else if (jrb_badan_7.isSelected()) {
            a = 7;
        } else if (jrb_badan_6.isSelected()) {
            a = 6;
        } else if (jrb_badan_5.isSelected()) {
            a = 5;
        } else if (jrb_badan_3.isSelected()) {
            a = 3;
        } else if (jrb_badan_1.isSelected()) {
            a = 1;
        }
        return a;
    }

    public int getdaging() {
        int a = 0;
        if (jrb_daging_9.isSelected()) {
            a = 9;
        } else if (jrb_daging_8.isSelected()) {
            a = 8;
        } else if (jrb_daging_7.isSelected()) {
            a = 7;
        } else if (jrb_daging_5.isSelected()) {
            a = 5;
        } else if (jrb_daging_3.isSelected()) {
            a = 3;
        } else if (jrb_daging_1.isSelected()) {
            a = 1;
        }
        return a;
    }

    public int gettekstur() {
        int a = 0;
        if (jrb_tekstur_9.isSelected()) {
            a = 9;
        } else if (jrb_tekstur_8.isSelected()) {
            a = 8;
        } else if (jrb_tekstur_7.isSelected()) {
            a = 7;
        } else if (jrb_tekstur_5.isSelected()) {
            a = 5;
        } else if (jrb_tekstur_3.isSelected()) {
            a = 3;
        } else if (jrb_tekstur_1.isSelected()) {
            a = 1;
        }
        return a;
    }

    public JButton getBtnnext1() {
        return btn_lanjut1;
    }

    public JButton getBtnnext2() {
        return btn_lanjut2;
    }

    public JButton getBtnnext3() {
        return btn_lanjut3;
    }

    public JButton getBtnnext4() {
        return btn_lanjut4;
    }

    public JButton getBtnnext5() {
        return btn_lanjut5;
    }

    public JButton getBtnnext6() {
        return btn_lanjut6;
    }

    public JButton getBtnnext7() {
        return btn_lanjut7;
    }

    public JFrame getFrameBau() {
        return bau;
    }

    public JFrame getFrameMata() {
        return mata;
    }

    public JFrame getFrameInsang() {
        return insang;
    }

    public JFrame getFrameBadan() {
        return badan;
    }

    public JFrame getFrameDaging() {
        return daging;
    }

    public JFrame getFramePerut() {
        return tekstur;
    }

    public JTextField getKuantitas() {
        return jt_jumlahIkan;
    }

    public JTable getTable() {
        return jtable_Ikan;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bau = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jrb_bau_9 = new javax.swing.JRadioButton();
        jrb_bau_8 = new javax.swing.JRadioButton();
        jrb_bau_7 = new javax.swing.JRadioButton();
        jrb_bau_3 = new javax.swing.JRadioButton();
        jrb_bau_5 = new javax.swing.JRadioButton();
        jrb_bau_1 = new javax.swing.JRadioButton();
        btn_lanjut2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        mata = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jrb_mata_9 = new javax.swing.JRadioButton();
        jrb_mata_8 = new javax.swing.JRadioButton();
        jrb_mata_7 = new javax.swing.JRadioButton();
        jrb_mata_6 = new javax.swing.JRadioButton();
        btn_lanjut3 = new javax.swing.JButton();
        jrb_mata_5 = new javax.swing.JRadioButton();
        jrb_mata_3 = new javax.swing.JRadioButton();
        jrb_mata_1 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        insang = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jrb_insang_9 = new javax.swing.JRadioButton();
        jrb_insang_8 = new javax.swing.JRadioButton();
        jrb_insang_7 = new javax.swing.JRadioButton();
        jrb_insang_6 = new javax.swing.JRadioButton();
        btn_lanjut4 = new javax.swing.JButton();
        jrb_insang_5 = new javax.swing.JRadioButton();
        jrb_insang_3 = new javax.swing.JRadioButton();
        jrb_insang_1 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        badan = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jrb_badan_9 = new javax.swing.JRadioButton();
        jrb_badan_8 = new javax.swing.JRadioButton();
        jrb_badan_7 = new javax.swing.JRadioButton();
        jrb_badan_6 = new javax.swing.JRadioButton();
        btn_lanjut5 = new javax.swing.JButton();
        jrb_badan_5 = new javax.swing.JRadioButton();
        jrb_badan_3 = new javax.swing.JRadioButton();
        jrb_badan_1 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        daging = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jrb_daging_9 = new javax.swing.JRadioButton();
        jrb_daging_8 = new javax.swing.JRadioButton();
        jrb_daging_7 = new javax.swing.JRadioButton();
        jrb_daging_5 = new javax.swing.JRadioButton();
        btn_lanjut6 = new javax.swing.JButton();
        jrb_daging_3 = new javax.swing.JRadioButton();
        jrb_daging_1 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        tekstur = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jrb_tekstur_9 = new javax.swing.JRadioButton();
        jrb_tekstur_8 = new javax.swing.JRadioButton();
        jrb_tekstur_7 = new javax.swing.JRadioButton();
        jrb_tekstur_5 = new javax.swing.JRadioButton();
        btn_lanjut7 = new javax.swing.JButton();
        jrb_tekstur_3 = new javax.swing.JRadioButton();
        jrb_tekstur_1 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        Bau = new javax.swing.ButtonGroup();
        Mata = new javax.swing.ButtonGroup();
        Insang = new javax.swing.ButtonGroup();
        Badan = new javax.swing.ButtonGroup();
        Daging = new javax.swing.ButtonGroup();
        Perut = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_Ikan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jt_jumlahIkan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_lanjut1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        bau.setMinimumSize(new java.awt.Dimension(1366, 800));
        bau.setSize(new java.awt.Dimension(1366, 800));
        bau.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Pilih Kriteria Bau Ikan");
        bau.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, -1, -1));

        Bau.add(jrb_bau_9);
        jrb_bau_9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_bau_9.setText("Segar, Berbau rumput laut");
        bau.getContentPane().add(jrb_bau_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));

        Bau.add(jrb_bau_8);
        jrb_bau_8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_bau_8.setText("Segar, bau rumput laut mulai berkurang.");
        bau.getContentPane().add(jrb_bau_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        Bau.add(jrb_bau_7);
        jrb_bau_7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_bau_7.setText("Tawar, Netral.");
        bau.getContentPane().add(jrb_bau_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));

        Bau.add(jrb_bau_3);
        jrb_bau_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_bau_3.setText("Berbau susu asam atau seperti susu kental.");
        bau.getContentPane().add(jrb_bau_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        Bau.add(jrb_bau_5);
        jrb_bau_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_bau_5.setText("Berbau susu, belum ada bau asam, ada bau seperti ikan asin.");
        bau.getContentPane().add(jrb_bau_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

        Bau.add(jrb_bau_1);
        jrb_bau_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_bau_1.setText("Berbau seperti kentang rebus atau seperti logam.");
        bau.getContentPane().add(jrb_bau_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));

        btn_lanjut2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_lanjut2.setText("Lanjut");
        bau.getContentPane().add(btn_lanjut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/supp.jpg"))); // NOI18N
        bau.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mata.setSize(new java.awt.Dimension(1366, 800));
        mata.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Pilih Kriteria Mata Ikan");
        mata.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        Mata.add(jrb_mata_9);
        jrb_mata_9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_mata_9.setText("Cerah, bola mata menonjol, kornea jernih");
        mata.getContentPane().add(jrb_mata_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        Mata.add(jrb_mata_8);
        jrb_mata_8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_mata_8.setText("Cerah, bola mata rata, kornea jernih");
        mata.getContentPane().add(jrb_mata_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        Mata.add(jrb_mata_7);
        jrb_mata_7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_mata_7.setText("Agak cerah, bola mata rata, pupil agak keabu-abuan, kornea agak keruh ");
        mata.getContentPane().add(jrb_mata_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        Mata.add(jrb_mata_6);
        jrb_mata_6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_mata_6.setText("Bola mata agak cekung, pupil berubah keabu-abuan, kornea agak keruh. ");
        mata.getContentPane().add(jrb_mata_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        btn_lanjut3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_lanjut3.setText("lanjut");
        mata.getContentPane().add(btn_lanjut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, -1, -1));

        jrb_mata_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_mata_5.setText("Bola mata agak cekung, pupil keabu-abuan, kornea agak keruh. ");
        mata.getContentPane().add(jrb_mata_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        jrb_mata_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_mata_3.setText("Bola mata cekung, pupil mulai berubah menjadi putihsusu, kornea keruh.");
        mata.getContentPane().add(jrb_mata_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        jrb_mata_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_mata_1.setText("Bola mata cekung, pupil mulai berubah menjadi putihsusu, kornea keruh.");
        mata.getContentPane().add(jrb_mata_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/supp.jpg"))); // NOI18N
        mata.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        insang.setSize(new java.awt.Dimension(1366, 800));
        insang.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Pilih Kriteria Kenampakan Insang Ikan");
        insang.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        Insang.add(jrb_insang_9);
        jrb_insang_9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_insang_9.setText("Warna merah cemerlang, tanpa lendir");
        insang.getContentPane().add(jrb_insang_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        Insang.add(jrb_insang_8);
        jrb_insang_8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_insang_8.setText("Warna merah kurang cemerlang, tanpa lendir.");
        insang.getContentPane().add(jrb_insang_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        Insang.add(jrb_insang_7);
        jrb_insang_7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_insang_7.setText("Warna merah agak kusam, tanpa lendir.");
        insang.getContentPane().add(jrb_insang_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        Insang.add(jrb_insang_6);
        jrb_insang_6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_insang_6.setText("Merah agak kusam, sedikit lendir");
        insang.getContentPane().add(jrb_insang_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        btn_lanjut4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_lanjut4.setText("lanjut");
        insang.getContentPane().add(btn_lanjut4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, -1, -1));

        Insang.add(jrb_insang_5);
        jrb_insang_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_insang_5.setText("Mulai ada diskolorasi, merah kecoklatan, sedikit lendir, tanpa lendir.");
        insang.getContentPane().add(jrb_insang_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, -1));

        jrb_insang_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_insang_3.setText("Warna merah coklat, lendir tebal");
        insang.getContentPane().add(jrb_insang_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        Insang.add(jrb_insang_1);
        jrb_insang_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_insang_1.setText("Warna merah coklat ada sedikit putih, lendir tebal.");
        insang.getContentPane().add(jrb_insang_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/supp.jpg"))); // NOI18N
        insang.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        badan.setSize(new java.awt.Dimension(1366, 800));
        badan.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Pilih Kriteria lendir dan permukaan badan Ikan");
        badan.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 96, -1, -1));

        Badan.add(jrb_badan_9);
        jrb_badan_9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_badan_9.setText("Lapisan lendir jernih, transparan, mengkilat cerah.");
        badan.getContentPane().add(jrb_badan_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, -1));

        Badan.add(jrb_badan_8);
        jrb_badan_8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_badan_8.setText("Lapisan lendir jernih, transparan, cerah, belum ada perubahan warna.");
        badan.getContentPane().add(jrb_badan_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        Badan.add(jrb_badan_7);
        jrb_badan_7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_badan_7.setText("Lapisan lendir mulai agak keruh, warna agak putih, kurang transparan.");
        badan.getContentPane().add(jrb_badan_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, -1, -1));

        Badan.add(jrb_badan_6);
        jrb_badan_6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_badan_6.setText("Lapisan lendir mulai keruh, warna putih agak kusam, kurang transparan.");
        badan.getContentPane().add(jrb_badan_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        btn_lanjut5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_lanjut5.setText("lanjut");
        badan.getContentPane().add(btn_lanjut5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, -1, -1));

        Badan.add(jrb_badan_5);
        jrb_badan_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_badan_5.setText("Lendir tebal menggumpal, mulai berubah warna putih, keruh.");
        badan.getContentPane().add(jrb_badan_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        Badan.add(jrb_badan_3);
        jrb_badan_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_badan_3.setText("Lendir tebal menggumpal, berwarna putih kuning.");
        badan.getContentPane().add(jrb_badan_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, -1, -1));

        Badan.add(jrb_badan_1);
        jrb_badan_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_badan_1.setText("Lendir tebal menggumpal, warna kuning kecoklatan.");
        badan.getContentPane().add(jrb_badan_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/supp.jpg"))); // NOI18N
        badan.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        daging.setSize(new java.awt.Dimension(1366, 800));
        daging.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Pilih Kriteria tekstur daging pada Ikan");
        daging.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

        Daging.add(jrb_daging_9);
        jrb_daging_9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_daging_9.setText("Sayatan daging sangat cemerlang, spesifik jenis, tidak ada pemerahan sepanjang tulang belakang, dinding perut daging utuh.");
        daging.getContentPane().add(jrb_daging_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        Daging.add(jrb_daging_8);
        jrb_daging_8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_daging_8.setText("Sayatan daging cemerlang spesifik jenis, tidak ada pemerahan sepanjang tulang belakang, dinding perut utuh.");
        daging.getContentPane().add(jrb_daging_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        Daging.add(jrb_daging_7);
        jrb_daging_7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_daging_7.setText("Sayatan daging sedikit kurang cemerlang, spesifik jenis, tidak ada pemerahan sepanjang tulang belakang, dinding perut daging utuh.");
        daging.getContentPane().add(jrb_daging_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        Daging.add(jrb_daging_5);
        jrb_daging_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_daging_5.setText("Sayatan daging mulai pudar, banyak pemerahan sepanjang tulang belakang, dinding perut agak lunak.");
        daging.getContentPane().add(jrb_daging_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        btn_lanjut6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_lanjut6.setText("lanjut");
        daging.getContentPane().add(btn_lanjut6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, -1, -1));

        jrb_daging_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_daging_3.setText("Sayatan daging kusam, warna merah jelas sekali sepanjang tulang belakang, dinding perut lunak.");
        daging.getContentPane().add(jrb_daging_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        jrb_daging_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_daging_1.setText("Sayatan daging kusam sekali, warna merah jelas sekali sepanjang tulang belakang, dinding perut sangat lunak.");
        daging.getContentPane().add(jrb_daging_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/supp.jpg"))); // NOI18N
        daging.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tekstur.setSize(new java.awt.Dimension(1366, 800));
        tekstur.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Pilih Kriteria Keadaan Daging");
        tekstur.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, -1, -1));

        Perut.add(jrb_tekstur_9);
        jrb_tekstur_9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_tekstur_9.setText("Padat, elastis bila ditekan dengan jari, sulit menyobek daging dari tulang belakang.");
        tekstur.getContentPane().add(jrb_tekstur_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        Perut.add(jrb_tekstur_8);
        jrb_tekstur_8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_tekstur_8.setText("Agak padat, elastis bila ditekan dengan jari, sulit menyobek daging dari tulang belakang.");
        tekstur.getContentPane().add(jrb_tekstur_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        Perut.add(jrb_tekstur_7);
        jrb_tekstur_7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_tekstur_7.setText("Agak padat, agak elastis bila ditekan dengan jari, sulit menyobek daging dari tulang belakang.");
        tekstur.getContentPane().add(jrb_tekstur_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        Perut.add(jrb_tekstur_5);
        jrb_tekstur_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_tekstur_5.setText("Agak lunak, kurang elastis bila ditekan dengan jari, agak mudah menyobek daging dari tulang belakang.");
        tekstur.getContentPane().add(jrb_tekstur_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        btn_lanjut7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_lanjut7.setText("lanjut");
        tekstur.getContentPane().add(btn_lanjut7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, -1, -1));

        jrb_tekstur_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_tekstur_3.setText("Lunak, bekas jari terlihat bila ditekan, mudah menyobek daging dari tulang belakang");
        tekstur.getContentPane().add(jrb_tekstur_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        jrb_tekstur_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrb_tekstur_1.setText("Sangat lunak, bekas jari tidak hilang bila ditekan, mudah sekali menyobek daging dari tulang belakang.");
        tekstur.getContentPane().add(jrb_tekstur_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/supp.jpg"))); // NOI18N
        tekstur.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable_Ikan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtable_Ikan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Penawaran Ikan Anda", jPanel1);

        jt_jumlahIkan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Masukkan Kuantitas Ikan");

        btn_lanjut1.setText("Lanjut");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jt_jumlahIkan, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(btn_lanjut1)))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jt_jumlahIkan, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_lanjut1)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tawarkan Ikan", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 940, 730));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/supp.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(V_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Badan;
    private javax.swing.ButtonGroup Bau;
    private javax.swing.ButtonGroup Daging;
    private javax.swing.ButtonGroup Insang;
    private javax.swing.ButtonGroup Mata;
    private javax.swing.ButtonGroup Perut;
    private javax.swing.JFrame badan;
    private javax.swing.JFrame bau;
    private javax.swing.JButton btn_lanjut1;
    private javax.swing.JButton btn_lanjut2;
    private javax.swing.JButton btn_lanjut3;
    private javax.swing.JButton btn_lanjut4;
    private javax.swing.JButton btn_lanjut5;
    private javax.swing.JButton btn_lanjut6;
    private javax.swing.JButton btn_lanjut7;
    private javax.swing.JFrame daging;
    private javax.swing.JFrame insang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JRadioButton jrb_badan_1;
    private javax.swing.JRadioButton jrb_badan_3;
    private javax.swing.JRadioButton jrb_badan_5;
    private javax.swing.JRadioButton jrb_badan_6;
    private javax.swing.JRadioButton jrb_badan_7;
    private javax.swing.JRadioButton jrb_badan_8;
    private javax.swing.JRadioButton jrb_badan_9;
    private javax.swing.JRadioButton jrb_bau_1;
    private javax.swing.JRadioButton jrb_bau_3;
    private javax.swing.JRadioButton jrb_bau_5;
    private javax.swing.JRadioButton jrb_bau_7;
    private javax.swing.JRadioButton jrb_bau_8;
    private javax.swing.JRadioButton jrb_bau_9;
    private javax.swing.JRadioButton jrb_daging_1;
    private javax.swing.JRadioButton jrb_daging_3;
    private javax.swing.JRadioButton jrb_daging_5;
    private javax.swing.JRadioButton jrb_daging_7;
    private javax.swing.JRadioButton jrb_daging_8;
    private javax.swing.JRadioButton jrb_daging_9;
    private javax.swing.JRadioButton jrb_insang_1;
    private javax.swing.JRadioButton jrb_insang_3;
    private javax.swing.JRadioButton jrb_insang_5;
    private javax.swing.JRadioButton jrb_insang_6;
    private javax.swing.JRadioButton jrb_insang_7;
    private javax.swing.JRadioButton jrb_insang_8;
    private javax.swing.JRadioButton jrb_insang_9;
    private javax.swing.JRadioButton jrb_mata_1;
    private javax.swing.JRadioButton jrb_mata_3;
    private javax.swing.JRadioButton jrb_mata_5;
    private javax.swing.JRadioButton jrb_mata_6;
    private javax.swing.JRadioButton jrb_mata_7;
    private javax.swing.JRadioButton jrb_mata_8;
    private javax.swing.JRadioButton jrb_mata_9;
    private javax.swing.JRadioButton jrb_tekstur_1;
    private javax.swing.JRadioButton jrb_tekstur_3;
    private javax.swing.JRadioButton jrb_tekstur_5;
    private javax.swing.JRadioButton jrb_tekstur_7;
    private javax.swing.JRadioButton jrb_tekstur_8;
    private javax.swing.JRadioButton jrb_tekstur_9;
    private javax.swing.JTextField jt_jumlahIkan;
    private javax.swing.JTable jtable_Ikan;
    private javax.swing.JFrame mata;
    private javax.swing.JFrame tekstur;
    // End of variables declaration//GEN-END:variables
}
