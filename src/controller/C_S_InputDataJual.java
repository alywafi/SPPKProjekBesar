/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.M_Kriteria;
import view.V_S_InputDataJual;

/**
 *
 * @author USER
 */
public class C_S_InputDataJual {

    V_S_InputDataJual view;
    M_Kriteria model;
    int ID ;

    public C_S_InputDataJual(V_S_InputDataJual v, M_Kriteria m, int id) {
        this.view = v;
        this.model = m ;
        this.ID = id ;
        
        view.setEnabled(true);
    }
}
