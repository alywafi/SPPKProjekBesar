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
import model.M_User;
import view.V_PG_Kriteria;
import view.V_PG_Penjualan;
import view.V_Supplier;
import view.V_login;

/**
 *
 * @author USER
 */
public class C_Login {

    V_login view;
    M_User model;

    public C_Login(V_login v, M_User m) {
        this.view = v;
        this.model = m;

        view.setVisible(true);
        view.get_btnlogin().addActionListener(new LoginClick());
    }

    private class LoginClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String data[] = new String[4];
            try {
                data = model.getID(view.getNama().getText());
            } catch (SQLException ex) {
                Logger.getLogger(C_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (view.getNama().getText().equals(data[1])) {
                if (view.getPassword().getText().equals(data[3])) {
                    System.out.println(data[2]);
                    if (data[2].equalsIgnoreCase("pgudang")) {
                        try {
//                            new C_Kriteria(new V_PG_Kriteria(), new M_Kriteria());
                            new C_Pgudang(new V_PG_Penjualan(), new M_Ikan(),Integer.valueOf(data[0])  );
                            view.dispose();
                        } catch (SQLException ex) {
                            Logger.getLogger(C_Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        try {
                            new C_Supplier(new V_Supplier(), new M_Ikan(), Integer.valueOf(data[0]));
                            view.dispose();
                        } catch (SQLException ex) {
                            Logger.getLogger(C_Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }
    }
}
