package Models;

import java.io.Serializable;

public class Examen implements Serializable{
    
    private String Codigo;
    private int Preguntas;
    private String Area;
    private String Profesor;

    public Examen(String Codigo, int Preguntas, String Area, String Profesor) {
        this.Codigo = Codigo;
        this.Preguntas = Preguntas;
        this.Area = Area;
        this.Profesor = Profesor;
    }

    public String getCodigo() {
        return Codigo;
    }

    public int getPreguntas() {
        return Preguntas;
    }

    public String getArea() {
        return Area;
    }

    public String getProfesor() {
        return Profesor;
    }
    
}
