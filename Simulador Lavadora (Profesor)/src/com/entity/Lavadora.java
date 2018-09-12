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
public class Lavadora {
    private String codigo;
    private String marca;
    private int capacidadQuitarSucio;
    private int capacidadAbarcarTela;
    private int capacidadPrendas;

    public Lavadora() {
    }

    public Lavadora(String codigo, String marca, int capacidadQuitarSucio, int capacidadAbarcarTela, int capacidadPrendas) {
        this.codigo = codigo;
        this.marca = marca;
        this.capacidadQuitarSucio = capacidadQuitarSucio;
        this.capacidadAbarcarTela = capacidadAbarcarTela;
        this.capacidadPrendas = capacidadPrendas;
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the capacidadQuitarSucio
     */
    public int getCapacidadQuitarSucio() {
        return capacidadQuitarSucio;
    }

    /**
     * @param capacidadQuitarSucio the capacidadQuitarSucio to set
     */
    public void setCapacidadQuitarSucio(int capacidadQuitarSucio) {
        this.capacidadQuitarSucio = capacidadQuitarSucio;
    }

    /**
     * @return the capacidadAbarcarTela
     */
    public int getCapacidadAbarcarTela() {
        return capacidadAbarcarTela;
    }

    /**
     * @param capacidadAbarcarTela the capacidadAbarcarTela to set
     */
    public void setCapacidadAbarcarTela(int capacidadAbarcarTela) {
        this.capacidadAbarcarTela = capacidadAbarcarTela;
    }

    /**
     * @return the capacidadPrendas
     */
    public int getCapacidadPrendas() {
        return capacidadPrendas;
    }

    /**
     * @param capacidadPrendas the capacidadPrendas to set
     */
    public void setCapacidadPrendas(int capacidadPrendas) {
        this.capacidadPrendas = capacidadPrendas;
    }
}
