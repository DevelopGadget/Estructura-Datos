/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author E304
 */
public class Cuota {
    
    private int nCuota;
    private double valorCuota;
    private double valorPagar;
    private double Saldo;
    private boolean Pagado;
    Prestamo Prestamo;

    public Cuota(int nCuota, double valorCuota, double valorPagar, double Saldo, boolean Pagado, Prestamo Prestamo) {
        this.nCuota = nCuota;
        this.valorCuota = valorCuota;
        this.valorPagar = valorPagar;
        this.Saldo = Saldo;
        this.Pagado = Pagado;
        this.Prestamo = Prestamo;
    }

    public int getnCuota() {
        return nCuota;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public double getSaldo() {
        return Saldo;
    }

    public boolean isPagado() {
        return Pagado;
    }

    public Prestamo getPrestamo() {
        return Prestamo;
    }

    public void setPagado(boolean Pagado) {
        this.Pagado = Pagado;
    }
    
    
    
}
