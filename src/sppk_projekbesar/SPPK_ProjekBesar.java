/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sppk_projekbesar;

import controller.C_Login;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.M_User;
import view.V_login;

/**
 *
 * @author USER
 */
public class SPPK_ProjekBesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        V_login view = new V_login();
        view.showLoading(true);
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException ex) {
            Logger.getLogger(C_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        view.showLoading(false);
        view.dispose();
        C_Login a = new C_Login(new V_login(), new M_User());
    }

}
