/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USER
 */
public class M_User {
    koneksi con ;
    public M_User() throws SQLException{
     this.con = new koneksi();
        
    }
   public String[] getID(String nama) throws SQLException {
        String data[] = new String[4];
        String query = "select * from user where nama = '" + nama + "'";
        ResultSet rs = con.getResult(query);
        if (rs.next()) {
            for (int i = 0; i < data.length; i++) {
                data[i] = rs.getString(i + 1);
            }
        }
        return data;
    }
   

}
