/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.M_Kriteria;
import view.V_PG_Keterangan;

/**
 *
 * @author USER
 */
public class C_Keterangan {

    V_PG_Keterangan view;
    M_Kriteria model;

    public C_Keterangan(V_PG_Keterangan v, M_Kriteria m) {
        this.view = v;
        this.model = m;

    }

}
