/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author docente
 */
public class Prenda {
    private String codigo;
    private String tipo;
    private String color;
    private int nivelsucio;
    private int cantidadtela;
    private double porcentajeLavado;

    public Prenda() {
    }

    public Prenda(String codigo, String tipo, String color, int nivelsucio, int cantidadtela, double porcentajeLavado) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.color = color;
        this.nivelsucio = nivelsucio;
        this.cantidadtela = cantidadtela;
        this.porcentajeLavado = porcentajeLavado;
    }

    
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the nivelsucio
     */
    public int getNivelsucio() {
        return nivelsucio;
    }

    /**
     * @param nivelsucio the nivelsucio to set
     */
    public void setNivelsucio(int nivelsucio) {
        this.nivelsucio = nivelsucio;
    }

    /**
     * @return the cantidadtela
     */
    public int getCantidadtela() {
        return cantidadtela;
    }

    /**
     * @param cantidadtela the cantidadtela to set
     */
    public void setCantidadtela(int cantidadtela) {
        this.cantidadtela = cantidadtela;
    }

    /**
     * @return the porcentajeLavado
     */
    public double getPorcentajeLavado() {
        return porcentajeLavado;
    }

    /**
     * @param porcentajeLavado the porcentajeLavado to set
     */
    public void setPorcentajeLavado(double porcentajeLavado) {
        this.porcentajeLavado = porcentajeLavado;
    }
    
}
