/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.Prenda;
import java.util.Vector;

/**
 *
 * @author docente
 */
public class ControlPrenda {
    private static Vector prendas=new Vector();

    /**
     * @return the prendas
     */
    public static Vector getPrendas() {
        return prendas;
    }

    /**
     * @param aPrendas the prendas to set
     */
    public static void setPrendas(Vector aPrendas) {
        prendas = aPrendas;
    }
    
    public static void agregar(Prenda p){
        getPrendas().add(p);
    }
}
