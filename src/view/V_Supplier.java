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
    int a = 0 ;
    if (jrb_10.isSelected()) {
        a = 10 ;
    }else if (jrb_9.isSelected()) {
        a=9;
    }else if (jrb_8.isSelected()) {
        a=8;
    }else if (jrb_7.isSelected()) {
        a=7;
    }else if (jrb_6.isSelected()) {
        a=6;
    }else if (jrb_5.isSelected()) {
        a=5;
    }else if (jrb_4.isSelected()) {
        a=4;
    }else if (jrb_3.isSelected()) {
        a=3;
    }else if (jrb_2.isSelected()) {
        a=2;
    }else if (jrb_0.isSelected()) {
        a=0;
    }
    return a ;
}
public int getmata() {
    int a = 0 ;
    if (jrb_mata_10.isSelected()) {
        a=10 ;
    }else if (jrb_mata_6.isSelected()) {
        a=6;
    }else if (jrb_mata_4.isSelected()) {
        a=4;
    }else if (jrb_mata_0.isSelected()) {
        a=0 ;
    }
    return a ;
}
public int getinsang() {
    int a = 0 ;
    if (jrb_insang_10.isSelected()) {
        a=10 ;
    }else if (jrb_insang_6.isSelected()) {
        a=6;
    }else if (jrb_insang_4.isSelected()) {
        a=4;
    }else if (jrb_insang_0.isSelected()) {
        a=0 ;
    }
    return a ;
}
public int getbadan() {
    int a = 0 ;
    if (jrb_badan_10.isSelected()) {
        a=10 ;
    }else if (jrb_badan_6.isSelected()) {
        a=6;
    }else if (jrb_badan_4.isSelected()) {
        a=4;
    }else if (jrb_badan_0.isSelected()) {
        a=0 ;
    }
    return a ;
}
public int getdaging() {
    int a = 0 ;
    if (jrb_daging_10.isSelected()) {
        a=10 ;
    }else if (jrb_daging_6.isSelected()) {
        a=6;
    }else if (jrb_daging_4.isSelected()) {
        a=4;
    }else if (jrb_daging_0.isSelected()) {
        a=0 ;
    }
    return a ;
}
public int getperut() {
    int a = 0 ;
    if (jrb_perut_10.isSelected()) {
        a=10 ;
    }else if (jrb_perut_6.isSelected()) {
        a=6;
    }else if (jrb_perut_4.isSelected()) {
        a=4;
    }else if (jrb_perut_0.isSelected()) {
        a=0 ;
    }
    return a ;
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
    return bau ;
}
public JFrame getFrameMata() {
    return mata ;
}
public JFrame getFrameInsang() {
    return insang ;
}
public JFrame getFrameBadan() {
    return badan ;
}
public JFrame getFrameDaging() {
    return daging ;
}
public JFrame getFramePerut() {
    return perut ;
}
public JTextField getKuantitas () {
    return jt_jumlahIkan ;
}
public JTable getTable () {
    return jtable_Ikan;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bau = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jrb_10 = new javax.swing.JRadioButton();
        jrb_9 = new javax.swing.JRadioButton();
        jrb_8 = new javax.swing.JRadioButton();
        jrb_6 = new javax.swing.JRadioButton();
        jrb_4 = new javax.swing.JRadioButton();
        jrb_2 = new javax.swing.JRadioButton();
        jrb_0 = new javax.swing.JRadioButton();
        jrb_7 = new javax.swing.JRadioButton();
        jrb_3 = new javax.swing.JRadioButton();
        jrb_5 = new javax.swing.JRadioButton();
        btn_lanjut2 = new javax.swing.JButton();
        mata = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jrb_mata_10 = new javax.swing.JRadioButton();
        jrb_mata_6 = new javax.swing.JRadioButton();
        jrb_mata_4 = new javax.swing.JRadioButton();
        jrb_mata_0 = new javax.swing.JRadioButton();
        btn_lanjut3 = new javax.swing.JButton();
        insang = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jrb_insang_10 = new javax.swing.JRadioButton();
        jrb_insang_6 = new javax.swing.JRadioButton();
        jrb_insang_4 = new javax.swing.JRadioButton();
        jrb_insang_0 = new javax.swing.JRadioButton();
        btn_lanjut4 = new javax.swing.JButton();
        badan = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jrb_badan_10 = new javax.swing.JRadioButton();
        jrb_badan_6 = new javax.swing.JRadioButton();
        jrb_badan_4 = new javax.swing.JRadioButton();
        jrb_badan_0 = new javax.swing.JRadioButton();
        btn_lanjut5 = new javax.swing.JButton();
        daging = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jrb_daging_10 = new javax.swing.JRadioButton();
        jrb_daging_6 = new javax.swing.JRadioButton();
        jrb_daging_4 = new javax.swing.JRadioButton();
        jrb_daging_0 = new javax.swing.JRadioButton();
        btn_lanjut6 = new javax.swing.JButton();
        perut = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jrb_perut_10 = new javax.swing.JRadioButton();
        jrb_perut_6 = new javax.swing.JRadioButton();
        jrb_perut_4 = new javax.swing.JRadioButton();
        jrb_perut_0 = new javax.swing.JRadioButton();
        btn_lanjut7 = new javax.swing.JButton();
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

        Bau.add(jrb_10);
        jrb_10.setText("Segar, Berbau rumput laut");

        Bau.add(jrb_9);
        jrb_9.setText("Segar, bau rumput laut mulai berkurang.");

        Bau.add(jrb_8);
        jrb_8.setText("Tawar, Netral.");

        Bau.add(jrb_6);
        jrb_6.setText("Berbau susu asam atau seperti susu kental.");

        Bau.add(jrb_4);
        jrb_4.setText("Berbau asam asetat, rumput atau seperti sabun.");

        Bau.add(jrb_2);
        jrb_2.setText("Bau ammonia kuat, ada bau H2S.");

        Bau.add(jrb_0);
        jrb_0.setText("Bau Busuk, bau indol.");

        Bau.add(jrb_7);
        jrb_7.setText("Berbau susu, belum ada bau asam, ada bau seperti ikan asin.");

        Bau.add(jrb_3);
        jrb_3.setText("Bau ammonia mulai timbul.");

        Bau.add(jrb_5);
        jrb_5.setText("Berbau seperti kentang rebus atau seperti logam.");

        btn_lanjut2.setText("Lanjut");

        javax.swing.GroupLayout bauLayout = new javax.swing.GroupLayout(bau.getContentPane());
        bau.getContentPane().setLayout(bauLayout);
        bauLayout.setHorizontalGroup(
            bauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bauLayout.createSequentialGroup()
                .addGroup(bauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bauLayout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addGroup(bauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_0)
                            .addComponent(jrb_5)
                            .addGroup(bauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jrb_7)
                                .addComponent(jrb_10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jrb_9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jrb_8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jrb_6, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jrb_4)
                            .addComponent(jrb_3)
                            .addComponent(jrb_2)))
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
                .addComponent(jrb_10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_9)
                .addGap(5, 5, 5)
                .addComponent(jrb_8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_0)
                .addGap(18, 18, 18)
                .addComponent(btn_lanjut2)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        mata.setSize(new java.awt.Dimension(1366, 800));

        jLabel3.setText("Pilih Kriteria Mata Ikan");

        Mata.add(jrb_mata_10);
        jrb_mata_10.setText("Cerah, pupil hitam menonjol dengan kornea jernih.");

        Mata.add(jrb_mata_6);
        jrb_mata_6.setText("Bola mata agak cekung, pupil berubah abu-abu, kornea agak keruh.");

        Mata.add(jrb_mata_4);
        jrb_mata_4.setText("Bola mata agak cekung, pupil putih susu, kornea keruh");

        Mata.add(jrb_mata_0);
        jrb_mata_0.setText("Bola mata dan pupil tenggelam, tertutuo lendir kuning tebal.");

        btn_lanjut3.setText("lanjut");

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
                            .addComponent(jrb_mata_6)
                            .addComponent(jrb_mata_10)
                            .addComponent(jrb_mata_4)
                            .addComponent(jrb_mata_0)))
                    .addGroup(mataLayout.createSequentialGroup()
                        .addGap(555, 555, 555)
                        .addComponent(btn_lanjut3)))
                .addContainerGap(585, Short.MAX_VALUE))
        );
        mataLayout.setVerticalGroup(
            mataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mataLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addComponent(jrb_mata_10)
                .addGap(18, 18, 18)
                .addComponent(jrb_mata_6)
                .addGap(18, 18, 18)
                .addComponent(jrb_mata_4)
                .addGap(18, 18, 18)
                .addComponent(jrb_mata_0)
                .addGap(18, 18, 18)
                .addComponent(btn_lanjut3)
                .addContainerGap(444, Short.MAX_VALUE))
        );

        insang.setSize(new java.awt.Dimension(1366, 800));

        jLabel4.setText("Pilih Kriteria Kenampakan Insang Ikan");

        Insang.add(jrb_insang_10);
        jrb_insang_10.setText("Warna merah cemerlang tanpa adanya lendir.");

        Insang.add(jrb_insang_6);
        jrb_insang_6.setText("Mulai terjadi perubahan warna merah muda sampai merah coklat, terdapat sedikit lendir, bau asam mulai nyata.");

        Insang.add(jrb_insang_4);
        jrb_insang_4.setText("Perubahan warna lebih nyata. Warna merah coklat, lendir tebal, bau kuat.");

        Insang.add(jrb_insang_0);
        jrb_insang_0.setText("Warna Merah coklat, merah, atau abu-abu. Tertutup lendir tebal, berbau asam atau busuk.");

        btn_lanjut4.setText("lanjut");

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
                            .addComponent(jrb_insang_6)
                            .addComponent(jrb_insang_10)
                            .addComponent(jrb_insang_4)
                            .addComponent(jrb_insang_0)))
                    .addGroup(insangLayout.createSequentialGroup()
                        .addGap(555, 555, 555)
                        .addComponent(btn_lanjut4)))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        insangLayout.setVerticalGroup(
            insangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insangLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(jrb_insang_10)
                .addGap(18, 18, 18)
                .addComponent(jrb_insang_6)
                .addGap(18, 18, 18)
                .addComponent(jrb_insang_4)
                .addGap(18, 18, 18)
                .addComponent(jrb_insang_0)
                .addGap(18, 18, 18)
                .addComponent(btn_lanjut4)
                .addContainerGap(444, Short.MAX_VALUE))
        );

        badan.setSize(new java.awt.Dimension(1366, 800));

        jLabel5.setText("Pilih Kriteria lendir dan permukaan badan Ikan");

        Badan.add(jrb_badan_10);
        jrb_badan_10.setText("Lapisan lendir jernih, tembus cahaya (transparan), mengkilat cerah, belum ada perubahan warna, berbau segar.");

        Badan.add(jrb_badan_6);
        jrb_badan_6.setText("Lendir dipernukaan mulai keruh, warnanya agak putih susu, mulai suram. Mulai terjadi bau tidak sedap.");

        Badan.add(jrb_badan_4);
        jrb_badan_4.setText("Lendir tebal terkadang menggumpal, mulai timbul perubahan warna karena aktifitas bakteri. Bau tidak enak semakin kuat.");

        Badan.add(jrb_badan_0);
        jrb_badan_0.setText("Lendir berwarna kekuning-kuningan, coklat, tebal, warna kusam. Bau menusuk kuat, terjadi pengeringan lendir karena udara.");

        btn_lanjut5.setText("lanjut");

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
                            .addComponent(jrb_badan_6)
                            .addComponent(jrb_badan_10)
                            .addComponent(jrb_badan_4)
                            .addComponent(jrb_badan_0)))
                    .addGroup(badanLayout.createSequentialGroup()
                        .addGap(555, 555, 555)
                        .addComponent(btn_lanjut5)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        badanLayout.setVerticalGroup(
            badanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(badanLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel5)
                .addGap(47, 47, 47)
                .addComponent(jrb_badan_10)
                .addGap(18, 18, 18)
                .addComponent(jrb_badan_6)
                .addGap(18, 18, 18)
                .addComponent(jrb_badan_4)
                .addGap(18, 18, 18)
                .addComponent(jrb_badan_0)
                .addGap(18, 18, 18)
                .addComponent(btn_lanjut5)
                .addContainerGap(444, Short.MAX_VALUE))
        );

        daging.setSize(new java.awt.Dimension(1366, 800));

        jLabel6.setText("Pilih Kriteria tekstur daging pada Ikan");

        Daging.add(jrb_daging_10);
        jrb_daging_10.setText("Padat. Lentur, jika ditekan dengan jari bekasnya segera hilang, sulit menyobek dagingnya dari tulang belakangnya. Kadang-kadang agak lunak sesuai dengan jenisnya.");

        Daging.add(jrb_daging_6);
        jrb_daging_6.setText("Daging agak lunak, jika ditekan dengan jari belum ada bekasnya.");

        Daging.add(jrb_daging_4);
        jrb_daging_4.setText("Lunak. Bekas tekanan jari lama hilangnya. Sisik mudah dilepaskan.");

        Daging.add(jrb_daging_0);
        jrb_daging_0.setText("Sangat lunak. Bekas jari tak mudah hilang. Daging mudah disobek dari tulang belakangnya.");

        btn_lanjut6.setText("lanjut");

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
                            .addComponent(jrb_daging_6)
                            .addComponent(jrb_daging_10)
                            .addComponent(jrb_daging_4)
                            .addComponent(jrb_daging_0)))
                    .addGroup(dagingLayout.createSequentialGroup()
                        .addGap(555, 555, 555)
                        .addComponent(btn_lanjut6)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        dagingLayout.setVerticalGroup(
            dagingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dagingLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel6)
                .addGap(47, 47, 47)
                .addComponent(jrb_daging_10)
                .addGap(18, 18, 18)
                .addComponent(jrb_daging_6)
                .addGap(18, 18, 18)
                .addComponent(jrb_daging_4)
                .addGap(18, 18, 18)
                .addComponent(jrb_daging_0)
                .addGap(18, 18, 18)
                .addComponent(btn_lanjut6)
                .addContainerGap(444, Short.MAX_VALUE))
        );

        perut.setSize(new java.awt.Dimension(1366, 800));

        jLabel7.setText("Pilih Kriteria Keadaan Daging dan Perut pada Ikan");

        Perut.add(jrb_perut_10);
        jrb_perut_10.setText("Sayatan daging berwarna cemerlang, tak ada warna merah sepanjang tulang belakang, perutnya utuh dan belum ada perubahan warna. Ginjal merah cerah, dinding perut utuh, isi perut berbau segar.");

        Perut.add(jrb_perut_6);
        jrb_perut_6.setText("Sayatan daging cerah, dinding perut mulai lembek dan timbul perubahan warna. Warna ginjal pudar, bau tidak segar mulai timbul.");

        Perut.add(jrb_perut_4);
        jrb_perut_4.setText("Sayatan daging mulai berkurang kecerahannya, lunak dan terdapat warna merah sepanjang tulang belakang. Rusuk sudah lembek, bau isi perut makin kuat.");

        Perut.add(jrb_perut_0);
        jrb_perut_0.setText("Daging warnanya pudar. Terdapat warna merah sepanjang tulang belakang. Dinding perut mulai hancur, isi perutnya hancur dan berwarna seperti tanah, berbau busuk.");

        btn_lanjut7.setText("lanjut");

        javax.swing.GroupLayout perutLayout = new javax.swing.GroupLayout(perut.getContentPane());
        perut.getContentPane().setLayout(perutLayout);
        perutLayout.setHorizontalGroup(
            perutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perutLayout.createSequentialGroup()
                .addGroup(perutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perutLayout.createSequentialGroup()
                        .addGap(616, 616, 616)
                        .addComponent(jLabel7))
                    .addGroup(perutLayout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(perutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_perut_6)
                            .addComponent(jrb_perut_10)
                            .addComponent(jrb_perut_4)
                            .addComponent(jrb_perut_0)))
                    .addGroup(perutLayout.createSequentialGroup()
                        .addGap(555, 555, 555)
                        .addComponent(btn_lanjut7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        perutLayout.setVerticalGroup(
            perutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perutLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel7)
                .addGap(47, 47, 47)
                .addComponent(jrb_perut_10)
                .addGap(18, 18, 18)
                .addComponent(jrb_perut_6)
                .addGap(18, 18, 18)
                .addComponent(jrb_perut_4)
                .addGap(18, 18, 18)
                .addComponent(jrb_perut_0)
                .addGap(18, 18, 18)
                .addComponent(btn_lanjut7)
                .addContainerGap(444, Short.MAX_VALUE))
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
    private javax.swing.JRadioButton jrb_0;
    private javax.swing.JRadioButton jrb_10;
    private javax.swing.JRadioButton jrb_2;
    private javax.swing.JRadioButton jrb_3;
    private javax.swing.JRadioButton jrb_4;
    private javax.swing.JRadioButton jrb_5;
    private javax.swing.JRadioButton jrb_6;
    private javax.swing.JRadioButton jrb_7;
    private javax.swing.JRadioButton jrb_8;
    private javax.swing.JRadioButton jrb_9;
    private javax.swing.JRadioButton jrb_badan_0;
    private javax.swing.JRadioButton jrb_badan_10;
    private javax.swing.JRadioButton jrb_badan_4;
    private javax.swing.JRadioButton jrb_badan_6;
    private javax.swing.JRadioButton jrb_daging_0;
    private javax.swing.JRadioButton jrb_daging_10;
    private javax.swing.JRadioButton jrb_daging_4;
    private javax.swing.JRadioButton jrb_daging_6;
    private javax.swing.JRadioButton jrb_insang_0;
    private javax.swing.JRadioButton jrb_insang_10;
    private javax.swing.JRadioButton jrb_insang_4;
    private javax.swing.JRadioButton jrb_insang_6;
    private javax.swing.JRadioButton jrb_mata_0;
    private javax.swing.JRadioButton jrb_mata_10;
    private javax.swing.JRadioButton jrb_mata_4;
    private javax.swing.JRadioButton jrb_mata_6;
    private javax.swing.JRadioButton jrb_perut_0;
    private javax.swing.JRadioButton jrb_perut_10;
    private javax.swing.JRadioButton jrb_perut_4;
    private javax.swing.JRadioButton jrb_perut_6;
    private javax.swing.JTextField jt_jumlahIkan;
    private javax.swing.JTable jtable_Ikan;
    private javax.swing.JFrame mata;
    private javax.swing.JFrame perut;
    // End of variables declaration//GEN-END:variables
}
