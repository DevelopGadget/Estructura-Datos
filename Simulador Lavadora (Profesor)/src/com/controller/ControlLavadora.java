/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.Lavadora;
import java.util.Vector;

/**
 *
 * @author docente
 */
public class ControlLavadora {
    private static Vector lavadoras=new Vector();
    
    
    public static void agregarL(Lavadora l){
        getLavadoras().add(l);
    }

    /**
     * @return the lavadoras
     */
    public static Vector getLavadoras() {
        return lavadoras;
    }

    /**
     * @param aLavadoras the lavadoras to set
     */
    public static void setLavadoras(Vector aLavadoras) {
        lavadoras = aLavadoras;
    }
    
    public static Lavadora consultar(String cod){
        Lavadora la=null;
        for(int i=0;i<getLavadoras().size();i++){//recorrer todas las lavadoras
            Lavadora l=(Lavadora)getLavadoras().get(i);
            if(l.getCodigo().equals(cod)){//si el codigo de la lavadora es = a cod esntonces lo retorno
                la=l;
            }            
        }return la;
    }
    
}
