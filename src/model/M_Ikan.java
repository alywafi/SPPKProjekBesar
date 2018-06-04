/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class M_Ikan {

    koneksi con;

    public M_Ikan() throws SQLException {

        this.con = new koneksi();

    }

    public DefaultTableModel getData() throws SQLException {
        String kolom[] = {"ID", "ID Penjual", "tanggal", "Jumlah", "bau", "mata", "insang", "badan", "daging", "perut"};
        DefaultTableModel table = new DefaultTableModel(null, kolom);

        String query = "select * from ikan ";
        ResultSet rs = con.getResult(query);

        while (rs.next()) {
            String row[] = new String[kolom.length];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getString(i + 1);
            }
            table.addRow(row);
        }

        return table;
    }

    public DefaultTableModel getDataHariIni() throws SQLException {
        String kolom[] = {"ID", "ID Penjual", "tanggal", "Jumlah", "bau", "mata", "insang", "badan", "daging", "perut", "skor"};
        DefaultTableModel table = new DefaultTableModel(null, kolom);

        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Date a = new Date();
        String tang = date.format(a);

        String query = "select * from ikan where tanggal = '" + tang + "'";
        ResultSet rs = con.getResult(query);

        while (rs.next()) {
            String row[] = new String[kolom.length];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getString(i + 1);
            }
            table.addRow(row);
        }

        return table;
    }

    public float[][] getDataMoora() throws SQLException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Date a = new Date();
        String tang = date.format(a);

        int c = 0;
        String query1 = "select Ikan_ID from ikan where tanggal = '" + tang + "'";
        ResultSet rs1 = con.getResult(query1);
        while (rs1.next()) {
            c++;

        }
        float[][] data = new float[c][7];

        String query = "select Ikan_ID , bau , mata , insang , badan , daging , perut from ikan where tanggal = '" + tang + "'";
        ResultSet rs = con.getResult(query);

        int penanda = 0;
        while (rs.next()) {
            for (int i = 0; i < 7; i++) {
                data[penanda][i] = rs.getFloat(i + 1);
            }
            penanda++;
        }
        return data;

    }

    public boolean updateSkor(Float skor, int id) throws SQLException {
        String query = "UPDATE `ikan` SET `Skor` = " + skor + " WHERE Ikan_ID = " + id ;
        try {
            con.executeQuery(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public DefaultTableModel getDataWithID(int id) throws SQLException {
        String kolom[] = {"ID", "ID Penjual", "tanggal", "Jumlah", "bau", "mata", "insang", "badan", "daging", "perut", "skor"};
        DefaultTableModel table = new DefaultTableModel(null, kolom);

        String query = "select * from ikan where User_ID = '" + id + "'";
        ResultSet rs = con.getResult(query);

        while (rs.next()) {
            String row[] = new String[11];
            for (int i = 0; i < row.length; i++) {
                row[i] = rs.getString(i + 1);
            }
            table.addRow(row);
        }

        return table;
    }

    public boolean insertData(float data[]) throws SQLException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Date a = new Date();
        String tang = date.format(a);
        String query = "INSERT INTO `ikan`(`User_ID`,`tanggal`,`jumlah`, `Bau`, `Mata` , `insang` , `Badan` , `daging` , `perut` ) VALUES ('" + data[0] + "','" + tang + "','" + data[2]
                + "','" + data[3] + "','" + data[4] + "','" + data[5] + "','" + data[6] + "','" + data[7] + "','" + data[8] + "')";
        try {
            con.executeQuery(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertBeli(int data[]) throws SQLException {
        String query = "INSERT INTO `transaksi`(`Supplier`,`pgudang`) VALUES ('" + data[0] + "','" + data[1] + "')";
        try {
            con.executeQuery(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
