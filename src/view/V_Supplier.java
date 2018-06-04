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
        daging = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jrb_daging_9 = new javax.swing.JRadioButton();
        jrb_daging_8 = new javax.swing.JRadioButton();
        jrb_daging_7 = new javax.swing.JRadioButton();
        jrb_daging_5 = new javax.swing.JRadioButton();
        btn_lanjut6 = new javax.swing.JButton();
        jrb_daging_3 = new javax.swing.JRadioButton();
        jrb_daging_1 = new javax.swing.JRadioButton();
        tekstur = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jrb_tekstur_9 = new javax.swing.JRadioButton();
        jrb_tekstur_8 = new javax.swing.JRadioButton();
        jrb_tekstur_7 = new javax.swing.JRadioButton();
        jrb_tekstur_5 = new javax.swing.JRadioButton();
        btn_lanjut7 = new javax.swing.JButton();
        jrb_tekstur_3 = new javax.swing.JRadioButton();
        jrb_tekstur_1 = new javax.swing.JRadioButton();
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

        jLabel2.setText("Pilih Kriteria Bau Ikan");

        Bau.add(jrb_bau_9);
        jrb_bau_9.setText("Segar, Berbau rumput laut");

        Bau.add(jrb_bau_8);
        jrb_bau_8.setText("Segar, bau rumput laut mulai berkurang.");

        Bau.add(jrb_bau_7);
        jrb_bau_7.setText("Tawar, Netral.");

        Bau.add(jrb_bau_3);
        jrb_bau_3.setText("Berbau susu asam atau seperti susu kental.");

        Bau.add(jrb_bau_5);
        jrb_bau_5.setText("Berbau susu, belum ada bau asam, ada bau seperti ikan asin.");

        Bau.add(jrb_bau_1);
        jrb_bau_1.setText("Berbau seperti kentang rebus atau seperti logam.");

        btn_lanjut2.setText("Lanjut");

        javax.swing.GroupLayout bauLayout = new javax.swing.GroupLayout(bau.getContentPane());
        bau.getContentPane().setLayout(bauLayout);
        bauLayout.setHorizontalGroup(
            bauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bauLayout.createSequentialGroup()
                .addGroup(bauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bauLayout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addGroup(bauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jrb_bau_5)
                            .addComponent(jrb_bau_9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_bau_8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_bau_7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_bau_3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_bau_1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(bauLayout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addComponent(jLabel2))
                    .addGroup(bauLayout.createSequentialGroup()
                        .addGap(558, 558, 558)
                        .addComponent(btn_lanjut2)))
                .addContainerGap(557, Short.MAX_VALUE))
        );
        bauLayout.setVerticalGroup(
            bauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bauLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addComponent(jrb_bau_9)
                .addGap(18, 18, 18)
                .addComponent(jrb_bau_8)
                .addGap(20, 20, 20)
                .addComponent(jrb_bau_7)
                .addGap(18, 18, 18)
                .addComponent(jrb_bau_5)
                .addGap(18, 18, 18)
                .addComponent(jrb_bau_3)
                .addGap(18, 18, 18)
                .addComponent(jrb_bau_1)
                .addGap(18, 18, 18)
                .addComponent(btn_lanjut2)
                .addContainerGap(355, Short.MAX_VALUE))
        );

        mata.setSize(new java.awt.Dimension(1366, 800));

        jLabel3.setText("Pilih Kriteria Mata Ikan");

        Mata.add(jrb_mata_9);
        jrb_mata_9.setText("Cerah, bola mata menonjol, kornea jernih");

        Mata.add(jrb_mata_8);
        jrb_mata_8.setText("Cerah, bola mata rata, kornea jernih");

        Mata.add(jrb_mata_7);
        jrb_mata_7.setText("Agak cerah, bola mata rata, pupil agak keabu-abuan, kornea agak keruh ");

        Mata.add(jrb_mata_6);
        jrb_mata_6.setText("Bola mata agak cekung, pupil berubah keabu-abuan, kornea agak keruh. ");

        btn_lanjut3.setText("lanjut");

        jrb_mata_5.setText("Bola mata agak cekung, pupil keabu-abuan, kornea agak keruh. ");

        jrb_mata_3.setText("Bola mata cekung, pupil mulai berubah menjadi putihsusu, kornea keruh.");

        jrb_mata_1.setText("Bola mata cekung, pupil mulai berubah menjadi putihsusu, kornea keruh.");

        javax.swing.GroupLayout mataLayout = new javax.swing.GroupLayout(mata.getContentPane());
        mata.getContentPane().setLayout(mataLayout);
        mataLayout.setHorizontalGroup(
            mataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mataLayout.createSequentialGroup()
                .addGroup(mataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mataLayout.createSequentialGroup()
                        .addGap(616, 616, 616)
                        .addComponent(jLabel3))
                    .addGroup(mataLayout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(mataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_mata_8)
                            .addComponent(jrb_mata_9)
                            .addComponent(jrb_mata_7)
                            .addComponent(jrb_mata_6)
                            .addComponent(jrb_mata_5)
                            .addComponent(jrb_mata_3)
                            .addComponent(jrb_mata_1)))
                    .addGroup(mataLayout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addComponent(btn_lanjut3)))
                .addContainerGap(555, Short.MAX_VALUE))
        );
        mataLayout.setVerticalGroup(
            mataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mataLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addComponent(jrb_mata_9)
                .addGap(18, 18, 18)
                .addComponent(jrb_mata_8)
                .addGap(18, 18, 18)
                .addComponent(jrb_mata_7)
                .addGap(18, 18, 18)
                .addComponent(jrb_mata_6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_mata_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_mata_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_mata_1)
                .addGap(44, 44, 44)
                .addComponent(btn_lanjut3)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        insang.setSize(new java.awt.Dimension(1366, 800));

        jLabel4.setText("Pilih Kriteria Kenampakan Insang Ikan");

        Insang.add(jrb_insang_9);
        jrb_insang_9.setText("Warna merah cemerlang, tanpa lendir");

        Insang.add(jrb_insang_8);
        jrb_insang_8.setText("Warna merah kurang cemerlang, tanpa lendir.");

        Insang.add(jrb_insang_7);
        jrb_insang_7.setText("Warna merah agak kusam, tanpa lendir.");

        Insang.add(jrb_insang_6);
        jrb_insang_6.setText("Merah agak kusam, sedikit lendir");

        btn_lanjut4.setText("lanjut");

        Insang.add(jrb_insang_5);
        jrb_insang_5.setText("Mulai ada diskolorasi, merah kecoklatan, sedikit lendir, tanpa lendir.");

        jrb_insang_3.setText("Warna merah coklat, lendir tebal");

        Insang.add(jrb_insang_1);
        jrb_insang_1.setText("Warna merah coklat ada sedikit putih, lendir tebal.");

        javax.swing.GroupLayout insangLayout = new javax.swing.GroupLayout(insang.getContentPane());
        insang.getContentPane().setLayout(insangLayout);
        insangLayout.setHorizontalGroup(
            insangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insangLayout.createSequentialGroup()
                .addGroup(insangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insangLayout.createSequentialGroup()
                        .addGap(616, 616, 616)
                        .addComponent(jLabel4))
                    .addGroup(insangLayout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(insangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_insang_5)
                            .addComponent(jrb_insang_8)
                            .addComponent(jrb_insang_9)
                            .addComponent(jrb_insang_7)
                            .addComponent(jrb_insang_6)
                            .addComponent(jrb_insang_3)
                            .addComponent(jrb_insang_1)))
                    .addGroup(insangLayout.createSequentialGroup()
                        .addGap(562, 562, 562)
                        .addComponent(btn_lanjut4)))
                .addContainerGap(535, Short.MAX_VALUE))
        );
        insangLayout.setVerticalGroup(
            insangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insangLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(jrb_insang_9)
                .addGap(18, 18, 18)
                .addComponent(jrb_insang_8)
                .addGap(18, 18, 18)
                .addComponent(jrb_insang_7)
                .addGap(18, 18, 18)
                .addComponent(jrb_insang_6)
                .addGap(18, 18, 18)
                .addComponent(jrb_insang_5)
                .addGap(18, 18, 18)
                .addComponent(jrb_insang_3)
                .addGap(18, 18, 18)
                .addComponent(jrb_insang_1)
                .addGap(27, 27, 27)
                .addComponent(btn_lanjut4)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        badan.setSize(new java.awt.Dimension(1366, 800));

        jLabel5.setText("Pilih Kriteria lendir dan permukaan badan Ikan");

        Badan.add(jrb_badan_9);
        jrb_badan_9.setText("Lapisan lendir jernih, transparan, mengkilat cerah.");

        Badan.add(jrb_badan_8);
        jrb_badan_8.setText("Lapisan lendir jernih, transparan, cerah, belum ada perubahan warna.");

        Badan.add(jrb_badan_7);
        jrb_badan_7.setText("Lapisan lendir mulai agak keruh, warna agak putih, kurang transparan.");

        Badan.add(jrb_badan_6);
        jrb_badan_6.setText("Lapisan lendir mulai keruh, warna putih agak kusam, kurang transparan.");

        btn_lanjut5.setText("lanjut");

        Badan.add(jrb_badan_5);
        jrb_badan_5.setText("Lendir tebal menggumpal, mulai berubah warna putih, keruh.");

        Badan.add(jrb_badan_3);
        jrb_badan_3.setText("Lendir tebal menggumpal, berwarna putih kuning.");

        Badan.add(jrb_badan_1);
        jrb_badan_1.setText("Lendir tebal menggumpal, warna kuning kecoklatan.");

        javax.swing.GroupLayout badanLayout = new javax.swing.GroupLayout(badan.getContentPane());
        badan.getContentPane().setLayout(badanLayout);
        badanLayout.setHorizontalGroup(
            badanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(badanLayout.createSequentialGroup()
                .addGroup(badanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(badanLayout.createSequentialGroup()
                        .addGap(616, 616, 616)
                        .addComponent(jLabel5))
                    .addGroup(badanLayout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(badanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_badan_8)
                            .addComponent(jrb_badan_9)
                            .addComponent(jrb_badan_7)
                            .addComponent(jrb_badan_6)
                            .addComponent(jrb_badan_5)
                            .addComponent(jrb_badan_3)
                            .addComponent(jrb_badan_1))))
                .addContainerGap(486, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, badanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_lanjut5)
                .addGap(587, 587, 587))
        );
        badanLayout.setVerticalGroup(
            badanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(badanLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel5)
                .addGap(47, 47, 47)
                .addComponent(jrb_badan_9)
                .addGap(18, 18, 18)
                .addComponent(jrb_badan_8)
                .addGap(18, 18, 18)
                .addComponent(jrb_badan_7)
                .addGap(18, 18, 18)
                .addComponent(jrb_badan_6)
                .addGap(18, 18, 18)
                .addComponent(jrb_badan_5)
                .addGap(18, 18, 18)
                .addComponent(jrb_badan_3)
                .addGap(18, 18, 18)
                .addComponent(jrb_badan_1)
                .addGap(44, 44, 44)
                .addComponent(btn_lanjut5)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        daging.setSize(new java.awt.Dimension(1366, 800));

        jLabel6.setText("Pilih Kriteria tekstur daging pada Ikan");

        Daging.add(jrb_daging_9);
        jrb_daging_9.setText("Sayatan daging sangat cemerlang, spesifik jenis, tidak ada pemerahan sepanjang tulang belakang, dinding perut daging utuh.");

        Daging.add(jrb_daging_8);
        jrb_daging_8.setText("Sayatan daging cemerlang spesifik jenis, tidak ada pemerahan sepanjang tulang belakang, dinding perut utuh.");

        Daging.add(jrb_daging_7);
        jrb_daging_7.setText("Sayatan daging sedikit kurang cemerlang, spesifik jenis, tidak ada pemerahan sepanjang tulang belakang, dinding perut daging utuh.");

        Daging.add(jrb_daging_5);
        jrb_daging_5.setText("Sayatan daging mulai pudar, banyak pemerahan sepanjang tulang belakang, dinding perut agak lunak.");

        btn_lanjut6.setText("lanjut");

        jrb_daging_3.setText("Sayatan daging kusam, warna merah jelas sekali sepanjang tulang belakang, dinding perut lunak.");

        jrb_daging_1.setText("Sayatan daging kusam sekali, warna merah jelas sekali sepanjang tulang belakang, dinding perut sangat lunak.");

        javax.swing.GroupLayout dagingLayout = new javax.swing.GroupLayout(daging.getContentPane());
        daging.getContentPane().setLayout(dagingLayout);
        dagingLayout.setHorizontalGroup(
            dagingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dagingLayout.createSequentialGroup()
                .addGroup(dagingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dagingLayout.createSequentialGroup()
                        .addGap(616, 616, 616)
                        .addComponent(jLabel6))
                    .addGroup(dagingLayout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(dagingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_daging_8)
                            .addComponent(jrb_daging_9)
                            .addComponent(jrb_daging_7)
                            .addComponent(jrb_daging_5)
                            .addComponent(jrb_daging_3)
                            .addComponent(jrb_daging_1))))
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dagingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_lanjut6)
                .addGap(614, 614, 614))
        );
        dagingLayout.setVerticalGroup(
            dagingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dagingLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel6)
                .addGap(47, 47, 47)
                .addComponent(jrb_daging_9)
                .addGap(18, 18, 18)
                .addComponent(jrb_daging_8)
                .addGap(18, 18, 18)
                .addComponent(jrb_daging_7)
                .addGap(18, 18, 18)
                .addComponent(jrb_daging_5)
                .addGap(18, 18, 18)
                .addComponent(jrb_daging_3)
                .addGap(18, 18, 18)
                .addComponent(jrb_daging_1)
                .addGap(99, 99, 99)
                .addComponent(btn_lanjut6)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        tekstur.setSize(new java.awt.Dimension(1366, 800));

        jLabel7.setText("Pilih Kriteria Keadaan Daging");

        Perut.add(jrb_tekstur_9);
        jrb_tekstur_9.setText("Padat, elastis bila ditekan dengan jari, sulit menyobek daging dari tulang belakang.");

        Perut.add(jrb_tekstur_8);
        jrb_tekstur_8.setText("Agak padat, elastis bila ditekan dengan jari, sulit menyobek daging dari tulang belakang.");

        Perut.add(jrb_tekstur_7);
        jrb_tekstur_7.setText("Agak padat, agak elastis bila ditekan dengan jari, sulit menyobek daging dari tulang belakang.");

        Perut.add(jrb_tekstur_5);
        jrb_tekstur_5.setText("Agak lunak, kurang elastis bila ditekan dengan jari, agak mudah menyobek daging dari tulang belakang.");

        btn_lanjut7.setText("lanjut");

        jrb_tekstur_3.setText("Lunak, bekas jari terlihat bila ditekan, mudah menyobek daging dari tulang belakang");

        jrb_tekstur_1.setText("Sangat lunak, bekas jari tidak hilang bila ditekan, mudah sekali menyobek daging dari tulang belakang.");

        javax.swing.GroupLayout teksturLayout = new javax.swing.GroupLayout(tekstur.getContentPane());
        tekstur.getContentPane().setLayout(teksturLayout);
        teksturLayout.setHorizontalGroup(
            teksturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teksturLayout.createSequentialGroup()
                .addGroup(teksturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teksturLayout.createSequentialGroup()
                        .addGap(621, 621, 621)
                        .addComponent(jLabel7))
                    .addGroup(teksturLayout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(teksturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_tekstur_1)
                            .addComponent(jrb_tekstur_8)
                            .addComponent(jrb_tekstur_9)
                            .addComponent(jrb_tekstur_7)
                            .addComponent(jrb_tekstur_5)
                            .addComponent(jrb_tekstur_3)))
                    .addGroup(teksturLayout.createSequentialGroup()
                        .addGap(554, 554, 554)
                        .addComponent(btn_lanjut7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        teksturLayout.setVerticalGroup(
            teksturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teksturLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel7)
                .addGap(46, 46, 46)
                .addComponent(jrb_tekstur_9)
                .addGap(18, 18, 18)
                .addComponent(jrb_tekstur_8)
                .addGap(18, 18, 18)
                .addComponent(jrb_tekstur_7)
                .addGap(18, 18, 18)
                .addComponent(jrb_tekstur_5)
                .addGap(18, 18, 18)
                .addComponent(jrb_tekstur_3)
                .addGap(18, 18, 18)
                .addComponent(jrb_tekstur_1)
                .addGap(34, 34, 34)
                .addComponent(btn_lanjut7)
                .addContainerGap(342, Short.MAX_VALUE))
        );

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

        jLabel1.setText("Masukkan Kuantitas Ikan");

        btn_lanjut1.setText("Lanjut");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(btn_lanjut1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jt_jumlahIkan, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabel1)))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_jumlahIkan, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_lanjut1)
                .addContainerGap(322, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
