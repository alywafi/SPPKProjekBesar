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
import model.M_Kriteria;
import view.V_PG_Keterangan;
import view.V_PG_Kriteria;

/**
 *
 * @author USER
 */
public class C_Keterangan {

    V_PG_Keterangan view;
    M_Kriteria model;
    int ID;
    int idpeg;

    public C_Keterangan(V_PG_Keterangan v, M_Kriteria m, int id, int idpeg) throws SQLException {
        this.view = v;
        this.model = m;
        this.ID = id;
        this.idpeg = idpeg ;

        view.setVisible(true);
        view.getTable_Keterangan().setModel(model.getKeterangan(id));
        view.tampilEdit(false);

        view.getBtn_keluar().addActionListener(new KeluarAction());
        view.getBtn_OkTambahKeterangan().addActionListener(new TambahKeteranganAction());
        view.getBtn_EditKeterangan().addActionListener(new EditAction());
        view.getBtn_OkEditKeterangan().addActionListener(new OkEditAction());
        view.getBtn_BatalEditKeterangan().addActionListener(new BatalEditAction());

    }

    public void setNullEdit() {
        view.get_EditIdKeterangan().setText(" ");
        view.get_EditIdKriteria().setText(" ");
        view.get_EditBobot().setText(" ");
        view.get_EditDetailKeterangan().setText(" ");
    }

    private class BatalEditAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setNullEdit();
            view.tampilEdit(false);
        }
    }

    private class OkEditAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String[] data = new String[2];
            data [0] = view.get_EditDetailKeterangan().getText();
            data [1] = view.get_EditBobot().getText();
            
            try {
                if (model.updateKeterangan(data, Integer.valueOf(view.get_EditIdKeterangan().getText()))) {
                    System.out.println("wkwkwk");
                }else {
                    System.out.println("gagal");
                }
            } catch (SQLException ex) {
                Logger.getLogger(C_Keterangan.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                view.getTable_Keterangan().setModel(model.getKeterangan(ID));
            } catch (SQLException ex) {
                Logger.getLogger(C_Keterangan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class EditAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.tampilEdit(true);
            view.get_EditIdKeterangan().setText(view.getIdFromTable(0));
            view.get_EditDetailKeterangan().setText(view.getIdFromTable(1));
            view.get_EditBobot().setText(view.getIdFromTable(2));
            view.get_EditIdKriteria().setText(String.valueOf(ID));
        }
    }

    private class TambahKeteranganAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String[] data = new String[2];
            data[0] = view.get_TambahDetailKeterangan().getText();
            data[1] = view.get_TambahBobot().getText();
            try {
                if (model.insertKeterangan(data, ID)) {
                    System.out.println("wkwkwk");
                }else{
                System.out.println("gagal");
                }
            } catch (SQLException ex) {
                Logger.getLogger(C_Keterangan.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                view.getTable_Keterangan().setModel(model.getKeterangan(ID));
            } catch (SQLException ex) {
                Logger.getLogger(C_Keterangan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class KeluarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new C_Kriteria(new V_PG_Kriteria(), new M_Kriteria(),idpeg);
            } catch (SQLException ex) {
                Logger.getLogger(C_Keterangan.class.getName()).log(Level.SEVERE, null, ex);
            }
            view.dispose();
        }

    }

}
