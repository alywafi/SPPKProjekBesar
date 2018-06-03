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
public class M_Kriteria {

    koneksi con;

    public M_Kriteria() throws SQLException {

        this.con = new koneksi();

    }

    public DefaultTableModel getKriteria() throws SQLException {
        String kolom[] = {"ID", "Kriteria", "bobot", "tipe nilai", "jenis inputan"};
        DefaultTableModel table = new DefaultTableModel(null, kolom);

        String query = "select * from kriteria ";
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

    public DefaultTableModel getKeterangan(int id) throws SQLException {
        String kolom[] = {"ID", "keterangan", "bobot"};
        DefaultTableModel table = new DefaultTableModel(null, kolom);

        String query = "select * from keterangan where tanggal = '" + id + "'";
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

    public boolean insertKriteria(String data[]) throws SQLException {

        String query = "INSERT INTO `kriteria`(`Kriteria`, `bobot`, `tipe_nilai`, `jenis_inputan`) VALUES ('" + data[0] + "'," + data[1] + "," + data[2] + ",'" + data[3] + "')";
        try {
            con.executeQuery(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertKeterangan(int data[], int IDkrit) throws SQLException {
        int id = IDkrit;
        String query = "INSERT INTO `keterangan`(`kriteria_ID`,`keterangan`,`bobot`) VALUES ('" + id + "','" + data[0] + "','" + data[1] + "')";
        try {
            con.executeQuery(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateKriteria(String[] data, int id) throws SQLException {
        for (int i = 0; i < 3; i++) {
            System.out.println(data[i]);
        }
        System.out.println("id = " + id);
        String query = "UPDATE `kriteria` SET `Kriteria` = '" + data[0] + "' , `bobot` = " + data[1] + ",`tipe_nilai` = " + data[2] + " WHERE kriteria_id= '" + id + "'";
        try {
            con.executeQuery(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateKeterangan(String[] data, int id) throws SQLException {
        String query = "UPDATE `keterangan` SET `keterangan`='" + data[1] + "',`bobot`='" + data[2] + " WHERE id_user= " + id + " ";
        try {
            con.executeQuery(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
