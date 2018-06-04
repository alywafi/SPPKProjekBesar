/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.M_Ikan;
import model.M_Kriteria;
import view.V_PG_Keterangan;
import view.V_PG_Kriteria;
import view.V_PG_Penjualan;

/**
 *
 * @author USER
 */
public class C_Kriteria {

    V_PG_Kriteria view;
    M_Kriteria model;
    int IDpeg ;

    public C_Kriteria(V_PG_Kriteria v, M_Kriteria m , int IDpeg) throws SQLException {
        this.view = v;
        this.model = m;
        this.IDpeg = IDpeg ;

        view.setVisible(true);
        view.get_EditIdKriteria().setEnabled(false);
        view.tampilEdit(false);

        view.getTable_Kriteria().setModel(model.getKriteria());

        view.getBtn_keluar().addActionListener(new KeluarAction());
        view.getBtn_Penjualan().addActionListener(new PenjualanAction());

        view.getBtn_EditKriteria().addActionListener(new EditAction());
        view.getBtn_OkEditKriteria().addActionListener(new OkEditAction());
        view.getBtn_BatalEditKriteria().addActionListener(new BatalEditAction());

        view.getBtn_OkTambahKriteria().addActionListener(new OkTambahAction());

        view.getBtn_LihatKeterangan().addActionListener(new KeteranganAction());
    }

    public void setNullEdit() {
        view.get_EditIdKriteria().setText(" ");
        view.get_EditBobot().setText(" ");
        view.get_EditNamaKriteria().setText(" ");
    }

    private class KeteranganAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new C_Keterangan(new V_PG_Keterangan(), new M_Kriteria(), Integer.valueOf(view.getIdFromTable(0)),IDpeg);
            } catch (SQLException ex) {
                Logger.getLogger(C_Kriteria.class.getName()).log(Level.SEVERE, null, ex);
            }
            view.dispose();
        }
    }

    private class OkTambahAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String[] data = new String[4];
            data[0] = view.get_TambahNamaKriteria().getText();
            data[1] = view.get_TambahBobot().getText();
            if (view.get_TambahTipeNilai().getSelectedItem() == "Cost") {
                data[2] = String.valueOf(-1);
            } else {
                data[2] = String.valueOf(1);
            }
            data[3] = (String) view.get_TambahJenisInputan().getSelectedItem();

            try {
                if (model.insertKriteria(data)) {
                    System.out.println("wkwkwk");
                } else {
                    System.out.println("gagal");
                }

            } catch (SQLException ex) {
                Logger.getLogger(C_Kriteria.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                view.getTable_Kriteria().setModel(model.getKriteria());
            } catch (SQLException ex) {
                Logger.getLogger(C_Kriteria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class BatalEditAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.tampilEdit(false);
            setNullEdit();
        }

    }

    private class OkEditAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String[] data = new String[3];
            data[0] = view.get_EditNamaKriteria().getText();
            data[1] = view.get_EditBobot().getText();
            if (view.get_EditTipeNilai().getSelectedItem() == "Cost") {
                data[2] = String.valueOf(-1);
            } else {
                data[2] = String.valueOf(1);
            }

            try {
                if (model.updateKriteria(data, Integer.valueOf(view.get_EditIdKriteria().getText()))) {
                    System.out.println("wkwkwk");
                } else {
                    System.out.println("gagal");
                }

            } catch (SQLException ex) {
                Logger.getLogger(C_Kriteria.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                view.getTable_Kriteria().setModel(model.getKriteria());
            } catch (SQLException ex) {
                Logger.getLogger(C_Kriteria.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private class EditAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            view.tampilEdit(true);
            view.get_EditIdKriteria().setText(view.getIdFromTable(0));
            view.get_EditNamaKriteria().setText(view.getIdFromTable(1));
            view.get_EditBobot().setText(view.getIdFromTable(2));

        }

    }

    private class PenjualanAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new C_Pgudang(new V_PG_Penjualan(), new M_Ikan(), IDpeg) ;
            } catch (SQLException ex) {
                Logger.getLogger(C_Kriteria.class.getName()).log(Level.SEVERE, null, ex);
            }
            view.dispose();
        
        }

    }

    private class KeluarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }
}
