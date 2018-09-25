package Models;

import java.io.Serializable;

public class Estudiante implements Serializable{

    private String Nombre;
    private String Codigo;
    private int Preguntas;
    private double Nota;

    public Estudiante(String Nombre, String Codigo, int Preguntas, double Nota) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Preguntas = Preguntas;
        this.Nota = Nota;
    }

    public Estudiante(String Nombre, String Codigo) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
    }
    
    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getPreguntas() {
        return Preguntas;
    }

    public void setPreguntas(int Preguntas) {
        this.Preguntas = Preguntas;
    }

}
