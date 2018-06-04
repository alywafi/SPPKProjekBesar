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
import view.V_Supplier;

/**
 *
 * @author USER
 */
public class C_Supplier {

    V_Supplier view;
    M_Ikan model;
    int idsup;
    public float ikan[] = new float[9];

    public C_Supplier(V_Supplier v, M_Ikan m, int id) throws SQLException {
        this.view = v;
        this.model = m;
        this.idsup = id;

        ikan[0] = idsup;
        view.setVisible(true);
        
        view.getTable().setModel(model.getDataWithID(id));

        view.getBtnnext1().addActionListener(new lanjut1());
        view.getBtnnext2().addActionListener(new lanjut2());
        view.getBtnnext3().addActionListener(new lanjut3());
        view.getBtnnext4().addActionListener(new lanjut4());
        view.getBtnnext5().addActionListener(new lanjut5());
        view.getBtnnext6().addActionListener(new lanjut6());
        view.getBtnnext7().addActionListener(new lanjut7());

    }

    private class lanjut7 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getFramePerut().dispose();
            ikan[8] = (float) (view.gettekstur() );
            view.getKuantitas().setText(" ");

            try {
                if (model.insertData(ikan)) {
                    System.out.println("sukses");   
                }else {
                    System.out.println("gagal");
                }
            } catch (SQLException ex) {
                Logger.getLogger(C_Supplier.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    private class lanjut6 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getFrameDaging().dispose();
            ikan[7] = (float) (view.getdaging() );
            view.getFramePerut().setVisible(true);
        }
    }

    private class lanjut5 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getFrameBadan().dispose();
            ikan[6] = (float) (view.getbadan());
            view.getFrameDaging().setVisible(true);
        }
    }

    private class lanjut4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getFrameInsang().dispose();
            ikan[5] = (float) (view.getinsang());
            view.getFrameBadan().setVisible(true);
        }
    }

    private class lanjut3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getFrameMata().dispose();
            ikan[4] = (float) (view.getmata());
            view.getFrameInsang().setVisible(true);
        }
    }

    private class lanjut2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getFrameBau().dispose();
            ikan[3] = (float) (view.getbau());
            System.out.println(ikan[3]);
            view.getFrameMata().setVisible(true);
        }
    }

    private class lanjut1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ikan[2] = Integer.valueOf(view.getKuantitas().getText());
            System.out.println(ikan[2]);
            view.getFrameBau().setVisible(true);
        }
    }
}
