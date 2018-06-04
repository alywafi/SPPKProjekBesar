/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.M_Ikan;
import view.V_PG_Penjualan;

/**
 *
 * @author USER
 */
public class C_Pgudang {

    V_PG_Penjualan view;
    M_Ikan model;
    int id;

    public C_Pgudang(V_PG_Penjualan v, M_Ikan m, int id) throws SQLException {
        this.view = v;
        this.model = m;
        this.id = id;
        hitung();
        view.setVisible(true);
        view.getTableIkan().setModel(model.getDataHariIni());
        view.getBtnBeli().addActionListener(new Beli());
    }

    public void hitung() throws SQLException {
        float[][] data = model.getDataMoora();
        DecimalFormat df = new DecimalFormat("#.####");
        //normalisasi
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < 7; j++) {
                float x = 0;
                for (int k = 1; k < 7; k++) {
                    x += data[i][k] * data[i][k];
                }
                x = (float) Math.sqrt(x);
                data[i][j] = data[i][j] / x;
            }
        }
        //dikalikan dengan bobot
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i == 1) {
                    data[j][i] = (float) (data[j][i] * 0.2);

                } else {
                    data[j][i] = (float) (data[j][i] * 0.16);
                }
            }
        }
        //tahap akhir
        float[] skor = new float[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < 7; j++) {
                skor[i] += data[i][j];
            }
            System.out.println(skor[i]);
            if (model.updateSkor(skor[i], (int) data[i][0])) {
                System.out.println("wwkwkwkwk");
            } else {
                System.out.println("gagalsasdjk");
            }

        }
    }

    private class Beli implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int d[] = new int[2];
            d[0] = Integer.valueOf(view.getIdFromTable());
            System.out.println(d[0]);
            d[1] = id;
            try {
                if (model.insertBeli(d)) {
                    System.out.println("pembelian sukses");
                } else {
                    System.out.println("pembelian gagal");
                }
            } catch (SQLException ex) {
                Logger.getLogger(C_Pgudang.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private class SemuaIkan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                view.getTableIkan().setModel(model.getData());
            } catch (SQLException ex) {
                Logger.getLogger(C_Pgudang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class IkanHariIni implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                view.getTableIkan().setModel(model.getDataHariIni());
            } catch (SQLException ex) {
                Logger.getLogger(C_Pgudang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
