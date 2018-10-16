package Modelo;

import java.io.Serializable;

public class Mercancia implements Serializable{
    
    private String Codigo;
    private String Nombre;
    private String Color;
    private String Estado;
    private String FechaSalida;
    private String FechaInspeccion;
    private String FechaRevision;
    private String FechaImportacion;
    private double Peso;
    private double Altura;
    private double Ancho;

    public Mercancia(String Codigo, String Nombre, String Color, String Estado, String FechaSalida, String FechaInspeccion, String FechaRevision, String FechaImportacion, double Peso, double Altura, double Ancho) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Color = Color;
        this.Estado = Estado;
        this.FechaSalida = FechaSalida;
        this.FechaInspeccion = FechaInspeccion;
        this.FechaRevision = FechaRevision;
        this.FechaImportacion = FechaImportacion;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Ancho = Ancho;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getFechaInspeccion() {
        return FechaInspeccion;
    }

    public void setFechaInspeccion(String FechaInspeccion) {
        this.FechaInspeccion = FechaInspeccion;
    }

    public String getFechaRevision() {
        return FechaRevision;
    }

    public void setFechaRevision(String FechaRevision) {
        this.FechaRevision = FechaRevision;
    }

    public String getFechaImportacion() {
        return FechaImportacion;
    }

    public void setFechaImportacion(String FechaImportacion) {
        this.FechaImportacion = FechaImportacion;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }
    
}
