package Models;

import java.util.Date;

public class Jugador {

    private String Nombre;
    private String Posicion;
    private Date Fecha;
    private int Estatura;

    public Jugador(String Nombre, String Posicion, Date Fecha, int Estatura) {
        this.Nombre = Nombre;
        this.Posicion = Posicion;
        this.Fecha = Fecha;
        this.Estatura = Estatura;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPosicion() {
        return Posicion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public int getEstatura() {
        return Estatura;
    }
    
    public int Edad(){
        return new Date().getYear() - Fecha.getYear();
    }
}
